/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.examples;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteExamples {

  private static final Logger logger = LoggerFactory.getLogger(DeleteExamples.class);

  public static void main(String[] args) {
    String master = "https://localhost:8443/";
    if (args.length == 1) {
      master = args[0];
    }

    DefaultKubernetesClient.Config config = new DefaultKubernetesClient.ConfigBuilder().masterUrl(master).build();
    try (final KubernetesClient client = new DefaultKubernetesClient(config)) {

      client.namespaces().withName("test").delete();

    } catch (KubernetesClientException e) {
      logger.error(e.getMessage(), e);
    }
  }

}
