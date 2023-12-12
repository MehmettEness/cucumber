#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

@US003
  Feature: US003 Amazon Test
@iphone
    Scenario:TC01 arama kutusunda iphone aratilir
      Given kullanıcı amazon sayfasına gider
      When arama kutusunda iphone aratır
      And sayfayı kapatır
@samsung
    Scenario:TC02 arama kutusunda samsung aratilir
      Given kullanıcı amazon sayfasına gider
      When arama kutusunda samsung aratır
      And sayfayı kapatır
@nokia
    Scenario:TC03 arama kutusunda nokia aratilir
      Given kullanıcı amazon sayfasına gider
      When arama kutusunda nokia aratır
      And sayfayı kapatır