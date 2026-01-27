@smoke
Feature: Login Feature

  # Valid login scenario
  Scenario: Valid login
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  @regression
  Scenario Outline: Invalid login
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

     Examples: 
      | username | password                  |
      | vinit99  | WhVUWZyTAFRnPea6XB9VKQ== |
      | vinit1   | WhVUWZyTAFRnPea6XB9VKQ==7 |
 
