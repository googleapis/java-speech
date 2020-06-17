/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.speech;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

// Tests for speech Transcribe Diarization samples.
@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class TranscribeDiarizationIT {
  private ByteArrayOutputStream bout;
  private PrintStream out;

  // The path to the audio file to transcribe
  private String recognitionAudioFile = "./resources/commercial_mono.wav";

  private static void requireEnvVar(String varName) {
    assertNotNull(
        System.getenv(varName),
        "Environment variable '%s' is required to perform these tests.".format(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);
  }

  @After
  public void tearDown() {
    System.setOut(null);
  }

  @Test
  public void testDiarization() throws IOException {
    TranscribeDiarization.transcribeDiarization(recognitionAudioFile);
    String got = bout.toString();
    assertThat(got).contains("Speaker");
  }

  @Test
  public void testDiarizationGcs() throws IOException, ExecutionException, InterruptedException {
    TranscribeDiarizationGcs.transcribeDiarizationGcs(
        "gs://cloud-samples-data/speech/commercial_mono.wav");
    String got = bout.toString();
    assertThat(got).contains("Speaker");
  }
}
