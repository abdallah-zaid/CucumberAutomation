package com.bptn.CucumberAutomation.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartSteps {

	@Given("a user is logged in")
	public void a_user_is_logged_in() {
		System.out.println("User is logged in");
	}

	@Given("the user has items in their shopping cart")
	public void the_user_has_items_in_their_shopping_cart() {
		System.out.println("User has items in their shopping cart");
	}

	@When("the user adds an item to the cart")
	public void the_user_adds_an_item_to_the_cart() {
		System.out.println("User adds an item to the cart");
	}

	@Then("the item should be added successfully")
	public void the_item_should_be_added_successfully() {
		System.out.println("Item is added successfully");
	}

	@When("the user removes an item from the cart")
	public void the_user_removes_an_item_from_the_cart() {
		System.out.println("User removes an item from the cart");
	}

	@Then("the item should be removed successfully")
	public void the_item_should_be_removed_successfully() {
		System.out.println("Item is removed successfully");
	}

	@When("the user empties the cart")
	public void the_user_empties_the_cart() {
		System.out.println("User empties the cart");
	}

	@Then("the cart should be empty")
	public void the_cart_should_be_empty() {
		System.out.println("Cart is empty");
	}

}