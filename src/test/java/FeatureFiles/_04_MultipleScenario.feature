Feature: Multi Scenario

#Backgroundu before test gibi düşün. her testten önce burası çalışıyor
  Background:

    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Subscribe to Website

    And Navigate to NewsLetter
    When Click to Yes
    Then Success message should be displayed

  Scenario: Successful message submission

    And User navigates to the Contact Us page
    When User enters a message with at least 10 characters
    And User clicks the Submit button
    Then URL should contain "success"