@us10
Feature: US_10 Vice Dean ders programı oluşturabilmelidir.
  (Lesson Program - Add Lesson Program)
  Scenario: Vice Dean ders programı oluşturabilmelidir.
    Given Kullanıcı anasayfaya gider
    Then Anasayfadaki Login butonuna tıklar
    And Username kutucuğuna Vice Dean olarak kayıt yapılan kullanıcı adını girer
    And Password kutucuğuna Vice Dean olarak kayıt yapıldığı sırada belirlenen passwordu girer
    And Login'e tıklar
    And Açılan sayfada Lesson Program sekmesine tıklar
    And kullanıcı 2 saniye bekler
    And Choose Lesson dropdown'undan bir ders secer
    And kullanıcı 2 saniye bekler
    And Choose Education Term dropdown'undan eğitim dönemini seçer
    And kullanıcı 2 saniye bekler
    And Choose Day dropdown'undan gün seçer
    And kullanıcı 2 saniye bekler
    And Start time dropdown'undan başlangıç saati belirler
    And kullanıcı 2 saniye bekler
    And Stop time dropdown'undan bitiş saati belirler
    And kullanıcı 2 saniye bekler
    And Submit butonuna tıklar
    And kullanıcı 2 saniye bekler
    And Kullanıcı sayfayı kapatır
