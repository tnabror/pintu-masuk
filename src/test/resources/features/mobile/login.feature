@login @android
Feature: Register and login

  Scenario: Verify user is able to login using account that already registered
    Given user is on login page
    When user click button create one
    When user input name "test"
    When user input email "test@mail.com"
    When user input password "1234"
    When user input confirm password "1234"
    When user click button register
    When user click link login
    When user input email "test@mail.com"
    When user input password "1234"
    When user click button login
    Then user should successfully login