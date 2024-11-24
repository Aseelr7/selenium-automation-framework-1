Feature: Login Functionality

  Scenario Outline: Login using different credentials
    Given the user is on login page
    When user enters a valid "<username>" and "<password>"
    Then user should be navigated to dashboard

    Examples:
    / username  / password  /
    /validUsername/ validPaswword /
    /validUsername/ validPaswword /
    /validUsername/ invalidPaswword /
    /validUsername/ invalidPaswword /