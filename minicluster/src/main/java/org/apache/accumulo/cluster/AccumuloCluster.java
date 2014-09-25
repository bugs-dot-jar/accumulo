/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.cluster;

import org.apache.accumulo.core.client.AccumuloException;
import org.apache.accumulo.core.client.AccumuloSecurityException;
import org.apache.accumulo.core.client.ClientConfiguration;
import org.apache.accumulo.core.client.Connector;
import org.apache.accumulo.core.client.security.tokens.AuthenticationToken;

/**
 * Defines a minimum required set of methods to run an Accumulo cluster.
 *
 * (Experimental, not guaranteed to stay backwards compatible)
 *
 * @since 1.6.0
 */

public interface AccumuloCluster {

  /**
   * @return Accumulo instance name
   */
  public String getInstanceName();

  /**
   * @return zookeeper connection string
   */
  public String getZooKeepers();

  /**
   * Utility method to get a connector to the cluster.
   */
  public Connector getConnector(String user, AuthenticationToken token) throws AccumuloException, AccumuloSecurityException;

  /**
   * Get the client configuration for the cluster
   */
  public ClientConfiguration getClientConfig();
}
