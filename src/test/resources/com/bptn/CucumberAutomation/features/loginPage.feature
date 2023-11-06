@WebTestLogin
Feature: Application Login

  @WebTest
  Scenario: Home page default login
    Given User is on the login page
    When User login into application with "user" and password "user"
    And I click Submit
    Then I see the message "Login successful"

  @WebTest
  Scenario: Failure login
    Given User is on the login page
    When User login into application with "bad-user" and password "bad-password"
    And I click Submit
    Then I see the message "Invalid credentials"
