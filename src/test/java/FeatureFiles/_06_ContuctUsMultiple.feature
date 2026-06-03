Feature: Multi Scenario Contuct Us Parameter

  Background:#before senaryo
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Contact Us Send a message
    And User navigates to the Contact Us page
    When User enters a message with at least 10 characters
    Then URL should contain success
  @Regression
  Scenario: Contact Us Send a message as a parameter
    And User navigates to the Contact Us page
    When Send a message as "Merhaba Testing dünyası 2: Cucumber dayız" and click to Submit
    Then URL should contain success