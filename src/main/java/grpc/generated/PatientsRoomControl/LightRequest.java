// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PatientsRoomControl.proto

package grpc.generated.PatientsRoomControl;

/**
 * <pre>
 * for the light setting
 * </pre>
 *
 * Protobuf type {@code PatientsRoomControl.LightRequest}
 */
public  final class LightRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PatientsRoomControl.LightRequest)
    LightRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightRequest.newBuilder() to construct.
  private LightRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightRequest() {
    lightRequest_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LightRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            lightRequest_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_LightRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_LightRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.generated.PatientsRoomControl.LightRequest.class, grpc.generated.PatientsRoomControl.LightRequest.Builder.class);
  }

  public static final int LIGHT_REQUEST_FIELD_NUMBER = 1;
  private int lightRequest_;
  /**
   * <code>int32 light_request = 1;</code>
   */
  public int getLightRequest() {
    return lightRequest_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (lightRequest_ != 0) {
      output.writeInt32(1, lightRequest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lightRequest_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, lightRequest_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.generated.PatientsRoomControl.LightRequest)) {
      return super.equals(obj);
    }
    grpc.generated.PatientsRoomControl.LightRequest other = (grpc.generated.PatientsRoomControl.LightRequest) obj;

    boolean result = true;
    result = result && (getLightRequest()
        == other.getLightRequest());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LIGHT_REQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getLightRequest();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generated.PatientsRoomControl.LightRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.generated.PatientsRoomControl.LightRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * for the light setting
   * </pre>
   *
   * Protobuf type {@code PatientsRoomControl.LightRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PatientsRoomControl.LightRequest)
      grpc.generated.PatientsRoomControl.LightRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_LightRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_LightRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.generated.PatientsRoomControl.LightRequest.class, grpc.generated.PatientsRoomControl.LightRequest.Builder.class);
    }

    // Construct using grpc.generated.PatientsRoomControl.LightRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      lightRequest_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_LightRequest_descriptor;
    }

    @java.lang.Override
    public grpc.generated.PatientsRoomControl.LightRequest getDefaultInstanceForType() {
      return grpc.generated.PatientsRoomControl.LightRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.generated.PatientsRoomControl.LightRequest build() {
      grpc.generated.PatientsRoomControl.LightRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.generated.PatientsRoomControl.LightRequest buildPartial() {
      grpc.generated.PatientsRoomControl.LightRequest result = new grpc.generated.PatientsRoomControl.LightRequest(this);
      result.lightRequest_ = lightRequest_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.generated.PatientsRoomControl.LightRequest) {
        return mergeFrom((grpc.generated.PatientsRoomControl.LightRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.generated.PatientsRoomControl.LightRequest other) {
      if (other == grpc.generated.PatientsRoomControl.LightRequest.getDefaultInstance()) return this;
      if (other.getLightRequest() != 0) {
        setLightRequest(other.getLightRequest());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.generated.PatientsRoomControl.LightRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.generated.PatientsRoomControl.LightRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lightRequest_ ;
    /**
     * <code>int32 light_request = 1;</code>
     */
    public int getLightRequest() {
      return lightRequest_;
    }
    /**
     * <code>int32 light_request = 1;</code>
     */
    public Builder setLightRequest(int value) {
      
      lightRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 light_request = 1;</code>
     */
    public Builder clearLightRequest() {
      
      lightRequest_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PatientsRoomControl.LightRequest)
  }

  // @@protoc_insertion_point(class_scope:PatientsRoomControl.LightRequest)
  private static final grpc.generated.PatientsRoomControl.LightRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.generated.PatientsRoomControl.LightRequest();
  }

  public static grpc.generated.PatientsRoomControl.LightRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightRequest>
      PARSER = new com.google.protobuf.AbstractParser<LightRequest>() {
    @java.lang.Override
    public LightRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LightRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LightRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.generated.PatientsRoomControl.LightRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

