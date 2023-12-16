@US014
Feature: US014 Robot class reusable method kullanimi

  Scenario: TC01 verilen adrese dosya yüklemer
    Given kullanıcı "https://www.ilovepdf.com/compress_pdf" sayfasına gider
    When yuklenmek istenen dosyayi yukler
    Then dosyanin basariyla yuklendigini test eder
    And sayfayı kapatır