// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_data.proto

package com.google.bigtable.v1;

public final class BigtableDataProto {
  private BigtableDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Row_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Row_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Family_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Family_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Column_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Column_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Cell_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Cell_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_RowRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_RowRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_RowSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_RowSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_ColumnRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_ColumnRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_TimestampRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_TimestampRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_ValueRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_ValueRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_RowFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_RowFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_RowFilter_Chain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_RowFilter_Chain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_RowFilter_Interleave_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_RowFilter_Interleave_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_RowFilter_Condition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_RowFilter_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Mutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Mutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Mutation_SetCell_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Mutation_SetCell_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Mutation_DeleteFromColumn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Mutation_DeleteFromColumn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Mutation_DeleteFromFamily_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Mutation_DeleteFromFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_Mutation_DeleteFromRow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_Mutation_DeleteFromRow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_v1_ReadModifyWriteRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_v1_ReadModifyWriteRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/bigtable/v1/bigtable_data.proto" +
      "\022\022google.bigtable.v1\"@\n\003Row\022\013\n\003key\030\001 \001(\014" +
      "\022,\n\010families\030\002 \003(\0132\032.google.bigtable.v1." +
      "Family\"C\n\006Family\022\014\n\004name\030\001 \001(\t\022+\n\007column" +
      "s\030\002 \003(\0132\032.google.bigtable.v1.Column\"D\n\006C" +
      "olumn\022\021\n\tqualifier\030\001 \001(\014\022\'\n\005cells\030\002 \003(\0132" +
      "\030.google.bigtable.v1.Cell\"?\n\004Cell\022\030\n\020tim" +
      "estamp_micros\030\001 \001(\003\022\r\n\005value\030\002 \001(\014\022\016\n\006la" +
      "bels\030\003 \003(\t\".\n\010RowRange\022\021\n\tstart_key\030\002 \001(" +
      "\014\022\017\n\007end_key\030\003 \001(\014\"L\n\006RowSet\022\020\n\010row_keys",
      "\030\001 \003(\014\0220\n\nrow_ranges\030\002 \003(\0132\034.google.bigt" +
      "able.v1.RowRange\"\326\001\n\013ColumnRange\022\023\n\013fami" +
      "ly_name\030\001 \001(\t\022#\n\031start_qualifier_inclusi" +
      "ve\030\002 \001(\014H\000\022#\n\031start_qualifier_exclusive\030" +
      "\003 \001(\014H\000\022!\n\027end_qualifier_inclusive\030\004 \001(\014" +
      "H\001\022!\n\027end_qualifier_exclusive\030\005 \001(\014H\001B\021\n" +
      "\017start_qualifierB\017\n\rend_qualifier\"N\n\016Tim" +
      "estampRange\022\036\n\026start_timestamp_micros\030\001 " +
      "\001(\003\022\034\n\024end_timestamp_micros\030\002 \001(\003\"\250\001\n\nVa" +
      "lueRange\022\037\n\025start_value_inclusive\030\001 \001(\014H",
      "\000\022\037\n\025start_value_exclusive\030\002 \001(\014H\000\022\035\n\023en" +
      "d_value_inclusive\030\003 \001(\014H\001\022\035\n\023end_value_e" +
      "xclusive\030\004 \001(\014H\001B\r\n\013start_valueB\013\n\tend_v" +
      "alue\"\337\010\n\tRowFilter\0224\n\005chain\030\001 \001(\0132#.goog" +
      "le.bigtable.v1.RowFilter.ChainH\000\022>\n\ninte" +
      "rleave\030\002 \001(\0132(.google.bigtable.v1.RowFil" +
      "ter.InterleaveH\000\022<\n\tcondition\030\003 \001(\0132\'.go" +
      "ogle.bigtable.v1.RowFilter.ConditionH\000\022\016" +
      "\n\004sink\030\020 \001(\010H\000\022\031\n\017pass_all_filter\030\021 \001(\010H" +
      "\000\022\032\n\020block_all_filter\030\022 \001(\010H\000\022\036\n\024row_key",
      "_regex_filter\030\004 \001(\014H\000\022\033\n\021row_sample_filt" +
      "er\030\016 \001(\001H\000\022\"\n\030family_name_regex_filter\030\005" +
      " \001(\tH\000\022\'\n\035column_qualifier_regex_filter\030" +
      "\006 \001(\014H\000\022>\n\023column_range_filter\030\007 \001(\0132\037.g" +
      "oogle.bigtable.v1.ColumnRangeH\000\022D\n\026times" +
      "tamp_range_filter\030\010 \001(\0132\".google.bigtabl" +
      "e.v1.TimestampRangeH\000\022\034\n\022value_regex_fil" +
      "ter\030\t \001(\014H\000\022<\n\022value_range_filter\030\017 \001(\0132" +
      "\036.google.bigtable.v1.ValueRangeH\000\022%\n\033cel" +
      "ls_per_row_offset_filter\030\n \001(\005H\000\022$\n\032cell",
      "s_per_row_limit_filter\030\013 \001(\005H\000\022\'\n\035cells_" +
      "per_column_limit_filter\030\014 \001(\005H\000\022!\n\027strip" +
      "_value_transformer\030\r \001(\010H\000\022!\n\027apply_labe" +
      "l_transformer\030\023 \001(\tH\000\0327\n\005Chain\022.\n\007filter" +
      "s\030\001 \003(\0132\035.google.bigtable.v1.RowFilter\032<" +
      "\n\nInterleave\022.\n\007filters\030\001 \003(\0132\035.google.b" +
      "igtable.v1.RowFilter\032\255\001\n\tCondition\0227\n\020pr" +
      "edicate_filter\030\001 \001(\0132\035.google.bigtable.v" +
      "1.RowFilter\0222\n\013true_filter\030\002 \001(\0132\035.googl" +
      "e.bigtable.v1.RowFilter\0223\n\014false_filter\030",
      "\003 \001(\0132\035.google.bigtable.v1.RowFilterB\010\n\006" +
      "filter\"\311\004\n\010Mutation\0228\n\010set_cell\030\001 \001(\0132$." +
      "google.bigtable.v1.Mutation.SetCellH\000\022K\n" +
      "\022delete_from_column\030\002 \001(\0132-.google.bigta" +
      "ble.v1.Mutation.DeleteFromColumnH\000\022K\n\022de" +
      "lete_from_family\030\003 \001(\0132-.google.bigtable" +
      ".v1.Mutation.DeleteFromFamilyH\000\022E\n\017delet" +
      "e_from_row\030\004 \001(\0132*.google.bigtable.v1.Mu" +
      "tation.DeleteFromRowH\000\032a\n\007SetCell\022\023\n\013fam" +
      "ily_name\030\001 \001(\t\022\030\n\020column_qualifier\030\002 \001(\014",
      "\022\030\n\020timestamp_micros\030\003 \001(\003\022\r\n\005value\030\004 \001(" +
      "\014\032y\n\020DeleteFromColumn\022\023\n\013family_name\030\001 \001" +
      "(\t\022\030\n\020column_qualifier\030\002 \001(\014\0226\n\ntime_ran" +
      "ge\030\003 \001(\0132\".google.bigtable.v1.TimestampR" +
      "ange\032\'\n\020DeleteFromFamily\022\023\n\013family_name\030" +
      "\001 \001(\t\032\017\n\rDeleteFromRowB\n\n\010mutation\"\200\001\n\023R" +
      "eadModifyWriteRule\022\023\n\013family_name\030\001 \001(\t\022" +
      "\030\n\020column_qualifier\030\002 \001(\014\022\026\n\014append_valu" +
      "e\030\003 \001(\014H\000\022\032\n\020increment_amount\030\004 \001(\003H\000B\006\n" +
      "\004ruleB-\n\026com.google.bigtable.v1B\021Bigtabl",
      "eDataProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_bigtable_v1_Row_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_v1_Row_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Row_descriptor,
        new java.lang.String[] { "Key", "Families", });
    internal_static_google_bigtable_v1_Family_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_v1_Family_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Family_descriptor,
        new java.lang.String[] { "Name", "Columns", });
    internal_static_google_bigtable_v1_Column_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_v1_Column_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Column_descriptor,
        new java.lang.String[] { "Qualifier", "Cells", });
    internal_static_google_bigtable_v1_Cell_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_v1_Cell_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Cell_descriptor,
        new java.lang.String[] { "TimestampMicros", "Value", "Labels", });
    internal_static_google_bigtable_v1_RowRange_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_bigtable_v1_RowRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_RowRange_descriptor,
        new java.lang.String[] { "StartKey", "EndKey", });
    internal_static_google_bigtable_v1_RowSet_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_bigtable_v1_RowSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_RowSet_descriptor,
        new java.lang.String[] { "RowKeys", "RowRanges", });
    internal_static_google_bigtable_v1_ColumnRange_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_bigtable_v1_ColumnRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_ColumnRange_descriptor,
        new java.lang.String[] { "FamilyName", "StartQualifierInclusive", "StartQualifierExclusive", "EndQualifierInclusive", "EndQualifierExclusive", "StartQualifier", "EndQualifier", });
    internal_static_google_bigtable_v1_TimestampRange_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_bigtable_v1_TimestampRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_TimestampRange_descriptor,
        new java.lang.String[] { "StartTimestampMicros", "EndTimestampMicros", });
    internal_static_google_bigtable_v1_ValueRange_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_bigtable_v1_ValueRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_ValueRange_descriptor,
        new java.lang.String[] { "StartValueInclusive", "StartValueExclusive", "EndValueInclusive", "EndValueExclusive", "StartValue", "EndValue", });
    internal_static_google_bigtable_v1_RowFilter_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_bigtable_v1_RowFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_RowFilter_descriptor,
        new java.lang.String[] { "Chain", "Interleave", "Condition", "Sink", "PassAllFilter", "BlockAllFilter", "RowKeyRegexFilter", "RowSampleFilter", "FamilyNameRegexFilter", "ColumnQualifierRegexFilter", "ColumnRangeFilter", "TimestampRangeFilter", "ValueRegexFilter", "ValueRangeFilter", "CellsPerRowOffsetFilter", "CellsPerRowLimitFilter", "CellsPerColumnLimitFilter", "StripValueTransformer", "ApplyLabelTransformer", "Filter", });
    internal_static_google_bigtable_v1_RowFilter_Chain_descriptor =
      internal_static_google_bigtable_v1_RowFilter_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_v1_RowFilter_Chain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_RowFilter_Chain_descriptor,
        new java.lang.String[] { "Filters", });
    internal_static_google_bigtable_v1_RowFilter_Interleave_descriptor =
      internal_static_google_bigtable_v1_RowFilter_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_v1_RowFilter_Interleave_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_RowFilter_Interleave_descriptor,
        new java.lang.String[] { "Filters", });
    internal_static_google_bigtable_v1_RowFilter_Condition_descriptor =
      internal_static_google_bigtable_v1_RowFilter_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_v1_RowFilter_Condition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_RowFilter_Condition_descriptor,
        new java.lang.String[] { "PredicateFilter", "TrueFilter", "FalseFilter", });
    internal_static_google_bigtable_v1_Mutation_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_bigtable_v1_Mutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Mutation_descriptor,
        new java.lang.String[] { "SetCell", "DeleteFromColumn", "DeleteFromFamily", "DeleteFromRow", "Mutation", });
    internal_static_google_bigtable_v1_Mutation_SetCell_descriptor =
      internal_static_google_bigtable_v1_Mutation_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_v1_Mutation_SetCell_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Mutation_SetCell_descriptor,
        new java.lang.String[] { "FamilyName", "ColumnQualifier", "TimestampMicros", "Value", });
    internal_static_google_bigtable_v1_Mutation_DeleteFromColumn_descriptor =
      internal_static_google_bigtable_v1_Mutation_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_v1_Mutation_DeleteFromColumn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Mutation_DeleteFromColumn_descriptor,
        new java.lang.String[] { "FamilyName", "ColumnQualifier", "TimeRange", });
    internal_static_google_bigtable_v1_Mutation_DeleteFromFamily_descriptor =
      internal_static_google_bigtable_v1_Mutation_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_v1_Mutation_DeleteFromFamily_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Mutation_DeleteFromFamily_descriptor,
        new java.lang.String[] { "FamilyName", });
    internal_static_google_bigtable_v1_Mutation_DeleteFromRow_descriptor =
      internal_static_google_bigtable_v1_Mutation_descriptor.getNestedTypes().get(3);
    internal_static_google_bigtable_v1_Mutation_DeleteFromRow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_Mutation_DeleteFromRow_descriptor,
        new java.lang.String[] { });
    internal_static_google_bigtable_v1_ReadModifyWriteRule_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_bigtable_v1_ReadModifyWriteRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_bigtable_v1_ReadModifyWriteRule_descriptor,
        new java.lang.String[] { "FamilyName", "ColumnQualifier", "AppendValue", "IncrementAmount", "Rule", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
