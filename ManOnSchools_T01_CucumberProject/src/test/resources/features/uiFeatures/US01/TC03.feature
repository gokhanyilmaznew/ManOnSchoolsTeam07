@Zeliha0103
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC03_Kullanici_register_olurken_name_kutusu_invalid_deger_kabul_etmemeli
    Given Kullanici register a tiklar
    When Name kutusuna "    " girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna bir "kullanici adi" girer
    And Password kutusuna "bir sifre" girer
    And Kullanici register butonuna tiklar
    Then Kullanici register olamamali
    #FAILL
