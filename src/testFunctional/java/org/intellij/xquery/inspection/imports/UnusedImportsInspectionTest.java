/*
 * Copyright 2013-2014 Grzegorz Ligas <ligasgr@gmail.com> and other contributors
 * (see the CONTRIBUTORS file).
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

package org.intellij.xquery.inspection.imports;

import org.intellij.xquery.BaseFunctionalTestCase;

public class UnusedImportsInspectionTest extends BaseFunctionalTestCase {

    @Override
    protected String getTestDataPath() {
        return "src/testFunctional/testData/org/intellij/xquery/inspection/imports";
    }

    public void testIncorrectFileType() {
        executeInspectionTest("IncorrectFileType.txt");
    }

    public void testImportWithDefaultNamespaceForFunctionCall() {
        executeInspectionTest();
    }

    public void testImportWithDefaultNamespaceForNamedFunctionRef() {
        executeInspectionTest();
    }

    public void testImportWithDefaultNamespaceForVariableRef() {
        executeInspectionTest();
    }

    public void testImportWithDefaultNamespaceUnused() {
        executeInspectionTest();
    }

    public void testImportWithoutPrefixWithDeclaredNamespace() {
        executeInspectionTest();
    }

    public void testImportWithoutPrefixWithoutDeclaredNamespace() {
        executeInspectionTest();
    }

    public void testImportWithPrefix() {
        executeInspectionTest();
    }

    private void executeInspectionTest() {
        executeInspectionTest(getDefaultFileName());
    }

    private void executeInspectionTest(String filename) {
        myFixture.enableInspections(UnusedImportsInspection.class);
        myFixture.testHighlighting(true, false, false, filename);
    }
}
