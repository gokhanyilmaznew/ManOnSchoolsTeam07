package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagement {

    public TeacherManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //----------US17
//    @FindBy(xpath ="//button[text()='Login']" )//ilk giris
//    public WebElement login;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[.='Login'])[2]")
    public WebElement Login;

    @FindBy(xpath = "//*[@id='lessonId']")
    public WebElement chooseLesson;

    @FindBy(xpath = "//*[@id='studentId']")
    public WebElement chooseStudent;

    @FindBy(xpath = "//*[@id='educationTermId']")
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "//*[@id='absentee']")
    public WebElement absentee;

    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement submit;

    @FindBy(xpath = "(//*[text()='Student Info saved Successfully'])")
    public WebElement studentInfoSavedSuccessfully;
    //(//*[@id="2"]/div[1]/div[2]

    @FindBy(xpath = "//*[text()='Required']")
    public WebElement required;

    @FindBy(xpath = "(//*[@class='Toastify__close-button Toastify__close-button--colored'])[1]")
    public WebElement alert;

    //----------US18

    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")
    public WebElement edit;

    @FindBy(xpath = "(//*[text()='Name'])[2]")
    public WebElement nameView;

    @FindBy(xpath = "(//*[text()='Choose Lesson'])[3]")
    public WebElement chooseLessonView;

    @FindBy(xpath = "(//*[text()='Choose Education Term'])[3]")
    public WebElement chooseEducationTermView;

    @FindBy(xpath = "(//*[@id='absentee'])[2]")
    public WebElement absenteeView;

    @FindBy(xpath = "(//*[@id='midtermExam'])[2]")
    public WebElement midtermExamView;

    @FindBy(xpath = "(//*[@id='finalExam'])[2]")
    public WebElement finalExamView;

    @FindBy(xpath = "(//*[@id='infoNote'])[2]")
    public WebElement infoNoteView;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[1]")
    public WebElement name2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[2]")
    public WebElement lessonName2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[3]")
    public WebElement absentee2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[4]")
    public WebElement midtermExam2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[5]")
    public WebElement finalExam2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[6]")
    public WebElement note2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[7]")
    public WebElement infoNote2View;

    @FindBy(xpath = "(//tr[td[span[text()='Ayse']]]//span)[8]")
    public WebElement averageView;

//    @FindBy(xpath = "(//*[@id='infoNote'])[2]")
//    public WebElement infoNotEnter;
    @FindBy(xpath = "(//*[@id='absentee'])[2]")
    public WebElement absenteeEnter;

    @FindBy(xpath = "(//*[text()='Submit'])[2]")
    public WebElement updateSubmit;

    @FindBy(xpath = "(//*[text()='Student Info updated Successfully'])[1]")
    public WebElement studentInfoUpdatedSuccessfully;

    @FindBy(xpath = "(//*[@class='btn-close'])[3]")
    public WebElement xButton;

    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement studentInfoDeletedSuccessfully;
    //(//div[text()='Student Info deleted Successfully'])[1]
    //(//*[text()='Student Info deleted Successfully'])[1]
    //(//div[@class='Toastify__toast-body'])[1]
    //(//*[text()='Student Info deleted Successfully'])[1]
    ////*[@role='alert']

    @FindBy(xpath = "(//*[@id='lessonId'])[2]")
    public WebElement chooseLesson1;











































}
