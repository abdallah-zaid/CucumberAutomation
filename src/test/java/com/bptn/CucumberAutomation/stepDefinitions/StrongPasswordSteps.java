package com.bptn.CucumberAutomation.stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Pattern;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StrongPasswordSteps {

	private String password;

	@Given("a user with password {string}")
	public void a_user_with_password(String password) {
		this.password = password;
	}

	@Then("the password should be strong")
	public void the_password_should_be_strong() {
        
		boolean isStrong = this.validateStrongPassword();
		System.out.println("Is the password strong? " + isStrong);
		assertTrue(isStrong);
	}

	// this method will validate if the password is strong
	private boolean validateStrongPassword() {
		String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		boolean isStrong = Pattern.matches(passwordRegex, this.password);
		return isStrong;
	}
}