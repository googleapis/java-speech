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

package com.example.monitoring;

import com.google.api.MetricDescriptor;
import com.google.cloud.monitoring.v3.MetricServiceClient;
import com.google.monitoring.v3.ListMetricDescriptorsRequest;
import com.google.monitoring.v3.ProjectName;
import java.io.IOException;

public class ListMetricDescriptorsSample {
  /** Returns the first page of all metric descriptors. */
  void listMetricDescriptors() throws IOException {
    // [START monitoring_list_descriptors]
    // Your Google Cloud Platform project ID
    String projectId = System.getProperty("projectId");

    final MetricServiceClient client = MetricServiceClient.create();
    ProjectName name = ProjectName.of(projectId);

    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder().setName(name.toString()).build();
    MetricServiceClient.ListMetricDescriptorsPagedResponse response =
        client.listMetricDescriptors(request);

    System.out.println("Listing descriptors: ");

    for (MetricDescriptor d : response.iterateAll()) {
      System.out.println(d.getName() + " " + d.getDisplayName());
    }
    // [END monitoring_list_descriptors]
  }
}
