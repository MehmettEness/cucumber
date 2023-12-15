@US012
Feature: US012 BlueRentalCar sayffasinda login işlemi
  Scenario: TC01 Exceldeki email ve password bilgileri ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And exceldeki "admin_info" sayfasindaki kullanici bilgiler ile login olur
    And sayfayı kapatır