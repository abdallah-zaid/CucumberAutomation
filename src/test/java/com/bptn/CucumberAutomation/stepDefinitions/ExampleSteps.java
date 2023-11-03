
package com.bptn.CucumberAutomation.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {

	@Given("an example scenario")
	public void an_example_scenario() {

		System.out.println("Executing 'anExampleScenario' step");
	}

	@When("all step definitions are implemented")
	public void all_step_definitions_are_implemented() {

		System.out.println("Executing 'allStepDefinitionsAreImplemented' step");
	}

	@When("additional steps are added")
	public void additional_steps_are_added() {

		System.out.println("Executing 'whenAdditionalStepsAreAdded' step");
	}

	@When("unnecessary steps are removed")
	public void unnecessary_steps_are_removed() {

		System.out.println("Executing 'butUnnecessaryStepsAreRemoved' step");
	}

	@Then("the scenario passes")
	public void the_scenario_passes() {

		System.out.println("Executing 'theScenarioPasses' step");
	}

}