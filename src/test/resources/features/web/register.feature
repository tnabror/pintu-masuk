@register @web
Feature: Register Feature

  Scenario: Verify user can see information page when try to register via web
    Given user open "home" page
    When user click on the button get rupiah token from menu
    Then user can see information to get rupiah token

  Scenario: Verify user can see popup download app when try to register via web
    Given user open "home" page
    When user click on the button get rupiah token on the buttom page
    Then user can see popup information to download app