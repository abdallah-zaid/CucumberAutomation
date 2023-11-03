Feature: Strong Password Validation

  Scenario: Validate Strong Password
    Given a user with password "Strong@123"
    Then the password should be strong