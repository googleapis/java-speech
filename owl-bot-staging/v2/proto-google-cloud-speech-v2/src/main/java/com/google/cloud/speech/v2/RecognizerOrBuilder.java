// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface RecognizerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.Recognizer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the Recognizer.
   * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the Recognizer.
   * Format: `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. System-assigned unique identifier for the Recognizer.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. System-assigned unique identifier for the Recognizer.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * User-settable, human-readable name for the Recognizer. Must be 63
   * characters or less.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * User-settable, human-readable name for the Recognizer. Must be 63
   * characters or less.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required. Which model to use for recognition requests. Select the model
   * best suited to your domain to get best results.
   * Supported models:
   * - `latest_long`
   *   Best for long form content like media or conversation.
   * - `latest_short`
   *   Best for short form content like commands or single shot directed speech.
   *   When using this model, the service will stop transcribing audio after the
   *   first utterance is detected and completed.
   * When using this model,
   * [SEPARATE_RECOGNITION_PER_CHANNEL][google.cloud.speech.v2.RecognitionFeatures.MultiChannelMode.SEPARATE_RECOGNITION_PER_CHANNEL]
   * is not supported; multi-channel audio is accepted, but only the first
   * channel will be processed and transcribed.
   * </pre>
   *
   * <code>string model = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Required. Which model to use for recognition requests. Select the model
   * best suited to your domain to get best results.
   * Supported models:
   * - `latest_long`
   *   Best for long form content like media or conversation.
   * - `latest_short`
   *   Best for short form content like commands or single shot directed speech.
   *   When using this model, the service will stop transcribing audio after the
   *   first utterance is detected and completed.
   * When using this model,
   * [SEPARATE_RECOGNITION_PER_CHANNEL][google.cloud.speech.v2.RecognitionFeatures.MultiChannelMode.SEPARATE_RECOGNITION_PER_CHANNEL]
   * is not supported; multi-channel audio is accepted, but only the first
   * channel will be processed and transcribed.
   * </pre>
   *
   * <code>string model = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Required. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Supported languages:
   * - `en-US`
   * - `en-GB`
   * - `fr-FR`
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * When you create or update a Recognizer, these values are
   * stored in normalized BCP-47 form. For example, "en-us" is stored as
   * "en-US".
   * </pre>
   *
   * <code>repeated string language_codes = 17 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the languageCodes.
   */
  java.util.List<java.lang.String>
      getLanguageCodesList();
  /**
   * <pre>
   * Required. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Supported languages:
   * - `en-US`
   * - `en-GB`
   * - `fr-FR`
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * When you create or update a Recognizer, these values are
   * stored in normalized BCP-47 form. For example, "en-us" is stored as
   * "en-US".
   * </pre>
   *
   * <code>repeated string language_codes = 17 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of languageCodes.
   */
  int getLanguageCodesCount();
  /**
   * <pre>
   * Required. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Supported languages:
   * - `en-US`
   * - `en-GB`
   * - `fr-FR`
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * When you create or update a Recognizer, these values are
   * stored in normalized BCP-47 form. For example, "en-us" is stored as
   * "en-US".
   * </pre>
   *
   * <code>repeated string language_codes = 17 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  java.lang.String getLanguageCodes(int index);
  /**
   * <pre>
   * Required. The language of the supplied audio as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * Supported languages:
   * - `en-US`
   * - `en-GB`
   * - `fr-FR`
   * If additional languages are provided, recognition result will contain
   * recognition in the most likely language detected. The recognition result
   * will include the language tag of the language detected in the audio.
   * When you create or update a Recognizer, these values are
   * stored in normalized BCP-47 form. For example, "en-us" is stored as
   * "en-US".
   * </pre>
   *
   * <code>repeated string language_codes = 17 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageCodesBytes(int index);

  /**
   * <pre>
   * Default configuration to use for requests with this Recognizer.
   * This can be overwritten by inline configuration in the
   * [RecognizeRequest.config][google.cloud.speech.v2.RecognizeRequest.config]
   * field.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig default_recognition_config = 6;</code>
   * @return Whether the defaultRecognitionConfig field is set.
   */
  boolean hasDefaultRecognitionConfig();
  /**
   * <pre>
   * Default configuration to use for requests with this Recognizer.
   * This can be overwritten by inline configuration in the
   * [RecognizeRequest.config][google.cloud.speech.v2.RecognizeRequest.config]
   * field.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig default_recognition_config = 6;</code>
   * @return The defaultRecognitionConfig.
   */
  com.google.cloud.speech.v2.RecognitionConfig getDefaultRecognitionConfig();
  /**
   * <pre>
   * Default configuration to use for requests with this Recognizer.
   * This can be overwritten by inline configuration in the
   * [RecognizeRequest.config][google.cloud.speech.v2.RecognizeRequest.config]
   * field.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig default_recognition_config = 6;</code>
   */
  com.google.cloud.speech.v2.RecognitionConfigOrBuilder getDefaultRecognitionConfigOrBuilder();

  /**
   * <pre>
   * Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7;</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7;</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7;</code>
   */

  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 7;</code>
   */

  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Output only. The Recognizer lifecycle state.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The Recognizer lifecycle state.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.Recognizer.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.speech.v2.Recognizer.State getState();

  /**
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The most recent time this Recognizer was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time this Recognizer was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time this Recognizer was modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time at which this Recognizer was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * Output only. The time at which this Recognizer was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * Output only. The time at which this Recognizer was requested for deletion.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time at which this Recognizer will be purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <pre>
   * Output only. The time at which this Recognizer will be purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <pre>
   * Output only. The time at which this Recognizer will be purged.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields. This may be sent on update, undelete, and delete requests to
   * ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields. This may be sent on update, undelete, and delete requests to
   * ensure the client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Output only. Whether or not this Recognizer is in the process of being
   * updated.
   * </pre>
   *
   * <code>bool reconciling = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   * <pre>
   * Output only. The [KMS key
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with which
   * the Recognizer is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>string kms_key_name = 15 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   * <pre>
   * Output only. The [KMS key
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with which
   * the Recognizer is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>string kms_key_name = 15 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString
      getKmsKeyNameBytes();

  /**
   * <pre>
   * Output only. The [KMS key version
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#key_versions)
   * with which the Recognizer is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}`.
   * </pre>
   *
   * <code>string kms_key_version_name = 16 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The kmsKeyVersionName.
   */
  java.lang.String getKmsKeyVersionName();
  /**
   * <pre>
   * Output only. The [KMS key version
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#key_versions)
   * with which the Recognizer is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}`.
   * </pre>
   *
   * <code>string kms_key_version_name = 16 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for kmsKeyVersionName.
   */
  com.google.protobuf.ByteString
      getKmsKeyVersionNameBytes();
}
