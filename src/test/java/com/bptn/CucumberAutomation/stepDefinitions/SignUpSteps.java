package com.bptn.CucumberAutomation.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class SignUpSteps {

	@Given("a user visits the sign-up page")
	public void a_user_visits_the_sign_up_page() {
		System.out.println("User visits the sign-up page");
	}

	@When("the user enters the following user information:")
	public void the_user_enters_the_following_user_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : data) {

			String firstName = row.get("First Name"); // using the key to get the value
			String lastName = row.get("Last Name");
			String email = row.get("Email");
			String password = row.get("Password");

			System.out.println("User enters the following user information:");
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: " + lastName);
			System.out.println("Email: " + email);
			System.out.println("Password: " + password);
		}
	}

	@When("the user clicks the sign-up button")
	public void the_user_clicks_the_sign_up_button() {
		System.out.println("User clicks the sign-up button");
	}

	@Then("the user should be registered successfully")
	public void the_user_should_be_registered_successfully() {
		System.out.println("User should be registered successfully");
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
		System.out.println("User should see an error message");
	}
}