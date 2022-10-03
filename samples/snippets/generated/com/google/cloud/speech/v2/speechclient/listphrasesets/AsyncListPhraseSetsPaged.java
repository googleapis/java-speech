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

package com.google.cloud.speech.v2.samples;

// [START speech_v2_generated_speechclient_listphrasesets_paged_async]
import com.google.cloud.speech.v2.ListPhraseSetsRequest;
import com.google.cloud.speech.v2.ListPhraseSetsResponse;
import com.google.cloud.speech.v2.LocationName;
import com.google.cloud.speech.v2.PhraseSet;
import com.google.cloud.speech.v2.SpeechClient;
import com.google.common.base.Strings;

public class AsyncListPhraseSetsPaged {

  public static void main(String[] args) throws Exception {
    asyncListPhraseSetsPaged();
  }

  public static void asyncListPhraseSetsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SpeechClient speechClient = SpeechClient.create()) {
      ListPhraseSetsRequest request =
          ListPhraseSetsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setShowDeleted(true)
              .build();
      while (true) {
        ListPhraseSetsResponse response = speechClient.listPhraseSetsCallable().call(request);
        for (PhraseSet element : response.getPhraseSetsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END speech_v2_generated_speechclient_listphrasesets_paged_async]
