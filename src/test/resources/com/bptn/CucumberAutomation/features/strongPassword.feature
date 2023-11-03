@StrongPasswordValidation
Feature: Strong Password Validation

  @ValidateStrongPassword
  Scenario: Validate Strong Password
    Given a user with password "Strong@123"
     Then the password should be strong