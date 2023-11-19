Feature: Login to www.saucedemo.com with Multiple Users and Check Login Status

  Scenario Outline: Login with different user credentials and check login status
    Given the user is on the Saucedemo login page
    When the user enters username "<username>" and password "<password>"
    And  clicks the login button
    Then the user login status should be "<login_status>"

    Examples:
      | username           | password       | login_status |
      | standard_user      | secret_sauce   | successful   |
      | locked_out_user    | secret_sauce   | unsuccessful |
      | problem_user       | secret_sauce   | unsuccessful |
      | performance_user   | secret_sauce   | successful   |
      | special_chars_user | !@#\$%^&*()    | successful   |
