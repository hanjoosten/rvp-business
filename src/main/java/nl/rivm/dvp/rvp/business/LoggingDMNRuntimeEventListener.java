package nl.rivm.dvp.rvp.business;

import org.kie.dmn.api.core.DMNResult;

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

import org.kie.dmn.api.core.event.AfterEvaluateAllEvent;
import org.kie.dmn.api.core.event.AfterEvaluateContextEntryEvent;
import org.kie.dmn.api.core.event.AfterEvaluateDecisionEvent;
import org.kie.dmn.api.core.event.AfterEvaluateDecisionTableEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateAllEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateContextEntryEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateDecisionEvent;
import org.kie.dmn.api.core.event.BeforeEvaluateDecisionTableEvent;
import org.kie.dmn.api.core.event.DMNEvent;
import org.kie.dmn.api.core.event.DMNRuntimeEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple utility class that logs the name of received events, used as base
 * class of
 * all the {@link DMNRuntimeEventListener}s instantiated in this example.
 */
class LoggingDMNRuntimeEventListener implements DMNRuntimeEventListener {

    private static final Logger LOG = LoggerFactory.getLogger(DMNRuntimeEventListener.class);
    private final String name;

    public LoggingDMNRuntimeEventListener(String name) {
        this.name = name;
    }

    @Override
    public void beforeEvaluateDecision(BeforeEvaluateDecisionEvent event) {
        log("BeforeEvaluateDecisionEvent", event);
        logInput(event.getResult());
    }

    @Override
    public void afterEvaluateDecision(AfterEvaluateDecisionEvent event) {
        log("AfterEvaluateDecisionEvent", event);
        logOutput(event.getResult());
    }

    @Override
    public void beforeEvaluateContextEntry(BeforeEvaluateContextEntryEvent event) {
        log("BeforeEvaluateContextEntryEvent", event);
    }

    @Override
    public void afterEvaluateContextEntry(AfterEvaluateContextEntryEvent event) {
        log("AfterEvaluateContextEntryEvent", event);
    }

    @Override
    public void beforeEvaluateDecisionTable(BeforeEvaluateDecisionTableEvent event) {
        log("BeforeEvaluateDecisionTableEvent", event);
    }

    @Override
    public void afterEvaluateDecisionTable(AfterEvaluateDecisionTableEvent event) {
        log("AfterEvaluateDecisionTableEvent", event);

    }

    @Override
    public void beforeEvaluateAll(BeforeEvaluateAllEvent event) {
        log("BeforeEvaluateAllEvent", event);
    }

    @Override
    public void afterEvaluateAll(AfterEvaluateAllEvent event) {
        log("AfterEvaluateAllEvent", event);
    }

    private void log(String string, DMNEvent event) {
        LOG.info("{} received by {}: {}", string, name, event);

    }

    private void logOutput(DMNResult x) {
        LOG.info("OUTPUT: \n{}", x.getContext());
    }

    private void logInput(DMNResult x) {
        LOG.info("INPUT: \n{}", x.getContext());
    }

}