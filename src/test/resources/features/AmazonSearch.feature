Feature: Amazon Search functionality

  Scenario: Searching for OCA
    Given user is in the amazon homepage
    When user clicks on the search bar
    And user types the "OCA" in search bar
    Then  user should be able to see the "OCA" in the page


  Scenario Outline: Searching for different books
    Given user is in the amazon homepage
    When user clicks on the search bar
    And user types the "<BookName>" in search bar
    Then  user should be able to see the "<BookNameResults>" in the page

    Examples:

      | BookName              | BookNameResults                 |
      | OCA                   | Oracle Certified Associate Java |
      | Java for Dummies      | Java for Dummies first edition  |
      | Java for Dummies vol2 | Java for Dummies second edition |


Feature Instagram Login feature

  Scenario: Logging in using valid credentials
    Given user is in the login page of Instagram
    When user clicks on the email field
    And user enters his email or his username
    And user clicks on the password field
    And user enters his password
    Then user should be navigated to the homepage

  Scenario Outline: Logging in with invalid credentials
    Given user is in the login page of Instagram
    When user clicks on the email field
    And user enters an invalid "<email>"
    And user clicks on the password field
    And user enters an invalid "<password>"
    Then user should be able to see the error message "<message>"

      | email                | password     | message                      |
      | asdf@gmaisl.com      | asdkfj83     | Invalid username or password |
      | asdf@gmaasdl.dom     | asaadddkfj83 | Invalid username or password |
      | asdf@gmaisl.com      | asdkfj8asdf3 | Invalid username or password |
      | asdf@gmaiddfassl.com | asdkfj83asd  | Invalid username or password |
