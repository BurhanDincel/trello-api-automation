package com.testinium.trello.runners;

import io.cucumber.junit.platform.engine.Cucumber;

/**
 * This class enables Cucumber to be executed using the JUnit5 platform.
 * JUnit5 discovers this test runner automatically during Maven Surefire execution.
 * Cucumber features under src/test/resources/features will be executed as test cases.
 */
@Cucumber
public class TestRunner {
    // No code is required here.
    // The @Cucumber annotation enables the JUnit5 platform engine for Cucumber.
}
