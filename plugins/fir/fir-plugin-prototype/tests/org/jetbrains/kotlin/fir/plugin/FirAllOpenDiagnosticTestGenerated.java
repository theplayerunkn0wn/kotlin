/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.plugin;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/fir/fir-plugin-prototype/testData")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirAllOpenDiagnosticTestGenerated extends AbstractFirAllOpenDiagnosticTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTestData() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir/fir-plugin-prototype/testData"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("plugins/fir/fir-plugin-prototype/testData/checkers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Checkers extends AbstractFirAllOpenDiagnosticTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInCheckers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir/fir-plugin-prototype/testData/checkers"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/checkers/simple.kt");
        }
    }

    @TestMetadata("plugins/fir/fir-plugin-prototype/testData/memberGen")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MemberGen extends AbstractFirAllOpenDiagnosticTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInMemberGen() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir/fir-plugin-prototype/testData/memberGen"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("functionForProperty.kt")
        public void testFunctionForProperty() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/memberGen/functionForProperty.kt");
        }

        @TestMetadata("nestedClass.kt")
        public void testNestedClass() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/memberGen/nestedClass.kt");
        }

        @TestMetadata("recursiveNestedClasses.kt")
        public void testRecursiveNestedClasses() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/memberGen/recursiveNestedClasses.kt");
        }

        @TestMetadata("topLevelClass.kt")
        public void testTopLevelClass() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/memberGen/topLevelClass.kt");
        }
    }

    @TestMetadata("plugins/fir/fir-plugin-prototype/testData/status")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Status extends AbstractFirAllOpenDiagnosticTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInStatus() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir/fir-plugin-prototype/testData/status"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("metaAnnotation.kt")
        public void testMetaAnnotation() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/status/metaAnnotation.kt");
        }

        @TestMetadata("simpleAnnotation.kt")
        public void testSimpleAnnotation() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/status/simpleAnnotation.kt");
        }

        @TestMetadata("visibilityTransformation.kt")
        public void testVisibilityTransformation() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/status/visibilityTransformation.kt");
        }
    }

    @TestMetadata("plugins/fir/fir-plugin-prototype/testData/supertypes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Supertypes extends AbstractFirAllOpenDiagnosticTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInSupertypes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/fir/fir-plugin-prototype/testData/supertypes"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("plugins/fir/fir-plugin-prototype/testData/supertypes/simple.kt");
        }
    }
}
