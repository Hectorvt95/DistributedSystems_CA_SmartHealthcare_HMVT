// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoomStatus.proto

package grpc.generated.RoomStatus;

/**
 * Protobuf type {@code RoomStatus.BedUpdate}
 */
public  final class BedUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RoomStatus.BedUpdate)
    BedUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BedUpdate.newBuilder() to construct.
  private BedUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BedUpdate() {
    bedId_ = 0;
    name_ = "";
    status_ = "";
    patientId_ = 0;
    timestamp_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BedUpdate(
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

            bedId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 32: {

            patientId_ = input.readInt32();
            break;
          }
          case 40: {

            timestamp_ = input.readInt32();
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
    return grpc.generated.RoomStatus.RoomStatusImpl.internal_static_RoomStatus_BedUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.generated.RoomStatus.RoomStatusImpl.internal_static_RoomStatus_BedUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.generated.RoomStatus.BedUpdate.class, grpc.generated.RoomStatus.BedUpdate.Builder.class);
  }

  public static final int BED_ID_FIELD_NUMBER = 1;
  private int bedId_;
  /**
   * <code>int32 bed_id = 1;</code>
   */
  public int getBedId() {
    return bedId_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   *OCCUPIED = 0;
   * </pre>
   *
   * <code>string status = 3;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *OCCUPIED = 0;
   * </pre>
   *
   * <code>string status = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATIENT_ID_FIELD_NUMBER = 4;
  private int patientId_;
  /**
   * <pre>
   *AVAILABLE = 1;
   * </pre>
   *
   * <code>int32 patient_id = 4;</code>
   */
  public int getPatientId() {
    return patientId_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 5;
  private int timestamp_;
  /**
   * <pre>
   *CLEANING_IN_PROGRESS = 2;
   * </pre>
   *
   * <code>int32 timestamp = 5;</code>
   */
  public int getTimestamp() {
    return timestamp_;
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
    if (bedId_ != 0) {
      output.writeInt32(1, bedId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, status_);
    }
    if (patientId_ != 0) {
      output.writeInt32(4, patientId_);
    }
    if (timestamp_ != 0) {
      output.writeInt32(5, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bedId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bedId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, status_);
    }
    if (patientId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, patientId_);
    }
    if (timestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, timestamp_);
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
    if (!(obj instanceof grpc.generated.RoomStatus.BedUpdate)) {
      return super.equals(obj);
    }
    grpc.generated.RoomStatus.BedUpdate other = (grpc.generated.RoomStatus.BedUpdate) obj;

    boolean result = true;
    result = result && (getBedId()
        == other.getBedId());
    result = result && getName()
        .equals(other.getName());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && (getPatientId()
        == other.getPatientId());
    result = result && (getTimestamp()
        == other.getTimestamp());
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
    hash = (37 * hash) + BED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBedId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + PATIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPatientId();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.generated.RoomStatus.BedUpdate parseFrom(
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
  public static Builder newBuilder(grpc.generated.RoomStatus.BedUpdate prototype) {
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
   * Protobuf type {@code RoomStatus.BedUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RoomStatus.BedUpdate)
      grpc.generated.RoomStatus.BedUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.generated.RoomStatus.RoomStatusImpl.internal_static_RoomStatus_BedUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.generated.RoomStatus.RoomStatusImpl.internal_static_RoomStatus_BedUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.generated.RoomStatus.BedUpdate.class, grpc.generated.RoomStatus.BedUpdate.Builder.class);
    }

    // Construct using grpc.generated.RoomStatus.BedUpdate.newBuilder()
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
      bedId_ = 0;

      name_ = "";

      status_ = "";

      patientId_ = 0;

      timestamp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.generated.RoomStatus.RoomStatusImpl.internal_static_RoomStatus_BedUpdate_descriptor;
    }

    @java.lang.Override
    public grpc.generated.RoomStatus.BedUpdate getDefaultInstanceForType() {
      return grpc.generated.RoomStatus.BedUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.generated.RoomStatus.BedUpdate build() {
      grpc.generated.RoomStatus.BedUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.generated.RoomStatus.BedUpdate buildPartial() {
      grpc.generated.RoomStatus.BedUpdate result = new grpc.generated.RoomStatus.BedUpdate(this);
      result.bedId_ = bedId_;
      result.name_ = name_;
      result.status_ = status_;
      result.patientId_ = patientId_;
      result.timestamp_ = timestamp_;
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
      if (other instanceof grpc.generated.RoomStatus.BedUpdate) {
        return mergeFrom((grpc.generated.RoomStatus.BedUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.generated.RoomStatus.BedUpdate other) {
      if (other == grpc.generated.RoomStatus.BedUpdate.getDefaultInstance()) return this;
      if (other.getBedId() != 0) {
        setBedId(other.getBedId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.getPatientId() != 0) {
        setPatientId(other.getPatientId());
      }
      if (other.getTimestamp() != 0) {
        setTimestamp(other.getTimestamp());
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
      grpc.generated.RoomStatus.BedUpdate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.generated.RoomStatus.BedUpdate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bedId_ ;
    /**
     * <code>int32 bed_id = 1;</code>
     */
    public int getBedId() {
      return bedId_;
    }
    /**
     * <code>int32 bed_id = 1;</code>
     */
    public Builder setBedId(int value) {
      
      bedId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bed_id = 1;</code>
     */
    public Builder clearBedId() {
      
      bedId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     *OCCUPIED = 0;
     * </pre>
     *
     * <code>string status = 3;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *OCCUPIED = 0;
     * </pre>
     *
     * <code>string status = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *OCCUPIED = 0;
     * </pre>
     *
     * <code>string status = 3;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *OCCUPIED = 0;
     * </pre>
     *
     * <code>string status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *OCCUPIED = 0;
     * </pre>
     *
     * <code>string status = 3;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private int patientId_ ;
    /**
     * <pre>
     *AVAILABLE = 1;
     * </pre>
     *
     * <code>int32 patient_id = 4;</code>
     */
    public int getPatientId() {
      return patientId_;
    }
    /**
     * <pre>
     *AVAILABLE = 1;
     * </pre>
     *
     * <code>int32 patient_id = 4;</code>
     */
    public Builder setPatientId(int value) {
      
      patientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *AVAILABLE = 1;
     * </pre>
     *
     * <code>int32 patient_id = 4;</code>
     */
    public Builder clearPatientId() {
      
      patientId_ = 0;
      onChanged();
      return this;
    }

    private int timestamp_ ;
    /**
     * <pre>
     *CLEANING_IN_PROGRESS = 2;
     * </pre>
     *
     * <code>int32 timestamp = 5;</code>
     */
    public int getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     *CLEANING_IN_PROGRESS = 2;
     * </pre>
     *
     * <code>int32 timestamp = 5;</code>
     */
    public Builder setTimestamp(int value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *CLEANING_IN_PROGRESS = 2;
     * </pre>
     *
     * <code>int32 timestamp = 5;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RoomStatus.BedUpdate)
  }

  // @@protoc_insertion_point(class_scope:RoomStatus.BedUpdate)
  private static final grpc.generated.RoomStatus.BedUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.generated.RoomStatus.BedUpdate();
  }

  public static grpc.generated.RoomStatus.BedUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BedUpdate>
      PARSER = new com.google.protobuf.AbstractParser<BedUpdate>() {
    @java.lang.Override
    public BedUpdate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BedUpdate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BedUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BedUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.generated.RoomStatus.BedUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

