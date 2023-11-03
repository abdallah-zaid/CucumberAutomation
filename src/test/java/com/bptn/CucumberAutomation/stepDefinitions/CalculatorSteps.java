package com.bptn.CucumberAutomation.stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

	private int number1;
	private int number2;
	private int result;

	@Given("I have entered the numbers {int} and {int} into the calculator")
	public void i_have_entered_the_numbers_into_the_calculator(int number1, int number2) {

		this.number1 = number1;
		this.number2 = number2;
		System.out.println("Entered number1: " + number1);
		System.out.println("Entered number2: " + number2);
	}

	@When("I press the add button")
	public void i_press_the_add_button() {

		this.result = this.number1 + this.number2;
		System.out.println("Pressed the add button");
	}

	@Then("the result should be {int} on the screen")
	public void the_result_should_be_on_the_screen(int expectedResult) {

		assertEquals(expectedResult, this.result);
		System.out.println("Expected result: " + expectedResult);
		System.out.println("Actual result: " + this.result);

	}
}
