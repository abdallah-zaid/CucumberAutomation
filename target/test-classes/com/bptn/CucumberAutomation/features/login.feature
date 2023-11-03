Feature: User Login

  Scenario Outline: Valid User Login
    Given a user is on the login page
     When the user enters valid username "<username>" and password "<password>"
     And the user clicks the login button
     Then the user should be logged in successfully

    Examples: 
       | username | password  |
       | user1    | password1 |
       | user2    | password2 |
       | user3    | password3 |