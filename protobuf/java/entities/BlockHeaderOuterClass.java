// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow/entities/block_header.proto

package entities;

public final class BlockHeaderOuterClass {
  private BlockHeaderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlockHeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:entities.BlockHeader)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes id = 1;</code>
     */
    com.google.protobuf.ByteString getId();

    /**
     * <code>bytes parent_id = 2;</code>
     */
    com.google.protobuf.ByteString getParentId();

    /**
     * <code>uint64 height = 3;</code>
     */
    long getHeight();
  }
  /**
   * Protobuf type {@code entities.BlockHeader}
   */
  public  static final class BlockHeader extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:entities.BlockHeader)
      BlockHeaderOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockHeader.newBuilder() to construct.
    private BlockHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockHeader() {
      id_ = com.google.protobuf.ByteString.EMPTY;
      parentId_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlockHeader();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockHeader(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {

              id_ = input.readBytes();
              break;
            }
            case 18: {

              parentId_ = input.readBytes();
              break;
            }
            case 24: {

              height_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return entities.BlockHeaderOuterClass.internal_static_entities_BlockHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return entities.BlockHeaderOuterClass.internal_static_entities_BlockHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              entities.BlockHeaderOuterClass.BlockHeader.class, entities.BlockHeaderOuterClass.BlockHeader.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString id_;
    /**
     * <code>bytes id = 1;</code>
     */
    public com.google.protobuf.ByteString getId() {
      return id_;
    }

    public static final int PARENT_ID_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString parentId_;
    /**
     * <code>bytes parent_id = 2;</code>
     */
    public com.google.protobuf.ByteString getParentId() {
      return parentId_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 3;
    private long height_;
    /**
     * <code>uint64 height = 3;</code>
     */
    public long getHeight() {
      return height_;
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
      if (!id_.isEmpty()) {
        output.writeBytes(1, id_);
      }
      if (!parentId_.isEmpty()) {
        output.writeBytes(2, parentId_);
      }
      if (height_ != 0L) {
        output.writeUInt64(3, height_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!id_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, id_);
      }
      if (!parentId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, parentId_);
      }
      if (height_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, height_);
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
      if (!(obj instanceof entities.BlockHeaderOuterClass.BlockHeader)) {
        return super.equals(obj);
      }
      entities.BlockHeaderOuterClass.BlockHeader other = (entities.BlockHeaderOuterClass.BlockHeader) obj;

      if (!getId()
          .equals(other.getId())) return false;
      if (!getParentId()
          .equals(other.getParentId())) return false;
      if (getHeight()
          != other.getHeight()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentId().hashCode();
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHeight());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static entities.BlockHeaderOuterClass.BlockHeader parseFrom(
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
    public static Builder newBuilder(entities.BlockHeaderOuterClass.BlockHeader prototype) {
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
     * Protobuf type {@code entities.BlockHeader}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:entities.BlockHeader)
        entities.BlockHeaderOuterClass.BlockHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return entities.BlockHeaderOuterClass.internal_static_entities_BlockHeader_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return entities.BlockHeaderOuterClass.internal_static_entities_BlockHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                entities.BlockHeaderOuterClass.BlockHeader.class, entities.BlockHeaderOuterClass.BlockHeader.Builder.class);
      }

      // Construct using entities.BlockHeaderOuterClass.BlockHeader.newBuilder()
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
        id_ = com.google.protobuf.ByteString.EMPTY;

        parentId_ = com.google.protobuf.ByteString.EMPTY;

        height_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return entities.BlockHeaderOuterClass.internal_static_entities_BlockHeader_descriptor;
      }

      @java.lang.Override
      public entities.BlockHeaderOuterClass.BlockHeader getDefaultInstanceForType() {
        return entities.BlockHeaderOuterClass.BlockHeader.getDefaultInstance();
      }

      @java.lang.Override
      public entities.BlockHeaderOuterClass.BlockHeader build() {
        entities.BlockHeaderOuterClass.BlockHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public entities.BlockHeaderOuterClass.BlockHeader buildPartial() {
        entities.BlockHeaderOuterClass.BlockHeader result = new entities.BlockHeaderOuterClass.BlockHeader(this);
        result.id_ = id_;
        result.parentId_ = parentId_;
        result.height_ = height_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof entities.BlockHeaderOuterClass.BlockHeader) {
          return mergeFrom((entities.BlockHeaderOuterClass.BlockHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(entities.BlockHeaderOuterClass.BlockHeader other) {
        if (other == entities.BlockHeaderOuterClass.BlockHeader.getDefaultInstance()) return this;
        if (other.getId() != com.google.protobuf.ByteString.EMPTY) {
          setId(other.getId());
        }
        if (other.getParentId() != com.google.protobuf.ByteString.EMPTY) {
          setParentId(other.getParentId());
        }
        if (other.getHeight() != 0L) {
          setHeight(other.getHeight());
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
        entities.BlockHeaderOuterClass.BlockHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (entities.BlockHeaderOuterClass.BlockHeader) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString id_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes id = 1;</code>
       */
      public com.google.protobuf.ByteString getId() {
        return id_;
      }
      /**
       * <code>bytes id = 1;</code>
       */
      public Builder setId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString parentId_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes parent_id = 2;</code>
       */
      public com.google.protobuf.ByteString getParentId() {
        return parentId_;
      }
      /**
       * <code>bytes parent_id = 2;</code>
       */
      public Builder setParentId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        parentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes parent_id = 2;</code>
       */
      public Builder clearParentId() {
        
        parentId_ = getDefaultInstance().getParentId();
        onChanged();
        return this;
      }

      private long height_ ;
      /**
       * <code>uint64 height = 3;</code>
       */
      public long getHeight() {
        return height_;
      }
      /**
       * <code>uint64 height = 3;</code>
       */
      public Builder setHeight(long value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 height = 3;</code>
       */
      public Builder clearHeight() {
        
        height_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:entities.BlockHeader)
    }

    // @@protoc_insertion_point(class_scope:entities.BlockHeader)
    private static final entities.BlockHeaderOuterClass.BlockHeader DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new entities.BlockHeaderOuterClass.BlockHeader();
    }

    public static entities.BlockHeaderOuterClass.BlockHeader getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlockHeader>
        PARSER = new com.google.protobuf.AbstractParser<BlockHeader>() {
      @java.lang.Override
      public BlockHeader parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockHeader(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlockHeader> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlockHeader> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public entities.BlockHeaderOuterClass.BlockHeader getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_entities_BlockHeader_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_entities_BlockHeader_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n flow/entities/block_header.proto\022\010enti" +
      "ties\"<\n\013BlockHeader\022\n\n\002id\030\001 \001(\014\022\021\n\tparen" +
      "t_id\030\002 \001(\014\022\016\n\006height\030\003 \001(\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_entities_BlockHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_entities_BlockHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_entities_BlockHeader_descriptor,
        new java.lang.String[] { "Id", "ParentId", "Height", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
