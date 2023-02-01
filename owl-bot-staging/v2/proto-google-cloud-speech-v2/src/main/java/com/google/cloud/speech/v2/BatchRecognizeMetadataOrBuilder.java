// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface BatchRecognizeMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.BatchRecognizeMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  int getTranscriptionMetadataCount();
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  boolean containsTranscriptionMetadata(
      java.lang.String key);
  /**
   * Use {@link #getTranscriptionMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
  getTranscriptionMetadata();
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata>
  getTranscriptionMetadataMap();
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  /* nullable */
com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata getTranscriptionMetadataOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata defaultValue);
  /**
   * <pre>
   * Map from provided filename to the transcription metadata for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata&gt; transcription_metadata = 1;</code>
   */
  com.google.cloud.speech.v2.BatchRecognizeTranscriptionMetadata getTranscriptionMetadataOrThrow(
      java.lang.String key);
}
