// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoomKeyControls.proto

package grpc.generated.RoomKeyControls;

public final class RoomKeyControlsImpl {
  private RoomKeyControlsImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoomKeyControls_RoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoomKeyControls_RoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoomKeyControls_RoomConditions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoomKeyControls_RoomConditions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025RoomKeyControls.proto\022\017RoomKeyControls" +
      "\" \n\013RoomRequest\022\021\n\troom_name\030\001 \001(\t\"0\n\016Ro" +
      "omConditions\022\014\n\004temp\030\001 \001(\005\022\020\n\010humidity\030\002" +
      " \001(\0052o\n\017RoomKeyControls\022\\\n\025RoomControlCo" +
      "nditions\022\034.RoomKeyControls.RoomRequest\032\037" +
      ".RoomKeyControls.RoomConditions\"\000(\0010\001B7\n" +
      "\036grpc.generated.RoomKeyControlsB\023RoomKey" +
      "ControlsImplP\001b\006proto3"
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
    internal_static_RoomKeyControls_RoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoomKeyControls_RoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoomKeyControls_RoomRequest_descriptor,
        new java.lang.String[] { "RoomName", });
    internal_static_RoomKeyControls_RoomConditions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RoomKeyControls_RoomConditions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoomKeyControls_RoomConditions_descriptor,
        new java.lang.String[] { "Temp", "Humidity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
