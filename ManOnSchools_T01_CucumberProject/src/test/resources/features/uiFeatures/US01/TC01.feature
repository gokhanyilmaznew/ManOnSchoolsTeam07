
@Zeliha0101
Feature:Aday ögrenciler sisteme kayıt olabilmelidir
   Scenario: TC01_Kullanici_valid_degerler_ile_register_olabilmelidir
      Given Kullanici register a tiklar
      When Name kutusuna "bir isim" girer
      And Surname kutusuna "bir soyisim" girer
      And Birth Place "bir yer ismi" girer
      And Phone kutusuna "bir telefon numarasi" girer
      And Gender bolumunden bir cinsiyet secer
      And Date Of Birth bolumune bir tarih girer
      And Ssn kutusuna bir numara girer
      And User Name kutusuna bir "kullanici adi" girer
      And Password kutusuna "bir sifre" girer
      And Kullanici register butonuna tiklar
      Then Guest User Registeted Pop-Up mesajinin gorunur oldugu dogrulanir

     #@pass
