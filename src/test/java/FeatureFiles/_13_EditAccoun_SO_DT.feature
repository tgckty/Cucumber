# Aşağıdaki senaryoyu 5 kez farklı datalarla çalıştırınız
Feature: DataTable and Senaryo Outline FunctionalityBackground:
  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Edit Account DataTable

    And Click on Element Navigate
      | EditAccount |

    And User sending info in Dialog
      | inputFirstname | <name>    |
      | inputLastname  | <surname> |

    And Click on Element Dialog
      | cntBtn |

    Then Account should successfully updated


    Examples:
      | name  | surname  |
      | İsim1 | Soyisim1 |
      | İsim2 | Soyisim2 |
      | İsim3 | Soyisim3 |
      | İsim4 | Soyisim4 |
      | İsim5 | Soyisim5 |
