@US010
Feature: US010 BlueRentalCar sayfasında login testi
  Scenario: TC01 verilen email ve password ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And verilen email ve password ile login olunur
      | email                         | password |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And sayfayı kapatır