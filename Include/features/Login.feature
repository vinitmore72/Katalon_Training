@smoke
Feature: Login Feature

  Scenario: Valid login
    Given user is on login page
    When user enters valid username and password
    Then user should be logged in successfully

  @regression
  Scenario Outline: Invalid login
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then error message should be displayed

    Examples: 
      | username | password                  |
      | vinit99  | WhVUWZyTAFRnPea6XB9VKQ==  |
      | vinit1   | WhVUWZyTAFRnPea6XB9VKQ==7 |
