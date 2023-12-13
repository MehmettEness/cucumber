@US004
Feature: US004 Amazon Testi
#Given kullanıcı "https://amazon.com" sayfasına gider. amazonStepDefinition da parametreli olarak yaptık. Önce çif tırnak koyduk sonra sarı olunca üzerine gelip otomatik olarak oluşturduk
#And arama kutusunda "nokia" aratır. aynı şekilde
  Background: Amazon sayfasına gidilir
    Given kullanıcı "https://amazon.com" sayfasına gider

  Scenario: TC01 Arama kutusunda nokia aratılır
    And arama kutusunda "nokia" aratır
    And sayfayı kapatır

  Scenario: TC02 Arama kutusunda nokia aratılır
    And arama kutusunda "java" aratır
    And sayfayı kapatır

  Scenario: TC03 Arama kutusunda nokia aratılır
    And arama kutusunda "selenium" aratır
    And sayfayı kapatır