package com.bptn.CucumberAutomation.cucumberRunners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//@SelectClasspathResource("com/bptn/CucumberAutomation/features/example.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/features/calculator.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/features/strongPassword.feature")
@SelectClasspathResource("com/bptn/CucumberAutomation/features/signUp.feature")
//@SelectClasspathResource("com/bptn/CucumberAutomation/features/login.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.bptn.CucumberAutomation")
@IncludeTags("ValidUserInformation")
public class RunCucumberTest {
}