/**
 * Copyright (c) 2019 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at:
 *
 *     https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.jkube.gradle.plugin.task;

import org.eclipse.jkube.gradle.plugin.OpenShiftExtension;
import org.gradle.api.tasks.Internal;

import javax.inject.Inject;

public class OpenShiftPushTask extends KubernetesPushTask {
  @Inject
  public OpenShiftPushTask(Class<? extends OpenShiftExtension> extensionClass) {
    super(extensionClass);
    setDescription(
      "Uploads the built Docker images to a Docker registry");
  }

  @Override
  @Internal
  protected String getLogPrefix() {
    return OpenShiftExtension.DEFAULT_LOG_PREFIX;
  }
}