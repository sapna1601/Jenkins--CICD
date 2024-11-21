package com.crm.qa.testcases.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resource/feature/sample.feature",  // Path to feature files
    glue = "com.crm.qa.testcases.loginPage.StepDefination",  // Path to step definition classes
    plugin = {"pretty", "html:target/cucumber-reports"}  // Optional report generation
)
public class RunnerFile extends AbstractTestNGCucumberTests {
    // Empty class as it uses annotations to run tests
}
