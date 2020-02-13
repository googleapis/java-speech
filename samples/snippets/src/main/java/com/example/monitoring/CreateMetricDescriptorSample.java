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

import com.google.api.LabelDescriptor;
import com.google.api.MetricDescriptor;
import com.google.cloud.monitoring.v3.MetricServiceClient;
import com.google.monitoring.v3.CreateMetricDescriptorRequest;
import com.google.monitoring.v3.ProjectName;
import java.io.IOException;

public class CreateMetricDescriptorSample {

  private static final String CUSTOM_METRIC_DOMAIN = "custom.googleapis.com";

  /**
   * Creates a metric descriptor.
   *
   * <p>See:
   * https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors/create
   *
   * @param type The metric type
   */
  void createMetricDescriptor(String type) throws IOException {
    // [START monitoring_create_metric]
    // Your Google Cloud Platform project ID
    String projectId = System.getProperty("projectId");
    String metricType = CUSTOM_METRIC_DOMAIN + "/" + type;

    final MetricServiceClient client = MetricServiceClient.create();
    ProjectName name = ProjectName.of(projectId);

    MetricDescriptor descriptor =
        MetricDescriptor.newBuilder()
            .setType(metricType)
            .addLabels(
                LabelDescriptor.newBuilder()
                    .setKey("store_id")
                    .setValueType(LabelDescriptor.ValueType.STRING))
            .setDescription("This is a simple example of a custom metric.")
            .setMetricKind(MetricDescriptor.MetricKind.GAUGE)
            .setValueType(MetricDescriptor.ValueType.DOUBLE)
            .build();

    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name.toString())
            .setMetricDescriptor(descriptor)
            .build();

    client.createMetricDescriptor(request);
    // [END monitoring_create_metric]
  }
}
