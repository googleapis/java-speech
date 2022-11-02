/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.speech.v1.samples;

// [START speech_v1_generated_Speech_Recognize_RecognitionconfigRecognitionaudio_sync]
import com.google.cloud.speech.v1.RecognitionAudio;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.cloud.speech.v1.RecognizeResponse;
import com.google.cloud.speech.v1.SpeechClient;

public class SyncRecognizeRecognitionconfigRecognitionaudio {

  public static void main(String[] args) throws Exception {
    syncRecognizeRecognitionconfigRecognitionaudio();
  }

  public static void syncRecognizeRecognitionconfigRecognitionaudio() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SpeechClient speechClient = SpeechClient.create()) {
      RecognitionConfig config = RecognitionConfig.newBuilder().build();
      RecognitionAudio audio = RecognitionAudio.newBuilder().build();
      RecognizeResponse response = speechClient.recognize(config, audio);
    }
  }
}
// [END speech_v1_generated_Speech_Recognize_RecognitionconfigRecognitionaudio_sync]
