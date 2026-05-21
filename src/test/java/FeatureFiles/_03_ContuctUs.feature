
#Senaryo (Test Case)
#1- ContactUs a tıklayınız
#2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
#3- Submit ettikten sonra url deki success yazısını doğrulayınız.
Feature: Contact Us Message Submission

  Scenario: Successful message submission
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully
    And User navigates to the Contact Us page
    When User enters a message with at least 10 characters
    And User clicks the Submit button
    Then URL should contain "success"