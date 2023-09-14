package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MeetManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_TeacherMeetManagementStepDefs {

    MeetManagementPage meetManagementPage = new MeetManagementPage();

    @Given("User navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

        @And("User waits {int} seconds")
        public void userWaitsSeconds ( int sayi) throws InterruptedException {
            try {
                Thread.sleep(sayi * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            @Then("User clicks on {string} on home page")
            public void userClicksOnOnHomePage(String loginUrl) {
                Driver.getDriver().get(ConfigReader.getProperty(loginUrl));
            }


    @And("User enters a user name and password {string},{string}")
    public void userEntersAUserNameAndPassword(String userName, String password) {
        meetManagementPage.Username.sendKeys(ConfigReader.getProperty(userName),Keys.TAB,(ConfigReader.getProperty(password)));
    }

    @Then("User clicks on log in")
    public void user_clicks_on_log_in() {
        meetManagementPage.Login.click();
    }

        @And("User click on Menu Button")
        public void userClickOnMenuButton () {
        meetManagementPage.menuButton.click();
        }


        @And("Verify the Meet Management button is clickable")
        public void verifyTheMeetManagementButtonIsClickable () {
        ReusableMethods.visibleWait(meetManagementPage.meetManagement,5);
        Assert.assertTrue(meetManagementPage.meetManagement.isDisplayed());
        }

    @And("Click the Meet Management button")
    public void clickTheMeetManagementButton() {
        meetManagementPage.meetManagement.click();
    }

        @And("Verify that the 'Add Meet' text appears")
        public void verifyThatTheTitleContains (){
        ReusableMethods.visibleWait(meetManagementPage.addMeet,3);
        Assert.assertTrue(meetManagementPage.addMeet.isDisplayed());
        }

    @And("User selects the student from the Choose Student section {string}")
    public void userSelectsTheStudentFromTheChooseStudentsection(String studentName) {
        ReusableMethods.bekle(2);
        meetManagementPage.chooseStudent.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(ConfigReader.getProperty(studentName),Keys.ENTER,Keys.TAB).perform();
        ReusableMethods.bekle(3);
    }



    @And("enters a future date,start time and end time and a description between '2-16' characters {string},{string},{string},{string}")
    public void entersAFutureDateStartTimeAndEndTimeAndADescriptionBetweenCharacters( String date, String startTime, String stopTime, String desc)
    {
        ReusableMethods.bekle(2);
        meetManagementPage.date.sendKeys(date,Keys.TAB,startTime,Keys.TAB,stopTime,Keys.TAB,desc,Keys.TAB);
    }

    

        @And("Click the submit button")
        public void clickTheSubmitButton () {
        ReusableMethods.bekle(2);
        meetManagementPage.submitButton.click();
        }

        @And("User sees the message {string}")
        public void userSeesTheMessage (String popUp1){
        ReusableMethods.visibleWait(meetManagementPage.meetSaved,2);
        Assert.assertTrue(meetManagementPage.meetSaved.isDisplayed());
        }

    @And("User selects the student from the Choose Student Section {string}")
    public void userSelectsTheStudentFromTheChooseStudentSection(String studentName2) {
        ReusableMethods.bekle(2);
        meetManagementPage.chooseStudent.click();
        ReusableMethods.bekle(2);
       Actions actions = new Actions(Driver.getDriver());
       actions.sendKeys(ConfigReader.getProperty(studentName2),Keys.ENTER,Keys.TAB).perform();
       // addAndUpdateMeetList.chooseStudent.sendKeys(ConfigReader.getProperty(studentName2),Keys.ENTER);
        ReusableMethods.bekle(2);

    }

    @And("leave date of meet blank and enter start time, stop time and description {string},{string},{string}")
    public void leaveDateOfMeetBlankAndEnterStartTimeStopTimeAndDescription(String startTime, String stopTime, String desc) {
        //addAndUpdateMeetList.date.click();
        ReusableMethods.bekle(2);
        meetManagementPage.startTimeArea.sendKeys(startTime,Keys.TAB,stopTime,Keys.TAB,desc);
    }

    @And("Refresh page")
    public void refreshPage() {
        Driver.getDriver().navigate().refresh();
    }

    @And("select the past date from date of meet {string},{string},{string},{string}")
    public void selectThePastDateFromDateOfMeet(String pastDate, String startTime, String stopTime, String desc) {
        //addAndUpdateMeetList.date.click();
        meetManagementPage.date.sendKeys(pastDate,Keys.TAB,startTime,Keys.TAB,stopTime,Keys.TAB,desc);
    }

    @And("start time field is left blank and other fields are filled {string},{string},{string}")
    public void startTimeFieldIsLeftBlankAndOtherFieldsAreFilled(String date, String stopTime, String desc) {
        //addAndUpdateMeetList.date.click();
        meetManagementPage.date.sendKeys(date,Keys.TAB,Keys.TAB,Keys.TAB,stopTime,Keys.TAB,desc);
    }

    @And("stop time field is left blank and other fields are filled {string},{string},{string}")
    public void stopTimeFieldIsLeftBlankAndOtherFieldsAreFilled(String date, String startTime, String desc) {
        //addAndUpdateMeetList.date.click();
        meetManagementPage.date.sendKeys(date,Keys.TAB,startTime,Keys.TAB,Keys.TAB,Keys.TAB,desc);
    }

    @And("Select date, enter description and enter stop time earlier than start time.{string},{string},{string},{string}")
    public void selectDateEnterDescriptionAndEnterStopTimeEarlierThanStartTime(String date, String startTime, String stoptime, String desc) {
        //addAndUpdateMeetList.date.click();
        meetManagementPage.date.sendKeys(date,Keys.TAB,startTime,Keys.TAB,stoptime,Keys.TAB,desc);
    }


    @And("Verify that the {string} message appears")
    public void verifyThatTheMessageAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.dateMistake,2);
        Assert.assertTrue(meetManagementPage.dateMistake.isDisplayed());

    }

    @And("Verify that {string} text appears")
    public void verifyThatTextAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.timeError,2);
        Assert.assertTrue(meetManagementPage.timeError.isDisplayed());

    }

    @And("Description is left blank and other fields are filled {string},{string},{string}")
    public void descriptionIsLeftBlankAndOtherFieldsAreFilled(String date, String startTime, String stopTime) {
        meetManagementPage.date.sendKeys(date,Keys.TAB,startTime,Keys.TAB,stopTime);
    }



    @And("Verify that the {string} text Appears")
    public void verifyThatTheTextAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.descMistake,3);
        Assert.assertTrue(meetManagementPage.descMistake.isDisplayed());

    }

    @And("Confirm for date that the {string} text appears.")
    public void confirmForDateThatTheTextAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.dateRequired,2);
        Assert.assertTrue(meetManagementPage.dateRequired.isDisplayed());
    }

    @And("Confirm for start time that the {string} text appears.")
    public void confirmForStartTimeThatTheTextAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.startTimeRequired,2);
        Assert.assertTrue(meetManagementPage.startTimeRequired.isDisplayed());
    }

    @And("Confirm for stop time that the {string} text appears.")
    public void confirmForStopTimeThatTheTextAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.stopTimeRequired,2);
        Assert.assertTrue(meetManagementPage.stopTimeRequired.isDisplayed());
        
    }

    @And("Confirm for description that the {string} text appears.")
    public void confirmForDescriptionThatTheTextAppears(String text) {
        ReusableMethods.visibleWait(meetManagementPage.descRequired,2);
        Assert.assertTrue(meetManagementPage.descRequired.isDisplayed());
    }

    @And("Enter a one-character text in Description {string}")
    public void enterAOneCharacterTextInDescription(String desc) {
        meetManagementPage.description.sendKeys(desc);
        ReusableMethods.bekle(2);
    }






    }




