// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech_adaptation.proto

package com.google.cloud.speech.v1;

public final class SpeechAdaptationProto {
  private SpeechAdaptationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_GetPhraseSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_GetPhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_ListPhraseSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListPhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_ListPhraseSetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListPhraseSetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_CreateCustomClassRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_CreateCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_GetCustomClassRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_GetCustomClassRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_ListCustomClassesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListCustomClassesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_ListCustomClassesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_ListCustomClassesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/speech/v1/cloud_speech_ad" +
      "aptation.proto\022\026google.cloud.speech.v1\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032%googl" +
      "e/cloud/speech/v1/resource.proto\032\033google" +
      "/protobuf/empty.proto\032 google/protobuf/f" +
      "ield_mask.proto\"\251\001\n\026CreatePhraseSetReque" +
      "st\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037speech.googl" +
      "eapis.com/PhraseSet\022\032\n\rphrase_set_id\030\002 \001" +
      "(\tB\003\340A\002\022:\n\nphrase_set\030\003 \001(\0132!.google.clo" +
      "ud.speech.v1.PhraseSetB\003\340A\002\"\205\001\n\026UpdatePh" +
      "raseSetRequest\022:\n\nphrase_set\030\001 \001(\0132!.goo" +
      "gle.cloud.speech.v1.PhraseSetB\003\340A\002\022/\n\013up" +
      "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM" +
      "ask\"L\n\023GetPhraseSetRequest\0225\n\004name\030\001 \001(\t" +
      "B\'\340A\002\372A!\n\037speech.googleapis.com/PhraseSe" +
      "t\"v\n\024ListPhraseSetRequest\0227\n\006parent\030\001 \001(" +
      "\tB\'\340A\002\372A!\022\037speech.googleapis.com/PhraseS" +
      "et\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(" +
      "\t\"h\n\025ListPhraseSetResponse\0226\n\013phrase_set" +
      "s\030\001 \003(\0132!.google.cloud.speech.v1.PhraseS" +
      "et\022\027\n\017next_page_token\030\002 \001(\t\"O\n\026DeletePhr" +
      "aseSetRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037spe" +
      "ech.googleapis.com/PhraseSet\"\263\001\n\030CreateC" +
      "ustomClassRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A" +
      "#\022!speech.googleapis.com/CustomClass\022\034\n\017" +
      "custom_class_id\030\002 \001(\tB\003\340A\002\022>\n\014custom_cla" +
      "ss\030\003 \001(\0132#.google.cloud.speech.v1.Custom" +
      "ClassB\003\340A\002\"\213\001\n\030UpdateCustomClassRequest\022" +
      ">\n\014custom_class\030\001 \001(\0132#.google.cloud.spe" +
      "ech.v1.CustomClassB\003\340A\002\022/\n\013update_mask\030\002" +
      " \001(\0132\032.google.protobuf.FieldMask\"P\n\025GetC" +
      "ustomClassRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n" +
      "!speech.googleapis.com/CustomClass\"|\n\030Li" +
      "stCustomClassesRequest\0229\n\006parent\030\001 \001(\tB)" +
      "\340A\002\372A#\022!speech.googleapis.com/CustomClas" +
      "s\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t" +
      "\"q\n\031ListCustomClassesResponse\022;\n\016custom_" +
      "classes\030\001 \003(\0132#.google.cloud.speech.v1.C" +
      "ustomClass\022\027\n\017next_page_token\030\002 \001(\t\"S\n\030D" +
      "eleteCustomClassRequest\0227\n\004name\030\001 \001(\tB)\340" +
      "A\002\372A#\n!speech.googleapis.com/CustomClass" +
      "2\216\017\n\nAdaptation\022\301\001\n\017CreatePhraseSet\022..go" +
      "ogle.cloud.speech.v1.CreatePhraseSetRequ" +
      "est\032!.google.cloud.speech.v1.PhraseSet\"[" +
      "\202\323\344\223\0023\"./v1/{parent=projects/*/locations" +
      "/*}/phraseSets:\001*\332A\037parent,phrase_set,ph" +
      "rase_set_id\022\235\001\n\014GetPhraseSet\022+.google.cl" +
      "oud.speech.v1.GetPhraseSetRequest\032!.goog" +
      "le.cloud.speech.v1.PhraseSet\"=\202\323\344\223\0020\022./v" +
      "1/{name=projects/*/locations/*/phraseSet" +
      "s/*}\332A\004name\022\255\001\n\rListPhraseSet\022,.google.c" +
      "loud.speech.v1.ListPhraseSetRequest\032-.go" +
      "ogle.cloud.speech.v1.ListPhraseSetRespon" +
      "se\"?\202\323\344\223\0020\022./v1/{parent=projects/*/locat" +
      "ions/*}/phraseSets\332A\006parent\022\314\001\n\017UpdatePh" +
      "raseSet\022..google.cloud.speech.v1.UpdateP" +
      "hraseSetRequest\032!.google.cloud.speech.v1" +
      ".PhraseSet\"f\202\323\344\223\002G29/v1/{phrase_set.name" +
      "=projects/*/locations/*/phraseSets/*}:\np" +
      "hrase_set\332A\026phrase_set,update_mask\022\230\001\n\017D" +
      "eletePhraseSet\022..google.cloud.speech.v1." +
      "DeletePhraseSetRequest\032\026.google.protobuf" +
      ".Empty\"=\202\323\344\223\0020*./v1/{name=projects/*/loc" +
      "ations/*/phraseSets/*}\332A\004name\022\316\001\n\021Create" +
      "CustomClass\0220.google.cloud.speech.v1.Cre" +
      "ateCustomClassRequest\032#.google.cloud.spe" +
      "ech.v1.CustomClass\"b\202\323\344\223\0026\"1/v1/{parent=" +
      "projects/*/locations/*}/customClasses:\001*" +
      "\332A#parent,custom_class,custom_class_id\022\246" +
      "\001\n\016GetCustomClass\022-.google.cloud.speech." +
      "v1.GetCustomClassRequest\032#.google.cloud." +
      "speech.v1.CustomClass\"@\202\323\344\223\0023\0221/v1/{name" +
      "=projects/*/locations/*/customClasses/*}" +
      "\332A\004name\022\274\001\n\021ListCustomClasses\0220.google.c" +
      "loud.speech.v1.ListCustomClassesRequest\032" +
      "1.google.cloud.speech.v1.ListCustomClass" +
      "esResponse\"B\202\323\344\223\0023\0221/v1/{parent=projects" +
      "/*/locations/*}/customClasses\332A\006parent\022\333" +
      "\001\n\021UpdateCustomClass\0220.google.cloud.spee" +
      "ch.v1.UpdateCustomClassRequest\032#.google." +
      "cloud.speech.v1.CustomClass\"o\202\323\344\223\002N2>/v1" +
      "/{custom_class.name=projects/*/locations" +
      "/*/customClasses/*}:\014custom_class\332A\030cust" +
      "om_class,update_mask\022\237\001\n\021DeleteCustomCla" +
      "ss\0220.google.cloud.speech.v1.DeleteCustom" +
      "ClassRequest\032\026.google.protobuf.Empty\"@\202\323" +
      "\344\223\0023*1/v1/{name=projects/*/locations/*/c" +
      "ustomClasses/*}\332A\004name\032I\312A\025speech.google" +
      "apis.com\322A.https://www.googleapis.com/au" +
      "th/cloud-platformBr\n\032com.google.cloud.sp" +
      "eech.v1B\025SpeechAdaptationProtoP\001Z2cloud." +
      "google.com/go/speech/apiv1/speechpb;spee" +
      "chpb\370\001\001\242\002\003GCSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.speech.v1.SpeechResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_CreatePhraseSetRequest_descriptor,
        new java.lang.String[] { "Parent", "PhraseSetId", "PhraseSet", });
    internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_UpdatePhraseSetRequest_descriptor,
        new java.lang.String[] { "PhraseSet", "UpdateMask", });
    internal_static_google_cloud_speech_v1_GetPhraseSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_GetPhraseSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_GetPhraseSetRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_speech_v1_ListPhraseSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1_ListPhraseSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_ListPhraseSetRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_speech_v1_ListPhraseSetResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1_ListPhraseSetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_ListPhraseSetResponse_descriptor,
        new java.lang.String[] { "PhraseSets", "NextPageToken", });
    internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_DeletePhraseSetRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_speech_v1_CreateCustomClassRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1_CreateCustomClassRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_CreateCustomClassRequest_descriptor,
        new java.lang.String[] { "Parent", "CustomClassId", "CustomClass", });
    internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_UpdateCustomClassRequest_descriptor,
        new java.lang.String[] { "CustomClass", "UpdateMask", });
    internal_static_google_cloud_speech_v1_GetCustomClassRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1_GetCustomClassRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_GetCustomClassRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_speech_v1_ListCustomClassesRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1_ListCustomClassesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_ListCustomClassesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_speech_v1_ListCustomClassesResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1_ListCustomClassesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_ListCustomClassesResponse_descriptor,
        new java.lang.String[] { "CustomClasses", "NextPageToken", });
    internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_DeleteCustomClassRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.speech.v1.SpeechResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
