/*
 * Licensed to ObjectStyle LLC under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ObjectStyle LLC licenses
 * this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.bootique.agrest.cayenne41;

import io.bootique.BQModuleMetadata;
import io.bootique.BQModuleProvider;
import io.bootique.cayenne.v41.CayenneModuleProvider;
import io.bootique.di.BQModule;
import io.bootique.jersey.JerseyModuleProvider;

import java.util.Collection;

import static java.util.Arrays.asList;

public class AgrestModuleProvider implements BQModuleProvider {

    @Override
    public BQModule module() {
        return new AgrestModule();
    }

    @Override
    public BQModuleMetadata.Builder moduleBuilder() {
        return BQModuleProvider.super
                .moduleBuilder()
                .description("Provides integration with LinkRest framework.");
    }

    @Override
    public Collection<BQModuleProvider> dependencies() {
        return asList(
                new CayenneModuleProvider(),
                new JerseyModuleProvider()
        );
    }
}
