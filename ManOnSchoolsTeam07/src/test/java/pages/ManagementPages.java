package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ManagementPages {
    public ManagementPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginbutton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernamee;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordd;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement girisLoginButton;

    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonButton;

    @FindBy(xpath = "//*[@id='lessonName']")
    public WebElement lessonNameButton;

    @FindBy(xpath = "//*[@id='compulsory']")
    public WebElement compulsoryButton;

    @FindBy(xpath = "//*[@id='creditScore']")
    public WebElement creditScoreButton;

    @FindBy(xpath = "(//*[@type='button'])[9]")
    public WebElement submitScoreButton;

    @FindBy(xpath = "//*[text()='Lesson Created']")
    public WebElement lessonCreated;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//a[.='»Last']")
    public WebElement ensonSayfayaGitButonEs;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]/tbody/tr")
    public List<WebElement> lessonSekmesiTRListEs;

    @FindBy(xpath = "//*[@class='fa-solid fa-trash']")
    public List<WebElement> deleteLessonButtonEs;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[.='Lesson Deleted']")
    public WebElement dersSilindiMesajiEs;




}
