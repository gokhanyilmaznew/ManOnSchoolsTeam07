package stepdefinitions.uiStepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TeacherManagement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US17_US18_TeacherManagementStepDefinition {

    TeacherManagement teacherManagement = new TeacherManagement();

    @Given("User navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("User waits {int} seconds")
    public void userWaitsSeconds(int sayi) throws InterruptedException {
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

        teacherManagement.username.sendKeys(ConfigReader.getProperty(userName), Keys.TAB, (ConfigReader.getProperty(password)));
    }

    @Then("User clicks on log in")
    public void user_clicks_on_log_in() {
        teacherManagement.Login.click();
    }


    @Then("User choose a lesson on Student Info Management")
    public void user_choose_a_lesson_on_student_info_management() {

        ReusableMethods.ddmVisibleText(teacherManagement.chooseLesson, "Selenium");

    }

    @Then("User choose a student name on Student Info Management")
    public void user_choose_a_student_name_on_student_info_management() {

        ReusableMethods.ddmVisibleText(teacherManagement.chooseStudent, "Ayse Tezgel");

    }

    @Then("User choose a education term on Student Info Management")
    public void user_choose_a_education_term_on_student_info_management() {
        ReusableMethods.ddmVisibleText(teacherManagement.chooseEducationTerm, "FALL_SEMESTER");

    }

    @When("User enters absences, midterm exam, final exam, info note on Student Info Management {string},{string},{string},{string}")
    public void userEntersAbsencesMidtermExamFinalExamInfoNoteOnStudentInfoManagement(String absentee, String midtermExam, String finalExam, String infoNote) {
        teacherManagement.absentee.sendKeys(absentee, Keys.TAB, midtermExam, Keys.TAB, finalExam, Keys.TAB, infoNote);
    }


    @When("User clicks submit button on Student Info Management")
    public void user_clicks_submit_button_on_student_info_management() {

        teacherManagement.submit.click();
    }


    @And("Verify student info is visible on the student info list {string}")
    public void verifyStudentInfoIsVisibleOnTheStudentInfoList(String popUp1) {
        ReusableMethods.visibleWait(teacherManagement.studentInfoSavedSuccessfully, 5);
        Assert.assertTrue(teacherManagement.studentInfoSavedSuccessfully.getText().contains(popUp1));
    }


    @When("User leave the absentee field empty and fills in the other fields on Student Info Management {string},{string},{string}")
    public void userLeaveTheAbsenteeFieldEmptyAndFillsInTheOtherFieldsOnStudentInfoManagement(String midtermExam, String finalExam, String infoNote) {
        teacherManagement.absentee.sendKeys(Keys.TAB, midtermExam, Keys.TAB, finalExam, Keys.TAB, infoNote);
    }


    @And("User views {string}")
    public void userViews(String Required) {
        ReusableMethods.visibleWait(teacherManagement.required, 5);
        Assert.assertEquals("Required", teacherManagement.required.getText());


    }

    @When("User enter letters the absentee field empty and fills in the other fields on Student Info Management {string},{string},{string},{string}")
    public void userEnterLettersTheAbsenteeFieldEmptyAndFillsInTheOtherFieldsOnStudentInfoManagement(String absentee, String midtermExam, String finalExam, String infoNote) {
        teacherManagement.absentee.sendKeys(absentee, Keys.TAB, midtermExam, Keys.TAB, finalExam, Keys.TAB, infoNote);
    }


    @And("User sees {string}")
    public void userSees(String popUp2) {

        Assert.assertFalse(teacherManagement.alert.getText().contains(popUp2));
        //assertFalse(homePage.verifyText.getText().contains(expectedText));
        // Driver.getDriver().switchTo().alert();
        // ReusableMethods.visibleWait(teacherManagement.alert,5);
        // Assert.assertTrue(teacherManagement.alert.getText().contains(popUp2));


    }

    @When("User close the page")
    public void user_close_the_page() {
        Driver.closeDriver();
    }

    ///---------->18


    @And("User views name")
    public void userViewsName() {

        Assert.assertTrue(teacherManagement.name2View.isDisplayed());
    }

    @And("User views Choose Lesson")
    public void userViewsChooseLesson() {
        Assert.assertTrue(teacherManagement.lessonName2View.isDisplayed());
    }

    @And("User views Absentee")
    public void userViewsAbsentee() {
        Assert.assertTrue(teacherManagement.absentee2View.isDisplayed());
    }

    @And("User views Midterm Exam")
    public void userViewsMidtermExam() {

        Assert.assertTrue(teacherManagement.midtermExam2View.isDisplayed());
    }

    @And("User views Final Exam")
    public void userViewsFinalExam() {
        Assert.assertTrue(teacherManagement.finalExam2View.isDisplayed());
    }

    @And("User views Note")
    public void userViewsNote() {
        Assert.assertTrue(teacherManagement.note2View.isDisplayed());
    }

    @And("User views Info Note")
    public void userViewsInfoNote() {
        Assert.assertTrue(teacherManagement.infoNote2View.isDisplayed());
    }

    @And("User views Average")
    public void userViewsAverage() {
        Assert.assertTrue(teacherManagement.averageView.isDisplayed());
    }

    @When("User clicks edit button")
    public void userClicksEditButton() {

        ReusableMethods.click(teacherManagement.edit);

        //String selectAll = Keys.chord(Keys.CONTROL, "a",Keys.BACK_SPACE);
        // homePage.editMidtermExam.sendKeys(selectAll,"100");
    }

    @And("User updates  {string}, {string}, {string}, {string}")
    public void userUpdates(String absentee, String midtermExam, String finalExam, String infoNote) {
        String selectAll = Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE);
        teacherManagement.absenteeEnter.sendKeys(absentee, Keys.TAB, midtermExam, Keys.TAB, finalExam, Keys.TAB, infoNote);

    }

    @And("User clicks Submit button")
    public void userClicksSubmitButton() {
        teacherManagement.updateSubmit.click();
    }

    @And("User verify {string}")
    public void userVerify(String update) {
        ReusableMethods.visibleWait(teacherManagement.studentInfoUpdatedSuccessfully, 5);
        Assert.assertTrue(teacherManagement.studentInfoUpdatedSuccessfully.getText().contains(update));
    }

    @And("user clicks x button")
    public void userClicksXButton() {
        teacherManagement.xButton.click();
    }

    @And("user clicks deleteButton")
    public void userClicksDeleteButton() {

        ReusableMethods.click(teacherManagement.deleteButton);
        ReusableMethods.bekle(3);

    }


    @And("User  don't choose Lesson and User fills in the other fields")
    public void userDonTChooseLessonAndUserFillsInTheOtherFields() {

        ReusableMethods.ddmVisibleText(teacherManagement.chooseLesson1, "Choose Lesson");

    }


    @And("User verify delete {string}")
    public void user_verify_delete(String delete) {

      // Assert.assertEquals(delete,teacherManagement.studentInfoDeletedSuccessfully.getText());
      // Assert.assertTrue(teacherManagement.studentInfoDeletedSuccessfully.getText().contains(delete));
        ReusableMethods.visibleWait(teacherManagement.studentInfoDeletedSuccessfully, 5);
        ReusableMethods.alertAccept();
        Assert.assertEquals("Student Info deleted Successfully", teacherManagement.studentInfoDeletedSuccessfully.getText());


    }

    @And("User should see {string}")
    public void userShouldSee(String popUp3) {

        Assert.assertFalse(teacherManagement.alert.getText().contains(popUp3));
        ///////
    }
}