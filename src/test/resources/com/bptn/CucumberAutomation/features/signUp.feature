Feature: User Sign Up

  Scenario: Sign Up with Valid User Information
    Given a user visits the sign-up page
     When the user enters the following user information:
       | First Name | Last Name | Email                | Password    |
       | John       | Doe       | john.doe@example.com | Password123 |
      And the user clicks the sign-up button
     Then the user should be registered successfully

  Scenario: Sign Up with Invalid User Information
    Given a user visits the sign-up page
    When the user enters the following user information:
      | First Name | Last Name | Email             | Password |
      | Jane       | Smith     | invalid_email.com | abc      |
     And the user clicks the sign-up button
    Then the user should see an error message
