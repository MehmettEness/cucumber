#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli

#TEST DATA
#url : https://www.bluerentalcars.com/
#Managers:
#| ayhancan@bluerentalcars.com   | ayhan    |
#| beyhancan@bluerentalcars.com  | beyhan   |
#| sam.walker@bluerentalcars.com | sami     |
#| john_doe@gmail.com            | johndoe  |
#| johnson@bluerentalcars.com    | johnson  |
@US007
Feature: US007 BlueRentalCar login islemi

  Scenario Outline: TC01 Kullanici manager login bilgileri ile giriş yapabilmeli
    Given kullanıcı "https://www.bluerentalcars.com/" sayfasına gider
    When Login butonuna tiklar
    And kullanici "<email>" ve "<password>" bilgilerini girer
    Then  login olduğunu doğrular
    And sayfayı kapatır
    Examples:
      | email                         | password |
      | ayhancan@bluerentalcars.com   | ayhan    |
      | beyhancan@bluerentalcars.com  | beyhan   |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |