@US001
#Runnerdaki tags ismini yazınca buraya aynısını yazdık. Önce runnerdaki yazılacak.
Feature: US001 Amazon Home Page Test

  Scenario: TC01 Arama kutusunda iphone aratılır
    Given kullanıcı amazon sayfasına gider
    When arama kutusunda iphone aratır
    And sayfayı kapatır

  Scenario: TC02 Arama kutusunda samsung aratilir
    Given kullanıcı amazon sayfasına gider
    When arama kutusunda samsung aratır
    And sayfayı kapatır


