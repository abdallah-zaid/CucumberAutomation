package com.bptn.CucumberAutomation.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("a user is on the login page")
    public void a_user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }

    @When("the user enters valid username {string} and password {string}")
    public void the_user_enters_valid_username_and_password(String username, String password) {
        System.out.println("User enters valid username: " + username + " and password: " + password);
        
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        System.out.println("User clicks the login button");
         
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("User should be logged in successfully");
        
    }
}