package com.bptn.CucumberAutomation.stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;

import com.bptn.CucumberAutomation.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	@Autowired
	LoginPage loginPage;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		this.loginPage.openLoginPage();
	}

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
		this.loginPage.setUsername(username);
		this.loginPage.setPassword(password);
	}

	@When("I click Submit")
	public void i_click_submit() {
		this.loginPage.clickSubmit();
	}

	@Then("I see the message {string}")
	public void i_see_the_message(String message) {
		assertTrue(this.loginPage.verifyMessage(message), "Message Not Found: " + message);
	}

}