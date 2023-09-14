@team_07 @Gokhan
Feature: US08-09 MANAGEMENT ON SCHOOLS PAGE TEST

  Scenario Outline: Vice Dean ders oluşturabilmelidir.Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir.
    Given kullanici "managementUrl" sayfasina gider
    Then Login butonuna tıklanmali
    And Vice dean kullanicisi ile giris yapmak icin "username" girilmeli
    And "password" girilmeli
    And Login Butonuna tiklanmali
    And Acilan sayfada lessons butonua tiklanmali
    And Lesson Management AddLesson "<Lesson Name>" girilmeli
    And Compulsory kutucugunu isaretlenmeli
    And Credit "<Credit Score>" girilmeli
    And Submit butona tiklanmali
    And Kullanici 2 saniye bekler
    And Dersin olusturuldugunu dogrulanmali
    And En son sayfaya gitme sekmesine tiklar
    Then Eklenen Dersler Silinebilmeli
    And Derslerin silindigi dogrulanmali
    And Sayfayi kapatir
    Examples:
      | Lesson Name     | Credit Score |
      | Kahve Dersi     | 10           |
      | Barista Dersi   | 15           |
      | Musteri Egitimi | -10          |




