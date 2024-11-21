package com.crm.qa.testcases.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
    features = "src/test/resource/feature/sample.feature",
    plugin = {"pretty", "html:target/cucumber-reports"},// Path to feature files
    glue = "com/crm/qa/testcases/loginPage",  // Path to step definition classes
   tags = "@test"
)
public class RunnerFile extends AbstractTestNGCucumberTests {
    // Empty class as it uses annotations to run tests
}
