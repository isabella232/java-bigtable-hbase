/*
 * Copyright (c) 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.anviltop.hbase.adapters;

import com.google.bigtable.anviltop.AnviltopServices.GetRowRequest;
import com.google.cloud.anviltop.hbase.DataGenerationHelper;
import com.google.protobuf.ByteString;

import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RunWith(JUnit4.class)
public class TestGetAdapter {
  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  protected GetAdapter getAdapter = new GetAdapter();
  protected DataGenerationHelper dataHelper = new DataGenerationHelper();

  private Get makeValidGet(byte[] rowKey) throws IOException {
    Get get = new Get(rowKey);
    get.setMaxVersions(Integer.MAX_VALUE);
    return get;
  }

  @Test
  public void testBasicRowKeyGet() throws IOException {
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);
    ByteString adaptedRowKey = rowRequestBuilder.getRowKey();
    Assert.assertArrayEquals(rowKey, adaptedRowKey.toByteArray());
  }

  @Test
  public void testGetWithSingleColumnFamily() throws IOException {
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    byte[] family1 = Bytes.toBytes("family1");
    get.addFamily(family1);

    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);

    Assert.assertEquals("(col({family1:\\C*}, ALL))", rowRequestBuilder.getFilter());
  }

  @Test
  public void testGetWithMultipleColumnFamily() throws IOException {
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    byte[] family1 = Bytes.toBytes("family1");
    get.addFamily(family1);
    byte[] family2 = Bytes.toBytes("family2");
    get.addFamily(family2);

    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);

    Assert.assertEquals("(col({family1:\\C*}, ALL))+(col({family2:\\C*}, ALL))",
        rowRequestBuilder.getFilter());
  }

  @Test
  public void testTimestampLimitsAreApplied() throws IOException {
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    byte[] family1 = Bytes.toBytes("family1");
    get.addFamily(family1);
    byte[] family2 = Bytes.toBytes("family2");
    get.addFamily(family2);
    get.setTimeRange(1000, 2000);

    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);

    Assert.assertEquals(
        "(col({family1:\\C*}, ALL) | ts(1000000, 1999000))" +
            "+(col({family2:\\C*}, ALL) | ts(1000000, 1999000))",
        rowRequestBuilder.getFilter());
  }

  @Test
  public void testMaxVersionsIsApplied() throws IOException {
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    byte[] family1 = Bytes.toBytes("family1");
    get.addFamily(family1);
    byte[] family2 = Bytes.toBytes("family2");
    get.addFamily(family2);
    get.setMaxVersions(1);
    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);

    Assert.assertEquals(
        "(col({family1:\\C*}, 1))+(col({family2:\\C*}, 1))",
        rowRequestBuilder.getFilter());
  }

  @Test
  public void testMultipleFamiliesSomeWithQualifiersSpecified() throws IOException {
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    get.addFamily(Bytes.toBytes("family1"));
    get.addColumn(Bytes.toBytes("family2"), Bytes.toBytes("qualifier1"));
    get.setMaxVersions(1);
    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);

    Assert.assertEquals(
        "(col({family1:\\C*}, 1))+(col({family2:qualifier1}, 1))",
        rowRequestBuilder.getFilter());
  }

  @Test
  public void testBinaryColumnNamesAreQuoted() throws IOException {
    String utf8Part = "☺"; // UTF-8: 0x9e, 0xe8, 0xc6
    String asciiPart = "asdf"; // UTF-8: 0x61, 0x73, 0x64, 0x66
    byte nullByte = 0x00;
    String specialCharacters = "\\[]().*"; // UTF-8: 0x5c, 0x5b, 0x5d, 0x28, 0x29, 0x2e, 0x2a
    ByteArrayOutputStream qualifierBuilder = new ByteArrayOutputStream();
    qualifierBuilder.write(Bytes.toBytes(utf8Part));
    qualifierBuilder.write(Bytes.toBytes(asciiPart));
    qualifierBuilder.write(nullByte);
    qualifierBuilder.write(Bytes.toBytes(specialCharacters));
    byte[] rowKey = dataHelper.randomData("rk1-");
    Get get = makeValidGet(rowKey);
    get.addColumn(Bytes.toBytes("f1"), qualifierBuilder.toByteArray());
    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);

    ByteArrayOutputStream expectedFilterBuilder = new ByteArrayOutputStream();
    expectedFilterBuilder.write(Bytes.toBytes("(col({f1:"));
    expectedFilterBuilder.write(Bytes.toBytes(utf8Part)); // Only ASCII characters need escaping
    expectedFilterBuilder.write(Bytes.toBytes(asciiPart)); // Leave a-z intact
    expectedFilterBuilder.write(Bytes.toBytes("\\x00")); // null byte
    expectedFilterBuilder.write(
        Bytes.toBytes("\\\\\\[\\]\\(\\)\\.\\*")); // Escape each in special characters
    expectedFilterBuilder.write(Bytes.toBytes("}, ALL))"));
    Assert.assertArrayEquals(
        expectedFilterBuilder.toByteArray(),
        rowRequestBuilder.getFilterBytes().toByteArray());
  }

  @Test
  public void testBigtableReaderSpecialCharactersAreQuoted() throws IOException {
    String family = "f1";
    String qualifier = "foo }{ @";

    Get get = makeValidGet(dataHelper.randomData("special"));
    get.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier));
    GetRowRequest.Builder rowRequestBuilder = getAdapter.adapt(get);
    Assert.assertEquals("(col({f1:foo\\ \\@}\\@{\\ \\@@}, ALL))", rowRequestBuilder.getFilter());
  }

  @Test
  public void testMaxCellsPerColumnFamilyIsNotSupported() throws IOException {
    Get get = makeValidGet(dataHelper.randomData("rk1-"));
    get.setMaxResultsPerColumnFamily(10);

    expectedException.expect(UnsupportedOperationException.class);
    expectedException.expectMessage("Limiting of max results per column family is not supported");

    getAdapter.adapt(get);
  }

  @Test
  public void testFiltersAreNotSupported() throws IOException {
    Get get = makeValidGet(dataHelper.randomData("rk1-"));
    get.setFilter(
        new SingleColumnValueFilter(
          Bytes.toBytes("family1"),
          Bytes.toBytes("qualifier1"),
          CompareOp.EQUAL,
          Bytes.toBytes("someValue")));

    expectedException.expect(UnsupportedOperationException.class);
    expectedException.expectMessage("Filters are not supported.");

    getAdapter.adapt(get);
  }
}
