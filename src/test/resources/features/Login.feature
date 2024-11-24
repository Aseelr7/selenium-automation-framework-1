Feature: Login Functionality

  Scenario: Login using valid credentials
    Given The user is on Login page
    When enters valid username and password
    Then user should be navigated to dashboard

  Scenario: Login using invalid credentials
    Given The user is on login page
    When Enters invalid username and password
    Then User should see Invalid username or password message


  Scenario Outline: Login using invalid credentials
    Given The user is on login page
    When Enters invalid "<username>" and "<password>"
    Then User should see Invalid username or password "<message>"

    Examples:
    / username    / password    / message   /
    / invalidUsername1    / invalidPassword1  / Invalid username or password! /
    / invalidUsername2   / invalidPassword2  /  Invalid username or password! /
    / invalidUsername3    / invalidPassword3  / Invalid username or password! /