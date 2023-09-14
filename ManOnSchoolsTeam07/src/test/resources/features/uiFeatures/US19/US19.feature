Feature: Teacher should be able to organize meetings with students
  (Add Meet)
  Background:
    Given User navigates to "base_url"
    And User waits 5 seconds
    Then User clicks on "login_url" on home page
    And User enters a user name and password "teacherUserName","teacherPassword"
    And User clicks on log in

    Scenario: TC_01 Teacher should be able to organize meetings with students (Positive)
    "Choose Students" should be able to select students
    "Date Of Meet" meeting time should be selectable. Past date should not be entered.
    "Start Time and Stop Time" start and end times must be entered
    Description must be entered

    When User click on Menu Button
    And Verify the Meet Management button is clickable
    And Click the Meet Management button
    When Verify that the 'Add Meet' text appears
    And User selects the student from the Choose Student section "studentName"
    And enters a future date,start time and end time and a description between '2-16' characters "20.10.2023","15:00","16:00","Java"
    And Click the submit button
    And User sees the message "Meet Saved Successfully"

    Scenario: TC02_ Teacher should be able to organize meetings with students(Negative)
      When User click on Menu Button
      And Click the Meet Management button
      And User selects the student from the Choose Student Section "studentName2"
      And leave date of meet blank and enter start time, stop time and description "12:00","13:00","Selenium"
      And Click the submit button
      And Confirm for date that the "Required" text appears.
      And Refresh page
      And User selects the student from the Choose Student Section "studentName2"
      And select the past date from date of meet "20.10.2020","12:00","13:00","Selenium"
      And Click the submit button
      And Verify that the "ileri bir tarih olmali" message appears
      And Refresh page
      And User selects the student from the Choose Student Section "studentName2"
      And start time field is left blank and other fields are filled "20.10.2023","13:00","Selenium"
      And Click the submit button
      And Confirm for start time that the "Required" text appears.
      And Refresh page
      And User selects the student from the Choose Student Section "studentName2"
      And stop time field is left blank and other fields are filled "20.10.2023","13:00","Selenium"
      And Click the submit button
      And Confirm for stop time that the "Required" text appears.
      And Refresh page
      And User selects the student from the Choose Student Section "studentName2"
      And Select date, enter description and enter stop time earlier than start time."25.10.2023","11:00","09:00","Appium"
      And Click the submit button
      And Verify that "Error: start time must not be greater than or equal to stop time" text appears
      And Refresh page
      And User selects the student from the Choose Student Section "studentName2"
      And Description is left blank and other fields are filled "25.10.2023","09:00","12:00"
      And Click the submit button
      And Confirm for description that the "Required" text appears.
      And Enter a one-character text in Description "A"
      And Click the submit button
      And Verify that the "Description should be between 2 and 16 characters" text Appears
      #Feature







