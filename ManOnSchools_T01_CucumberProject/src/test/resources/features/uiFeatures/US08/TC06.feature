@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC06_Lesson_Name_sembol_girilmeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lesson Name alanina "*" girer
    And Credit Score alanina "ders kredisini" yazar
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Dersin eklenmedigini dogrular