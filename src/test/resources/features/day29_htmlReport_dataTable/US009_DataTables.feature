@US009
Feature: US009 Google Testi

  Scenario: TC01 Google sayfasinda arama yapilir
    Given kullanıcı "https://google.com" sayfasına gider
    When kulllanici verilen bilgiler arama yapar
      | volvo |
      | audi  |
      | honda |
    And sayfayı kapatır

  Scenario: TC02 Google sayfasinda arama yapilir
    Given kullanıcı "https://google.com" sayfasına gider
    When kulllanici verilen bilgiler arama yapar ikinci yol
      | volvo |
      | audi  |
      | honda |
    And sayfayı kapatır