@meryem2
Feature: Admin ogrenci olusturabilmelidir
  Scenario: TC07_"Phone"_alani Bos_birakildiginda
    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Email kutusuna "bir eposta adresi" girer
    But "phone" alanini bos birakir
    Then "Phone" bolumunun zorunlu alan oldugu mesajinin gorundugunu dogrular