@US006
Feature: US006 Google Testi

  Scenario Outline: TC01 Google sayfasında arama kutusunda arac aratılır
    Given kullanıcı "https://google.com" sayfasına gider
    When google arama kutusunda "<araclar>" aratır
    Then sayfa basliginin "<araclar>" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayı kapatır
    Examples:
      | araclar |
      | honda   |
      | toyota  |
      | BMW     |
      | ford    |

