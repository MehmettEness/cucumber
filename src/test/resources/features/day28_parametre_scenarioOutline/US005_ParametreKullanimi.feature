@US005
Feature: US005 Google Testi

  Scenario: TC01 Google sayfasında arama kutusunda arac aratılır
    Given kullanıcı "https://google.com" sayfasına gider
    When google arama kutusunda "ford" aratır
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayı kapatır


