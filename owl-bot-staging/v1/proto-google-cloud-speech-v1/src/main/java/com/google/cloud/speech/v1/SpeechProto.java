// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public final class SpeechProto {
  private SpeechProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_TranscriptOutputConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_TranscriptOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognitionAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_RecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_speech_v1_WordInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/speech/v1/cloud_speech.pr" +
      "oto\022\026google.cloud.speech.v1\032\034google/api/" +
      "annotations.proto\032\027google/api/client.pro" +
      "to\032\037google/api/field_behavior.proto\032#goo" +
      "gle/longrunning/operations.proto\032\031google" +
      "/protobuf/any.proto\032\036google/protobuf/dur" +
      "ation.proto\032\037google/protobuf/timestamp.p" +
      "roto\032\036google/protobuf/wrappers.proto\032\027go" +
      "ogle/rpc/status.proto\"\220\001\n\020RecognizeReque" +
      "st\022>\n\006config\030\001 \001(\0132).google.cloud.speech" +
      ".v1.RecognitionConfigB\003\340A\002\022<\n\005audio\030\002 \001(" +
      "\0132(.google.cloud.speech.v1.RecognitionAu" +
      "dioB\003\340A\002\"\347\001\n\033LongRunningRecognizeRequest" +
      "\022>\n\006config\030\001 \001(\0132).google.cloud.speech.v" +
      "1.RecognitionConfigB\003\340A\002\022<\n\005audio\030\002 \001(\0132" +
      "(.google.cloud.speech.v1.RecognitionAudi" +
      "oB\003\340A\002\022J\n\routput_config\030\004 \001(\0132..google.c" +
      "loud.speech.v1.TranscriptOutputConfigB\003\340" +
      "A\001\":\n\026TranscriptOutputConfig\022\021\n\007gcs_uri\030" +
      "\001 \001(\tH\000B\r\n\013output_type\"\231\001\n\031StreamingReco" +
      "gnizeRequest\022N\n\020streaming_config\030\001 \001(\01322" +
      ".google.cloud.speech.v1.StreamingRecogni" +
      "tionConfigH\000\022\027\n\raudio_content\030\002 \001(\014H\000B\023\n" +
      "\021streaming_request\"\217\001\n\032StreamingRecognit" +
      "ionConfig\022>\n\006config\030\001 \001(\0132).google.cloud" +
      ".speech.v1.RecognitionConfigB\003\340A\002\022\030\n\020sin" +
      "gle_utterance\030\002 \001(\010\022\027\n\017interim_results\030\003" +
      " \001(\010\"\337\005\n\021RecognitionConfig\022I\n\010encoding\030\001" +
      " \001(\01627.google.cloud.speech.v1.Recognitio" +
      "nConfig.AudioEncoding\022\031\n\021sample_rate_her" +
      "tz\030\002 \001(\005\022\033\n\023audio_channel_count\030\007 \001(\005\022/\n" +
      "\'enable_separate_recognition_per_channel" +
      "\030\014 \001(\010\022\032\n\rlanguage_code\030\003 \001(\tB\003\340A\002\022\030\n\020ma" +
      "x_alternatives\030\004 \001(\005\022\030\n\020profanity_filter" +
      "\030\005 \001(\010\022>\n\017speech_contexts\030\006 \003(\0132%.google" +
      ".cloud.speech.v1.SpeechContext\022 \n\030enable" +
      "_word_time_offsets\030\010 \001(\010\022$\n\034enable_autom" +
      "atic_punctuation\030\013 \001(\010\022L\n\022diarization_co" +
      "nfig\030\023 \001(\01320.google.cloud.speech.v1.Spea" +
      "kerDiarizationConfig\022=\n\010metadata\030\t \001(\0132+" +
      ".google.cloud.speech.v1.RecognitionMetad" +
      "ata\022\r\n\005model\030\r \001(\t\022\024\n\014use_enhanced\030\016 \001(\010" +
      "\"\213\001\n\rAudioEncoding\022\030\n\024ENCODING_UNSPECIFI" +
      "ED\020\000\022\014\n\010LINEAR16\020\001\022\010\n\004FLAC\020\002\022\t\n\005MULAW\020\003\022" +
      "\007\n\003AMR\020\004\022\n\n\006AMR_WB\020\005\022\014\n\010OGG_OPUS\020\006\022\032\n\026SP" +
      "EEX_WITH_HEADER_BYTE\020\007\"\220\001\n\030SpeakerDiariz" +
      "ationConfig\022\"\n\032enable_speaker_diarizatio" +
      "n\030\001 \001(\010\022\031\n\021min_speaker_count\030\002 \001(\005\022\031\n\021ma" +
      "x_speaker_count\030\003 \001(\005\022\032\n\013speaker_tag\030\005 \001" +
      "(\005B\005\030\001\340A\003\"\240\010\n\023RecognitionMetadata\022U\n\020int" +
      "eraction_type\030\001 \001(\0162;.google.cloud.speec" +
      "h.v1.RecognitionMetadata.InteractionType" +
      "\022$\n\034industry_naics_code_of_audio\030\003 \001(\r\022[" +
      "\n\023microphone_distance\030\004 \001(\0162>.google.clo" +
      "ud.speech.v1.RecognitionMetadata.Microph" +
      "oneDistance\022Z\n\023original_media_type\030\005 \001(\016" +
      "2=.google.cloud.speech.v1.RecognitionMet" +
      "adata.OriginalMediaType\022^\n\025recording_dev" +
      "ice_type\030\006 \001(\0162?.google.cloud.speech.v1." +
      "RecognitionMetadata.RecordingDeviceType\022" +
      "\035\n\025recording_device_name\030\007 \001(\t\022\032\n\022origin" +
      "al_mime_type\030\010 \001(\t\022\023\n\013audio_topic\030\n \001(\t\"" +
      "\305\001\n\017InteractionType\022 \n\034INTERACTION_TYPE_" +
      "UNSPECIFIED\020\000\022\016\n\nDISCUSSION\020\001\022\020\n\014PRESENT" +
      "ATION\020\002\022\016\n\nPHONE_CALL\020\003\022\r\n\tVOICEMAIL\020\004\022\033" +
      "\n\027PROFESSIONALLY_PRODUCED\020\005\022\020\n\014VOICE_SEA" +
      "RCH\020\006\022\021\n\rVOICE_COMMAND\020\007\022\r\n\tDICTATION\020\010\"" +
      "d\n\022MicrophoneDistance\022#\n\037MICROPHONE_DIST" +
      "ANCE_UNSPECIFIED\020\000\022\r\n\tNEARFIELD\020\001\022\014\n\010MID" +
      "FIELD\020\002\022\014\n\010FARFIELD\020\003\"N\n\021OriginalMediaTy" +
      "pe\022#\n\037ORIGINAL_MEDIA_TYPE_UNSPECIFIED\020\000\022" +
      "\t\n\005AUDIO\020\001\022\t\n\005VIDEO\020\002\"\244\001\n\023RecordingDevic" +
      "eType\022%\n!RECORDING_DEVICE_TYPE_UNSPECIFI" +
      "ED\020\000\022\016\n\nSMARTPHONE\020\001\022\006\n\002PC\020\002\022\016\n\nPHONE_LI" +
      "NE\020\003\022\013\n\007VEHICLE\020\004\022\030\n\024OTHER_OUTDOOR_DEVIC" +
      "E\020\005\022\027\n\023OTHER_INDOOR_DEVICE\020\006\" \n\rSpeechCo" +
      "ntext\022\017\n\007phrases\030\001 \003(\t\"D\n\020RecognitionAud" +
      "io\022\021\n\007content\030\001 \001(\014H\000\022\r\n\003uri\030\002 \001(\tH\000B\016\n\014" +
      "audio_source\"\213\001\n\021RecognizeResponse\022@\n\007re" +
      "sults\030\002 \003(\0132/.google.cloud.speech.v1.Spe" +
      "echRecognitionResult\0224\n\021total_billed_tim" +
      "e\030\003 \001(\0132\031.google.protobuf.Duration\"\226\001\n\034L" +
      "ongRunningRecognizeResponse\022@\n\007results\030\002" +
      " \003(\0132/.google.cloud.speech.v1.SpeechReco" +
      "gnitionResult\0224\n\021total_billed_time\030\003 \001(\013" +
      "2\031.google.protobuf.Duration\"\260\001\n\034LongRunn" +
      "ingRecognizeMetadata\022\030\n\020progress_percent" +
      "\030\001 \001(\005\022.\n\nstart_time\030\002 \001(\0132\032.google.prot" +
      "obuf.Timestamp\0224\n\020last_update_time\030\003 \001(\013" +
      "2\032.google.protobuf.Timestamp\022\020\n\003uri\030\004 \001(" +
      "\tB\003\340A\003\"\347\002\n\032StreamingRecognizeResponse\022!\n" +
      "\005error\030\001 \001(\0132\022.google.rpc.Status\022C\n\007resu" +
      "lts\030\002 \003(\01322.google.cloud.speech.v1.Strea" +
      "mingRecognitionResult\022]\n\021speech_event_ty" +
      "pe\030\004 \001(\0162B.google.cloud.speech.v1.Stream" +
      "ingRecognizeResponse.SpeechEventType\0224\n\021" +
      "total_billed_time\030\005 \001(\0132\031.google.protobu" +
      "f.Duration\"L\n\017SpeechEventType\022\034\n\030SPEECH_" +
      "EVENT_UNSPECIFIED\020\000\022\033\n\027END_OF_SINGLE_UTT" +
      "ERANCE\020\001\"\362\001\n\032StreamingRecognitionResult\022" +
      "J\n\014alternatives\030\001 \003(\01324.google.cloud.spe" +
      "ech.v1.SpeechRecognitionAlternative\022\020\n\010i" +
      "s_final\030\002 \001(\010\022\021\n\tstability\030\003 \001(\002\0222\n\017resu" +
      "lt_end_time\030\004 \001(\0132\031.google.protobuf.Dura" +
      "tion\022\023\n\013channel_tag\030\005 \001(\005\022\032\n\rlanguage_co" +
      "de\030\006 \001(\tB\003\340A\003\"z\n\027SpeechRecognitionResult" +
      "\022J\n\014alternatives\030\001 \003(\01324.google.cloud.sp" +
      "eech.v1.SpeechRecognitionAlternative\022\023\n\013" +
      "channel_tag\030\002 \001(\005\"w\n\034SpeechRecognitionAl" +
      "ternative\022\022\n\ntranscript\030\001 \001(\t\022\022\n\nconfide" +
      "nce\030\002 \001(\002\022/\n\005words\030\003 \003(\0132 .google.cloud." +
      "speech.v1.WordInfo\"\216\001\n\010WordInfo\022-\n\nstart" +
      "_time\030\001 \001(\0132\031.google.protobuf.Duration\022+" +
      "\n\010end_time\030\002 \001(\0132\031.google.protobuf.Durat" +
      "ion\022\014\n\004word\030\003 \001(\t\022\030\n\013speaker_tag\030\005 \001(\005B\003" +
      "\340A\0032\321\004\n\006Speech\022\220\001\n\tRecognize\022(.google.cl" +
      "oud.speech.v1.RecognizeRequest\032).google." +
      "cloud.speech.v1.RecognizeResponse\".\202\323\344\223\002" +
      "\031\"\024/v1/speech:recognize:\001*\332A\014config,audi" +
      "o\022\344\001\n\024LongRunningRecognize\0223.google.clou" +
      "d.speech.v1.LongRunningRecognizeRequest\032" +
      "\035.google.longrunning.Operation\"x\202\323\344\223\002$\"\037" +
      "/v1/speech:longrunningrecognize:\001*\332A\014con" +
      "fig,audio\312A<\n\034LongRunningRecognizeRespon" +
      "se\022\034LongRunningRecognizeMetadata\022\201\001\n\022Str" +
      "eamingRecognize\0221.google.cloud.speech.v1" +
      ".StreamingRecognizeRequest\0322.google.clou" +
      "d.speech.v1.StreamingRecognizeResponse\"\000" +
      "(\0010\001\032I\312A\025speech.googleapis.com\322A.https:/" +
      "/www.googleapis.com/auth/cloud-platformB" +
      "r\n\032com.google.cloud.speech.v1B\013SpeechPro" +
      "toP\001Z<google.golang.org/genproto/googlea" +
      "pis/cloud/speech/v1;speech\370\001\001\242\002\003GCSb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor,
        new java.lang.String[] { "Config", "Audio", });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_LongRunningRecognizeRequest_descriptor,
        new java.lang.String[] { "Config", "Audio", "OutputConfig", });
    internal_static_google_cloud_speech_v1_TranscriptOutputConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_speech_v1_TranscriptOutputConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_TranscriptOutputConfig_descriptor,
        new java.lang.String[] { "GcsUri", "OutputType", });
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor,
        new java.lang.String[] { "StreamingConfig", "AudioContent", "StreamingRequest", });
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor,
        new java.lang.String[] { "Config", "SingleUtterance", "InterimResults", });
    internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor,
        new java.lang.String[] { "Encoding", "SampleRateHertz", "AudioChannelCount", "EnableSeparateRecognitionPerChannel", "LanguageCode", "MaxAlternatives", "ProfanityFilter", "SpeechContexts", "EnableWordTimeOffsets", "EnableAutomaticPunctuation", "DiarizationConfig", "Metadata", "Model", "UseEnhanced", });
    internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor,
        new java.lang.String[] { "EnableSpeakerDiarization", "MinSpeakerCount", "MaxSpeakerCount", "SpeakerTag", });
    internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_speech_v1_RecognitionMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor,
        new java.lang.String[] { "InteractionType", "IndustryNaicsCodeOfAudio", "MicrophoneDistance", "OriginalMediaType", "RecordingDeviceType", "RecordingDeviceName", "OriginalMimeType", "AudioTopic", });
    internal_static_google_cloud_speech_v1_SpeechContext_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_speech_v1_SpeechContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechContext_descriptor,
        new java.lang.String[] { "Phrases", });
    internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_speech_v1_RecognitionAudio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognitionAudio_descriptor,
        new java.lang.String[] { "Content", "Uri", "AudioSource", });
    internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_speech_v1_RecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_RecognizeResponse_descriptor,
        new java.lang.String[] { "Results", "TotalBilledTime", });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_LongRunningRecognizeResponse_descriptor,
        new java.lang.String[] { "Results", "TotalBilledTime", });
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_LongRunningRecognizeMetadata_descriptor,
        new java.lang.String[] { "ProgressPercent", "StartTime", "LastUpdateTime", "Uri", });
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor,
        new java.lang.String[] { "Error", "Results", "SpeechEventType", "TotalBilledTime", });
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_speech_v1_StreamingRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_StreamingRecognitionResult_descriptor,
        new java.lang.String[] { "Alternatives", "IsFinal", "Stability", "ResultEndTime", "ChannelTag", "LanguageCode", });
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor,
        new java.lang.String[] { "Alternatives", "ChannelTag", });
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor,
        new java.lang.String[] { "Transcript", "Confidence", "Words", });
    internal_static_google_cloud_speech_v1_WordInfo_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_speech_v1_WordInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_speech_v1_WordInfo_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Word", "SpeakerTag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
