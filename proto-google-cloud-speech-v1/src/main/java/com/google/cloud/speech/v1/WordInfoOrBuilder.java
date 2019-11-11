/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface WordInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.WordInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  com.google.protobuf.Duration getStartTime();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the start of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  com.google.protobuf.Duration getEndTime();
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the audio,
   * and corresponding to the end of the spoken word.
   * This field is only set if `enable_word_time_offsets=true` and only
   * in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can
   * vary.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   */
  java.lang.String getWord();
  /**
   *
   *
   * <pre>
   * The word corresponding to this set of information.
   * </pre>
   *
   * <code>string word = 3;</code>
   */
  com.google.protobuf.ByteString getWordBytes();

  /**
   *
   *
   * <pre>
   * A distinct integer value is assigned for every speaker within
   * the audio. This field specifies which one of those speakers was detected to
   * have spoken this word. Value ranges from '1' to diarization_speaker_count.
   * speaker_tag is set if enable_speaker_diarization = 'true' and only in the
   * top alternative.
   * </pre>
   *
   * <code>int32 speaker_tag = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSpeakerTag();
}
