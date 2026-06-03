Feature: Data Table Ornek

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Users List
    When write username "ismet"
    And write username and password "ismet" and "1234"

    And write username as Datatable
      | ismet |
      | Ali   |
      | Veli  |

    And write username and password  as Datatable
      | ismet | 1234  |
      | ali   | a1234 |
      | veli  | a1234 |