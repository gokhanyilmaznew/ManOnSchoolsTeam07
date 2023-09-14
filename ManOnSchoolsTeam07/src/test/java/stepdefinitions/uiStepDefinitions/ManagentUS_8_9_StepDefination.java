package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ManagementPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class ManagentUS_8_9_StepDefination {
    ManagementPages managementPage = new ManagementPages();

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Login butonuna tıklanmali")
    public void login_butonuna_tıklanmali() {
        managementPage = new ManagementPages();
        managementPage.loginbutton.click();
    }

    @And("Vice dean kullanicisi ile giris yapmak icin {string} girilmeli")
    public void viceDeanKullanicisiIleGirisYapmakIcinGirilmeli(String username) {
        managementPage.usernamee.sendKeys(ConfigReader.getProperty(username), Keys.TAB);
    }

    @And("{string} girilmeli")
    public void girilmeli(String password) {
        managementPage.passwordd.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Login Butonuna tiklanmali")
    public void loginButonunaTiklanmali() {
        managementPage.girisLoginButton.click();
    }

    @Then("Acilan sayfada lessons butonua tiklanmali")
    public void acilan_sayfada_lessons_butonua_tiklanmali() {
        managementPage.lessonButton.click();
    }

    @And("Lesson Management AddLesson {string} girilmeli")
    public void lessonManagementAddLessonGirilmeli(String name) {
        managementPage.lessonNameButton.sendKeys(name);
    }

    @Then("Compulsory kutucugunu isaretlenmeli")
    public void compulsory_kutucugunu_isaretlenmeli() {
        managementPage.compulsoryButton.click();
    }

    @And("Credit {string} girilmeli")
    public void creditGirilmeli(String sayi) {
        managementPage.creditScoreButton.sendKeys(sayi);
    }

    @Then("Submit butona tiklanmali")
    public void submit_butona_tiklanmali() throws InterruptedException {
        managementPage.submitScoreButton.click();
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        ReusableMethods.bekle(sayi);
    }

    @Then("Dersin olusturuldugunu dogrulanmali")
    public void dersin_olusturuldugunu_dogrulanmali() {
        managementPage = new ManagementPages();
        Assert.assertTrue(managementPage.lessonCreated.isDisplayed());

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @And("En son sayfaya gitme sekmesine tiklar")
    public void enSonSayfayaGitmeSekmesineTiklar() {
        managementPage = new ManagementPages();
        ReusableMethods.click(managementPage.ensonSayfayaGitButonEs);

    }

    @Then("Eklenen Dersler Silinebilmeli")
    public void eklenenDerslerSilinebilmeli() {
        managementPage = new ManagementPages();
        ReusableMethods.bekle(1);
        int trSize = managementPage.lessonSekmesiTRListEs.size() - 1;
        ReusableMethods.click(managementPage.deleteLessonButtonEs.get(trSize));
    }

    @And("Derslerin silindigi dogrulanmali")
    public void derslerinSilindigiDogrulanmali() {
        managementPage = new ManagementPages();
        ReusableMethods.bekle(2);
        Assert.assertTrue(managementPage.dersSilindiMesajiEs.isDisplayed());

    }
}

