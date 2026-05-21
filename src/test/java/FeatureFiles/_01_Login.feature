Feature: Login fuctionality
  Scenario: Login with valid username and password
#featurelar file olarak eklenip uzantısı feature yapılıyor

  #üzerine gelip create step definition denir. otomatik oluşturur adımları.
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully