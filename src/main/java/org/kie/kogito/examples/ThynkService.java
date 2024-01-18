/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.examples;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.DataStream;
import org.drools.ruleunits.api.RuleUnitData;

import java.util.List;


public class ThynkService
        implements RuleUnitData
{

    private final DataStream<Claim> claims;
    private final DataStore<CodeGroup> codeGroups;
    private final DataStream<Alert> alerts;

    public DataStream<Claim> getClaims() {
        return claims;
    }

    public DataStream<Alert> getAlerts() {
        return alerts;
    }

    public DataStore<CodeGroup> getCodeGroups() {
        return codeGroups;
    }

    public ThynkService() {
        this.claims = DataSource.createStream();
        this.alerts = DataSource.createStream();
        this.codeGroups = DataSource.createStore();
        List<CodeGroup> codeGroups1 = CodeGroup.listAll();
        for (CodeGroup group: codeGroups1){
            this.codeGroups.add(group);
        }

    }


}
