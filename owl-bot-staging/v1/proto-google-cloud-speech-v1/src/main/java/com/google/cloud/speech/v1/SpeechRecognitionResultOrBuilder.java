// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface SpeechRecognitionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeechRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1.SpeechRecognitionAlternative> 
      getAlternativesList();
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList();
  /**
   * <pre>
   * May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);

  /**
   * <pre>
   * For multi-channel audio, this is the channel number corresponding to the
   * recognized result for the audio from that channel.
   * For audio_channel_count = N, its output values can range from '1' to 'N'.
   * </pre>
   *
   * <code>int32 channel_tag = 2;</code>
   * @return The channelTag.
   */
  int getChannelTag();
}