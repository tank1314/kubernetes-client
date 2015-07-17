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
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.builder.Builder;
import io.fabric8.kubernetes.api.model.Doneable;
import io.fabric8.kubernetes.api.model.HasMetadata;

public interface NamedNamespacedResource<T extends HasMetadata, B extends Builder<T>, D extends Doneable<T>> {

  T get() throws KubernetesClientException;

  D edit() throws KubernetesClientException;

  T update(BuilderUpdate<T, B> update) throws KubernetesClientException;

  T update(Update<T> update) throws KubernetesClientException;

  void delete() throws KubernetesClientException;

}
