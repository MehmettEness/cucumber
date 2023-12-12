#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.
  #Tekrarlanan kodlar için Backgroung notasyonu vardır. Bunları Bacground içine yazarız

@US003
  Feature: US003 Amazon Test

    Background:
      Given kullanıcı amazon sayfasına gider
@iphone
    Scenario:TC01 arama kutusunda iphone aratilir
      When arama kutusunda iphone aratır
      And sayfayı kapatır
@samsung
    Scenario:TC02 arama kutusunda samsung aratilir
      When arama kutusunda samsung aratır
      And sayfayı kapatır
@nokia
    Scenario:TC03 arama kutusunda nokia aratilir
      When arama kutusunda nokia aratır
      And sayfayı kapatır