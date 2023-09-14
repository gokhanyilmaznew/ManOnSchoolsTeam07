package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {

    public MeetManagementPage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id= 'username']")
    public WebElement Username;

    @FindBy(xpath = "(//*[.='Login'])[2]")
    public WebElement Login;

    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[.='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "//div[@class=' css-13cymwt-control']")
    public WebElement chooseStudent;

    @FindBy(id="react-select-3-input") public WebElement chooseStudent1;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement date;

    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[.='Meet Saved Successfully'])[5]")
    public WebElement meetSaved;

    @FindBy(xpath = "(//h5[@bg='primary'])[1]")
    public WebElement addMeet;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement dateRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement startTimeRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement stopTimeRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement descRequired;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement description;

    @FindBy(xpath = "(//*[.='Description should be between 2 and 16 characters'])[3]")
    public WebElement descMistake;

    @FindBy(xpath = "(//*[.='ileri bir tarih olmalı'])[3]")
    public WebElement dateMistake;

    @FindBy(xpath = "(//*[.='Error: start time must not be greater than or equal to stop time'])[3]")
    public WebElement timeError;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTimeArea;




}
