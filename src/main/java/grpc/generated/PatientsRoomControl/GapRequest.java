// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PatientsRoomControl.proto

package grpc.generated.PatientsRoomControl;

/**
 * <pre>
 * for the courtainsGap
 * </pre>
 *
 * Protobuf type {@code PatientsRoomControl.GapRequest}
 */
public  final class GapRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PatientsRoomControl.GapRequest)
    GapRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GapRequest.newBuilder() to construct.
  private GapRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GapRequest() {
    courtainsRequest_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GapRequest(
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

            courtainsRequest_ = input.readInt32();
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
    return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_GapRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_GapRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.generated.PatientsRoomControl.GapRequest.class, grpc.generated.PatientsRoomControl.GapRequest.Builder.class);
  }

  public static final int COURTAINS_REQUEST_FIELD_NUMBER = 1;
  private int courtainsRequest_;
  /**
   * <code>int32 courtains_request = 1;</code>
   */
  public int getCourtainsRequest() {
    return courtainsRequest_;
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
    if (courtainsRequest_ != 0) {
      output.writeInt32(1, courtainsRequest_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (courtainsRequest_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, courtainsRequest_);
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
    if (!(obj instanceof grpc.generated.PatientsRoomControl.GapRequest)) {
      return super.equals(obj);
    }
    grpc.generated.PatientsRoomControl.GapRequest other = (grpc.generated.PatientsRoomControl.GapRequest) obj;

    boolean result = true;
    result = result && (getCourtainsRequest()
        == other.getCourtainsRequest());
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
    hash = (37 * hash) + COURTAINS_REQUEST_FIELD_NUMBER;
    hash = (53 * hash) + getCourtainsRequest();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generated.PatientsRoomControl.GapRequest parseFrom(
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
  public static Builder newBuilder(grpc.generated.PatientsRoomControl.GapRequest prototype) {
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
   * for the courtainsGap
   * </pre>
   *
   * Protobuf type {@code PatientsRoomControl.GapRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PatientsRoomControl.GapRequest)
      grpc.generated.PatientsRoomControl.GapRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_GapRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_GapRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.generated.PatientsRoomControl.GapRequest.class, grpc.generated.PatientsRoomControl.GapRequest.Builder.class);
    }

    // Construct using grpc.generated.PatientsRoomControl.GapRequest.newBuilder()
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
      courtainsRequest_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.generated.PatientsRoomControl.PatientsRoomControlImpl.internal_static_PatientsRoomControl_GapRequest_descriptor;
    }

    @java.lang.Override
    public grpc.generated.PatientsRoomControl.GapRequest getDefaultInstanceForType() {
      return grpc.generated.PatientsRoomControl.GapRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.generated.PatientsRoomControl.GapRequest build() {
      grpc.generated.PatientsRoomControl.GapRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.generated.PatientsRoomControl.GapRequest buildPartial() {
      grpc.generated.PatientsRoomControl.GapRequest result = new grpc.generated.PatientsRoomControl.GapRequest(this);
      result.courtainsRequest_ = courtainsRequest_;
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
      if (other instanceof grpc.generated.PatientsRoomControl.GapRequest) {
        return mergeFrom((grpc.generated.PatientsRoomControl.GapRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.generated.PatientsRoomControl.GapRequest other) {
      if (other == grpc.generated.PatientsRoomControl.GapRequest.getDefaultInstance()) return this;
      if (other.getCourtainsRequest() != 0) {
        setCourtainsRequest(other.getCourtainsRequest());
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
      grpc.generated.PatientsRoomControl.GapRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.generated.PatientsRoomControl.GapRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int courtainsRequest_ ;
    /**
     * <code>int32 courtains_request = 1;</code>
     */
    public int getCourtainsRequest() {
      return courtainsRequest_;
    }
    /**
     * <code>int32 courtains_request = 1;</code>
     */
    public Builder setCourtainsRequest(int value) {
      
      courtainsRequest_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 courtains_request = 1;</code>
     */
    public Builder clearCourtainsRequest() {
      
      courtainsRequest_ = 0;
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


    // @@protoc_insertion_point(builder_scope:PatientsRoomControl.GapRequest)
  }

  // @@protoc_insertion_point(class_scope:PatientsRoomControl.GapRequest)
  private static final grpc.generated.PatientsRoomControl.GapRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.generated.PatientsRoomControl.GapRequest();
  }

  public static grpc.generated.PatientsRoomControl.GapRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GapRequest>
      PARSER = new com.google.protobuf.AbstractParser<GapRequest>() {
    @java.lang.Override
    public GapRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GapRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GapRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GapRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.generated.PatientsRoomControl.GapRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

