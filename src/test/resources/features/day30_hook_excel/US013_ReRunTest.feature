@US013
Feature: US011 Google Testi hooks

  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
    Given kullanıcı "https://google.com" sayfasına gider
    When google arama kutusunda "ford" aratır
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayı kapatır

 @honda
  Scenario: TC02 Google sayfasinda arama kutusunda arac aratilir
    Given kullanıcı "https://google.com" sayfasına gider
    When  google arama kutusunda "honda" aratır
    Then sayfa basliginin "honda" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayı kapatır
@toyota
  Scenario: TC03 Google sayfasinda arama kutusunda arac aratilir
    Given kullanıcı "https://google.com" sayfasına gider
    When google arama kutusunda "toyota" aratır
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayı kapatır