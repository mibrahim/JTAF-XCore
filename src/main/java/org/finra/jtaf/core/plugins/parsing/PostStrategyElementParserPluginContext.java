/*
 * (C) Copyright 2014 Java Test Automation Framework Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.finra.jtaf.core.plugins.parsing;

import org.finra.jtaf.core.model.test.TestAgenda;
import org.w3c.dom.Element;

/***
 * Exposes the data that can be used and/or modified by a IPostParseStrategyElementPlugin.
 */
public class PostStrategyElementParserPluginContext {
    private TestAgenda testAgenda;
    private Element element;

    public PostStrategyElementParserPluginContext(TestAgenda testAgenda, Element element) {
        this.testAgenda = testAgenda;
        this.element = element;
    }

    /***
     * Returns the Test Agenda associated with the test run, so plugins can read and modify the data
     *
     * @return testAgenda
     */
    public TestAgenda getTestAgenda() {
        return testAgenda;
    }

    /***
     * Returns the parsed Element object so that the relevant xml data can be used
     * in the plugin
     *
     * @return element
     */
    public Element getElement() {
        return element;
    }
}
