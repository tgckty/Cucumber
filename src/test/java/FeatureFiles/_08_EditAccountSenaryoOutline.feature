# Senaryo
# 1- Siteyi açınız.
# 2- Edit Account sayfasına ulaşınız.
# 3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
# 4- Bu senaryoyu farklı 5 adet ad ve soyad ile test ediniz.

Feature: Edit Account Senaryo Outline

  Background:#before senaryo
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Edit Account
    And User navigates to the Edith Account page
    When User change "<firstname>" and "<lastname>" and click continue
    Then Account should successfully updated
    Examples:
      | firstname | lastname |
      | İsim1     | Soyisim1 |
      | İsim2     | Soyisim2 |
      | İsim3     | Soyisim3 |
      | İsim4     | Soyisim4 |
      | İsim5     | Soyisim5 |










