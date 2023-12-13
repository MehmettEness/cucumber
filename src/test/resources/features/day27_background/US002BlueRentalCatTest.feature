@US002
Feature: US002 BlueRentalCar Test
  Scenario: TC01 Verilen email ve password ile login olunur
    Given Kullanici blueRentalCar sayfasina gider
    When  Login butonuna tiklar
    And email ve password bilgileri ile login olur
    And sayfayı kapatır