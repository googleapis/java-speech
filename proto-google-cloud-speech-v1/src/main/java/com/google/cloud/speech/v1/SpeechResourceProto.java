/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/speech/v1/resource.proto

package com.google.cloud.speech.v1;

public final class SpeechResourceProto {
  private SpeechResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_CustomClass_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CustomClass_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_CustomClass_ClassItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CustomClass_ClassItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_PhraseSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_PhraseSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_PhraseSet_Phrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_PhraseSet_Phrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechAdaptation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/speech/v1/resource.proto\022"
          + "\026google.cloud.speech.v1\032\031google/api/reso"
          + "urce.proto\032\037google/protobuf/timestamp.pr"
          + "oto\032\034google/api/annotations.proto\"\374\001\n\013Cu"
          + "stomClass\022\014\n\004name\030\001 \001(\t\022\027\n\017custom_class_"
          + "id\030\002 \001(\t\022<\n\005items\030\003 \003(\0132-.google.cloud.s"
          + "peech.v1.CustomClass.ClassItem\032\032\n\tClassI"
          + "tem\022\r\n\005value\030\001 \001(\t:l\352Ai\n!speech.googleap"
          + "is.com/CustomClass\022Dprojects/{project}/l"
          + "ocations/{location}/customClasses/{custo"
          + "m_class}\"\362\001\n\tPhraseSet\022\014\n\004name\030\001 \001(\t\0229\n\007"
          + "phrases\030\002 \003(\0132(.google.cloud.speech.v1.P"
          + "hraseSet.Phrase\022\r\n\005boost\030\004 \001(\002\032&\n\006Phrase"
          + "\022\r\n\005value\030\001 \001(\t\022\r\n\005boost\030\002 \001(\002:e\352Ab\n\037spe"
          + "ech.googleapis.com/PhraseSet\022?projects/{"
          + "project}/locations/{location}/phraseSets"
          + "/{phrase_set}\"\314\001\n\020SpeechAdaptation\0226\n\013ph"
          + "rase_sets\030\001 \003(\0132!.google.cloud.speech.v1"
          + ".PhraseSet\022C\n\025phrase_set_references\030\002 \003("
          + "\tB$\372A!\n\037speech.googleapis.com/PhraseSet\022"
          + ";\n\016custom_classes\030\003 \003(\0132#.google.cloud.s"
          + "peech.v1.CustomClassBz\n\032com.google.cloud"
          + ".speech.v1B\023SpeechResourceProtoP\001Z<googl"
          + "e.golang.org/genproto/googleapis/cloud/s"
          + "peech/v1;speech\370\001\001\242\002\003GCSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_speech_v1_CustomClass_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_CustomClass_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_CustomClass_descriptor,
            new java.lang.String[] {
              "Name", "CustomClassId", "Items",
            });
    internal_static_google_cloud_speech_v1_CustomClass_ClassItem_descriptor =
        internal_static_google_cloud_speech_v1_CustomClass_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v1_CustomClass_ClassItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_CustomClass_ClassItem_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_speech_v1_PhraseSet_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_PhraseSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_PhraseSet_descriptor,
            new java.lang.String[] {
              "Name", "Phrases", "Boost",
            });
    internal_static_google_cloud_speech_v1_PhraseSet_Phrase_descriptor =
        internal_static_google_cloud_speech_v1_PhraseSet_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_speech_v1_PhraseSet_Phrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_PhraseSet_Phrase_descriptor,
            new java.lang.String[] {
              "Value", "Boost",
            });
    internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_SpeechAdaptation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_speech_v1_SpeechAdaptation_descriptor,
            new java.lang.String[] {
              "PhraseSets", "PhraseSetReferences", "CustomClasses",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}