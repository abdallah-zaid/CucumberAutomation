package com.bptn.CucumberAutomation.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	// 1. Using Hooks for All Scenarios

	@Before
	public void beforeScenario() {
		// Code to run before every scenario
		System.out.println("Code to run before every scenario");
	}

	@After
	public void afterScenario() {
		// Code to run after every scenario
		System.out.println("Code to run after every scenario");
	}

	// 2. Using Hooks for Specific Tags

	@Before("@ExampleScenario")
	public void beforeExampleScenario(Scenario scenario) {
		// Add your setup code specific to the ExampleScenario tag
		System.out.println("Before Example Scenario: " + scenario.getName());
	}

	@After("@ExampleScenario")
	public void afterExampleScenario(Scenario scenario) {
		// Add your cleanup code specific to the ExampleScenario tag
		System.out.println("After Example Scenario: " + scenario.getName());
	}

}