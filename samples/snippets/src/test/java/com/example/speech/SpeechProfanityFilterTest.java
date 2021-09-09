/*
 * Copyright 2020 Google LLC
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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@SuppressWarnings("checkstyle:abbreviationaswordinname")
public class SpeechProfanityFilterTest {
  private static final String AUDIO_FILE = "gs://cloud-samples-tests/speech/brooklyn.flac";
  private ByteArrayOutputStream bout;
  private PrintStream stdout;
  private PrintStream out;

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    stdout = System.out;
    System.setOut(out);
  }

  @After
  public void tearDown() {
    System.setOut(stdout);
  }

  @Test
  public void testSpeechProfanityFilter() throws Exception {
    SpeechProfanityFilter.speechProfanityFilter(AUDIO_FILE);
    String got = bout.toString();
    assertThat(got).contains("how old is the Brooklyn Bridge");
  }
}
