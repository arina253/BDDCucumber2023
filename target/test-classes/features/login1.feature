Feature: User Login

  Scenario: Successful Login with Valid Credentials
    Given the user1 is on the login page
    When the user1 enters valid username and password
    And the clicks on the "Login" button
    Then the user1 should be redirected to the home/dashboard page