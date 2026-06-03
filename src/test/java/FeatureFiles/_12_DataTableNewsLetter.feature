# Senaryolar
# 1- Newsletter  Subscribe işlemini abone olunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
# 2- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
# 3- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.

Feature: DataTable Newsletter Functionality 3 Test Case (Senaryo)
  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    And Click on Element Navigate
      | Newsletter |
    When Click on Element Dialog
      | yesRadioButton |
      | cntBtn |
    Then Success message should be displayed
      |Success: Your newsletter subscription has been successfully updated!|

  Scenario:
    And Click on Element Navigate
      | Newsletter |
    When Click on Element Dialog
      | noRadioButton |
      | cntBtn |
    Then Success message should be displayed
    |Success: Your newsletter subscription has been successfully updated!|

  Scenario:
    And Click on Element Navigate
      | Newsletter |
    When Check to unchecked option
    Then Success message should be displayed
      |Success: Your newsletter subscription has been successfully updated!|