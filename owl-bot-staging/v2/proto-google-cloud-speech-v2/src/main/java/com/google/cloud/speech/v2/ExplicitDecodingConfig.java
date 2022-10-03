// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 * <pre>
 * Explicitly specified decoding parameters.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.ExplicitDecodingConfig}
 */
public final class ExplicitDecodingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.ExplicitDecodingConfig)
    ExplicitDecodingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExplicitDecodingConfig.newBuilder() to construct.
  private ExplicitDecodingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExplicitDecodingConfig() {
    encoding_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExplicitDecodingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_ExplicitDecodingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_ExplicitDecodingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.ExplicitDecodingConfig.class, com.google.cloud.speech.v2.ExplicitDecodingConfig.Builder.class);
  }

  /**
   * <pre>
   * Supported audio data encodings.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding}
   */
  public enum AudioEncoding
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
     */
    AUDIO_ENCODING_UNSPECIFIED(0),
    /**
     * <pre>
     * Headerless 16-bit signed little-endian PCM samples.
     * </pre>
     *
     * <code>LINEAR16 = 1;</code>
     */
    LINEAR16(1),
    /**
     * <pre>
     * Headerless 8-bit companded mulaw samples.
     * </pre>
     *
     * <code>MULAW = 2;</code>
     */
    MULAW(2),
    /**
     * <pre>
     * Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>ALAW = 3;</code>
     */
    ALAW(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
     */
    public static final int AUDIO_ENCODING_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Headerless 16-bit signed little-endian PCM samples.
     * </pre>
     *
     * <code>LINEAR16 = 1;</code>
     */
    public static final int LINEAR16_VALUE = 1;
    /**
     * <pre>
     * Headerless 8-bit companded mulaw samples.
     * </pre>
     *
     * <code>MULAW = 2;</code>
     */
    public static final int MULAW_VALUE = 2;
    /**
     * <pre>
     * Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>ALAW = 3;</code>
     */
    public static final int ALAW_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AudioEncoding valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AudioEncoding forNumber(int value) {
      switch (value) {
        case 0: return AUDIO_ENCODING_UNSPECIFIED;
        case 1: return LINEAR16;
        case 2: return MULAW;
        case 3: return ALAW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AudioEncoding> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>() {
            public AudioEncoding findValueByNumber(int number) {
              return AudioEncoding.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.ExplicitDecodingConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final AudioEncoding[] VALUES = values();

    public static AudioEncoding valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AudioEncoding(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding)
  }

  public static final int ENCODING_FIELD_NUMBER = 1;
  private int encoding_;
  /**
   * <pre>
   * Required. Encoding of the audio data sent for recognition.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for encoding.
   */
  @java.lang.Override public int getEncodingValue() {
    return encoding_;
  }
  /**
   * <pre>
   * Required. Encoding of the audio data sent for recognition.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The encoding.
   */
  @java.lang.Override public com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding getEncoding() {
    @SuppressWarnings("deprecation")
    com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding result = com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding.valueOf(encoding_);
    return result == null ? com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding.UNRECOGNIZED : result;
  }

  public static final int SAMPLE_RATE_HERTZ_FIELD_NUMBER = 2;
  private int sampleRateHertz_;
  /**
   * <pre>
   * Sample rate in Hertz of the audio data sent for recognition. Valid
   * values are: 8000-48000. 16000 is optimal. For best results, set the
   * sampling rate of the audio source to 16000 Hz. If that's not possible, use
   * the native sample rate of the audio source (instead of re-sampling).
   * Supported for the following encodings:
   * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
   * * MULAW: Headerless 8-bit companded mulaw samples.
   * * ALAW: Headerless 8-bit companded alaw samples.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   * @return The sampleRateHertz.
   */
  @java.lang.Override
  public int getSampleRateHertz() {
    return sampleRateHertz_;
  }

  public static final int AUDIO_CHANNEL_COUNT_FIELD_NUMBER = 3;
  private int audioChannelCount_;
  /**
   * <pre>
   * Number of channels present in the audio data sent for recognition.
   * Supported for the following encodings:
   * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
   * * MULAW: Headerless 8-bit companded mulaw samples.
   * * ALAW: Headerless 8-bit companded alaw samples.
   * </pre>
   *
   * <code>int32 audio_channel_count = 3;</code>
   * @return The audioChannelCount.
   */
  @java.lang.Override
  public int getAudioChannelCount() {
    return audioChannelCount_;
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
    if (encoding_ != com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, encoding_);
    }
    if (sampleRateHertz_ != 0) {
      output.writeInt32(2, sampleRateHertz_);
    }
    if (audioChannelCount_ != 0) {
      output.writeInt32(3, audioChannelCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encoding_ != com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding.AUDIO_ENCODING_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, encoding_);
    }
    if (sampleRateHertz_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sampleRateHertz_);
    }
    if (audioChannelCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, audioChannelCount_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v2.ExplicitDecodingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.ExplicitDecodingConfig other = (com.google.cloud.speech.v2.ExplicitDecodingConfig) obj;

    if (encoding_ != other.encoding_) return false;
    if (getSampleRateHertz()
        != other.getSampleRateHertz()) return false;
    if (getAudioChannelCount()
        != other.getAudioChannelCount()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + encoding_;
    hash = (37 * hash) + SAMPLE_RATE_HERTZ_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRateHertz();
    hash = (37 * hash) + AUDIO_CHANNEL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAudioChannelCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v2.ExplicitDecodingConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v2.ExplicitDecodingConfig prototype) {
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
   * Explicitly specified decoding parameters.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.ExplicitDecodingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.ExplicitDecodingConfig)
      com.google.cloud.speech.v2.ExplicitDecodingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_ExplicitDecodingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_ExplicitDecodingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.ExplicitDecodingConfig.class, com.google.cloud.speech.v2.ExplicitDecodingConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.ExplicitDecodingConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      encoding_ = 0;

      sampleRateHertz_ = 0;

      audioChannelCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto.internal_static_google_cloud_speech_v2_ExplicitDecodingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ExplicitDecodingConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.ExplicitDecodingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ExplicitDecodingConfig build() {
      com.google.cloud.speech.v2.ExplicitDecodingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ExplicitDecodingConfig buildPartial() {
      com.google.cloud.speech.v2.ExplicitDecodingConfig result = new com.google.cloud.speech.v2.ExplicitDecodingConfig(this);
      result.encoding_ = encoding_;
      result.sampleRateHertz_ = sampleRateHertz_;
      result.audioChannelCount_ = audioChannelCount_;
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
      if (other instanceof com.google.cloud.speech.v2.ExplicitDecodingConfig) {
        return mergeFrom((com.google.cloud.speech.v2.ExplicitDecodingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.ExplicitDecodingConfig other) {
      if (other == com.google.cloud.speech.v2.ExplicitDecodingConfig.getDefaultInstance()) return this;
      if (other.encoding_ != 0) {
        setEncodingValue(other.getEncodingValue());
      }
      if (other.getSampleRateHertz() != 0) {
        setSampleRateHertz(other.getSampleRateHertz());
      }
      if (other.getAudioChannelCount() != 0) {
        setAudioChannelCount(other.getAudioChannelCount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              encoding_ = input.readEnum();

              break;
            } // case 8
            case 16: {
              sampleRateHertz_ = input.readInt32();

              break;
            } // case 16
            case 24: {
              audioChannelCount_ = input.readInt32();

              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int encoding_ = 0;
    /**
     * <pre>
     * Required. Encoding of the audio data sent for recognition.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for encoding.
     */
    @java.lang.Override public int getEncodingValue() {
      return encoding_;
    }
    /**
     * <pre>
     * Required. Encoding of the audio data sent for recognition.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for encoding to set.
     * @return This builder for chaining.
     */
    public Builder setEncodingValue(int value) {
      
      encoding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Encoding of the audio data sent for recognition.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The encoding.
     */
    @java.lang.Override
    public com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding getEncoding() {
      @SuppressWarnings("deprecation")
      com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding result = com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding.valueOf(encoding_);
      return result == null ? com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. Encoding of the audio data sent for recognition.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The encoding to set.
     * @return This builder for chaining.
     */
    public Builder setEncoding(com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      encoding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Encoding of the audio data sent for recognition.
     * </pre>
     *
     * <code>.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearEncoding() {
      
      encoding_ = 0;
      onChanged();
      return this;
    }

    private int sampleRateHertz_ ;
    /**
     * <pre>
     * Sample rate in Hertz of the audio data sent for recognition. Valid
     * values are: 8000-48000. 16000 is optimal. For best results, set the
     * sampling rate of the audio source to 16000 Hz. If that's not possible, use
     * the native sample rate of the audio source (instead of re-sampling).
     * Supported for the following encodings:
     * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
     * * MULAW: Headerless 8-bit companded mulaw samples.
     * * ALAW: Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     * @return The sampleRateHertz.
     */
    @java.lang.Override
    public int getSampleRateHertz() {
      return sampleRateHertz_;
    }
    /**
     * <pre>
     * Sample rate in Hertz of the audio data sent for recognition. Valid
     * values are: 8000-48000. 16000 is optimal. For best results, set the
     * sampling rate of the audio source to 16000 Hz. If that's not possible, use
     * the native sample rate of the audio source (instead of re-sampling).
     * Supported for the following encodings:
     * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
     * * MULAW: Headerless 8-bit companded mulaw samples.
     * * ALAW: Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     * @param value The sampleRateHertz to set.
     * @return This builder for chaining.
     */
    public Builder setSampleRateHertz(int value) {
      
      sampleRateHertz_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sample rate in Hertz of the audio data sent for recognition. Valid
     * values are: 8000-48000. 16000 is optimal. For best results, set the
     * sampling rate of the audio source to 16000 Hz. If that's not possible, use
     * the native sample rate of the audio source (instead of re-sampling).
     * Supported for the following encodings:
     * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
     * * MULAW: Headerless 8-bit companded mulaw samples.
     * * ALAW: Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSampleRateHertz() {
      
      sampleRateHertz_ = 0;
      onChanged();
      return this;
    }

    private int audioChannelCount_ ;
    /**
     * <pre>
     * Number of channels present in the audio data sent for recognition.
     * Supported for the following encodings:
     * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
     * * MULAW: Headerless 8-bit companded mulaw samples.
     * * ALAW: Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>int32 audio_channel_count = 3;</code>
     * @return The audioChannelCount.
     */
    @java.lang.Override
    public int getAudioChannelCount() {
      return audioChannelCount_;
    }
    /**
     * <pre>
     * Number of channels present in the audio data sent for recognition.
     * Supported for the following encodings:
     * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
     * * MULAW: Headerless 8-bit companded mulaw samples.
     * * ALAW: Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>int32 audio_channel_count = 3;</code>
     * @param value The audioChannelCount to set.
     * @return This builder for chaining.
     */
    public Builder setAudioChannelCount(int value) {
      
      audioChannelCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of channels present in the audio data sent for recognition.
     * Supported for the following encodings:
     * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
     * * MULAW: Headerless 8-bit companded mulaw samples.
     * * ALAW: Headerless 8-bit companded alaw samples.
     * </pre>
     *
     * <code>int32 audio_channel_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAudioChannelCount() {
      
      audioChannelCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.ExplicitDecodingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.ExplicitDecodingConfig)
  private static final com.google.cloud.speech.v2.ExplicitDecodingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.ExplicitDecodingConfig();
  }

  public static com.google.cloud.speech.v2.ExplicitDecodingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplicitDecodingConfig>
      PARSER = new com.google.protobuf.AbstractParser<ExplicitDecodingConfig>() {
    @java.lang.Override
    public ExplicitDecodingConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ExplicitDecodingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplicitDecodingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.ExplicitDecodingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

