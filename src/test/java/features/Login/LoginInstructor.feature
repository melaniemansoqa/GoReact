@Chrome
Feature: Instructor Login

  Scenario: 01. Validate the title and url of a website
    Given a user is on the base page
    Then they see the page title contains "GoReact"
    And they see the page Url contains "https://dev.goreact.com/login"

  Scenario Outline: 02. Validate that an instructor cannot login to web app when using invalid password
    Given a user is on the base page
    When user inputs "<email>" on email field
    And user inputs "<password>" on password field
    And user clicks Login button
    Then a modal appears containing "Login failed" as title
    And the user clicks close button

    Examples:
      | email | password |
      | themelaniemanso@gmail.com | wrongpassword |

  Scenario Outline: 03. Validate that an instructor can login to web app
    Given a user is on the base page
    When user inputs "<email>" on email field
    And user inputs "<password>" on password field
    And user clicks Login button
    Then the user is on the dashboard page
    And they see the page Url contains "https://dev.goreact.com/dashboard/"

    Examples:
      | email | password |
      | themelaniemanso@gmail.com | Password**123 |
