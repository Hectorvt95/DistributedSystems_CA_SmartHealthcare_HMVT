// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PatientsRoomControl.proto

package grpc.generated.PatientsRoomControl;

public final class PatientsRoomControlImpl {
  private PatientsRoomControlImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatientsRoomControl_LightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatientsRoomControl_LightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatientsRoomControl_LightResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatientsRoomControl_LightResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatientsRoomControl_HeightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatientsRoomControl_HeightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatientsRoomControl_HeightResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatientsRoomControl_HeightResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatientsRoomControl_GapRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatientsRoomControl_GapRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PatientsRoomControl_GapResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PatientsRoomControl_GapResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031PatientsRoomControl.proto\022\023PatientsRoo" +
      "mControl\"%\n\014LightRequest\022\025\n\rlight_reques" +
      "t\030\001 \001(\005\"\'\n\rLightResponse\022\026\n\016light_respon" +
      "se\030\001 \001(\t\"\'\n\rHeightRequest\022\026\n\016height_requ" +
      "est\030\001 \001(\005\")\n\016HeightResponse\022\027\n\017height_re" +
      "sponse\030\001 \001(\t\"\'\n\nGapRequest\022\031\n\021courtains_" +
      "request\030\001 \001(\005\")\n\013GapResponse\022\032\n\022courtain" +
      "s_response\030\001 \001(\t2\233\002\n\023PatientsRoomControl" +
      "\022W\n\014LightControl\022!.PatientsRoomControl.L" +
      "ightRequest\032\".PatientsRoomControl.LightR" +
      "esponse\"\000\022V\n\tBedHeight\022\".PatientsRoomCon" +
      "trol.HeightRequest\032#.PatientsRoomControl" +
      ".HeightResponse\"\000\022S\n\014CourtainsGap\022\037.Pati" +
      "entsRoomControl.GapRequest\032 .PatientsRoo" +
      "mControl.GapResponse\"\000B?\n\"grpc.generated" +
      ".PatientsRoomControlB\027PatientsRoomContro" +
      "lImplP\001b\006proto3"
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
    internal_static_PatientsRoomControl_LightRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PatientsRoomControl_LightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatientsRoomControl_LightRequest_descriptor,
        new java.lang.String[] { "LightRequest", });
    internal_static_PatientsRoomControl_LightResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PatientsRoomControl_LightResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatientsRoomControl_LightResponse_descriptor,
        new java.lang.String[] { "LightResponse", });
    internal_static_PatientsRoomControl_HeightRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_PatientsRoomControl_HeightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatientsRoomControl_HeightRequest_descriptor,
        new java.lang.String[] { "HeightRequest", });
    internal_static_PatientsRoomControl_HeightResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_PatientsRoomControl_HeightResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatientsRoomControl_HeightResponse_descriptor,
        new java.lang.String[] { "HeightResponse", });
    internal_static_PatientsRoomControl_GapRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_PatientsRoomControl_GapRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatientsRoomControl_GapRequest_descriptor,
        new java.lang.String[] { "CourtainsRequest", });
    internal_static_PatientsRoomControl_GapResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_PatientsRoomControl_GapResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PatientsRoomControl_GapResponse_descriptor,
        new java.lang.String[] { "CourtainsResponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
