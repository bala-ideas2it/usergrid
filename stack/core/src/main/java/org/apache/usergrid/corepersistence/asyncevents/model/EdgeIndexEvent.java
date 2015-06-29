/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.corepersistence.asyncevents.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.usergrid.persistence.core.scope.ApplicationScope;
import org.apache.usergrid.persistence.graph.Edge;
import org.apache.usergrid.persistence.model.entity.Entity;
import org.apache.usergrid.persistence.model.entity.Id;

import java.io.Serializable;

/**
 * Created by Jeff West on 5/25/15.
 */
@JsonDeserialize(as = AsyncEvent.class)
public final class EdgeIndexEvent
    extends AsyncEvent
    implements Serializable {

    /**
     * Needed by jackson
     */
    public EdgeIndexEvent() {
    }

    public EdgeIndexEvent(ApplicationScope applicationScope, Id entityId, Edge edge) {
        super(EventType.EDGE_INDEX, applicationScope, entityId, edge);
    }
}
