@ShoppingCart
Feature: Shopping Cart

  Background:
    Given a user is logged in
      And the user has items in their shopping cart

  @AddToCart
  Scenario: Add item to cart
     When the user adds an item to the cart
     Then the item should be added successfully

  @RemoveFromCart
  Scenario: Remove item from cart
     When the user removes an item from the cart
     Then the item should be removed successfully

  @EmptyCart
  Scenario: Empty the cart
     When the user empties the cart
     Then the cart should be empty