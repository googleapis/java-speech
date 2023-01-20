// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface GetCustomClassRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.GetCustomClassRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the CustomClass to retrieve. The expected format is
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the CustomClass to retrieve. The expected format is
   * `projects/{project}/locations/{location}/customClasses/{custom_class}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
