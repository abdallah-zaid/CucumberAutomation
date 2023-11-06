package com.bptn.CucumberAutomation.config;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.bptn.CucumberAutomation.AutomationApplication;

import io.cucumber.spring.CucumberContextConfiguration;
/**
 * Class to use spring application context while running cucumber
 */
@SpringBootTest
@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationApplication.class)
public class ContextConfig {
}