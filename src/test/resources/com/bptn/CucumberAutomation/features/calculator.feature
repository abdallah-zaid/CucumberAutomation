Feature: Simple Calculator

  Scenario: Addition
    Given I have entered the numbers 5 and 7 into the calculator
     When I press the add button
     Then the result should be 12 on the screen