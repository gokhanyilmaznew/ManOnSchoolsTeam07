Feature: US17 The teacher should be able to give grades to the students.
  (Add Student Info)
  Background:
    Given User navigates to "base_url"
    And User waits 5 seconds
    Then User clicks on "login_url" on home page
    And User enters a user name and password "teacherUserName","teacherPassword"
    And User clicks on log in
    And User waits 2 seconds
    And User choose a lesson on Student Info Management
    And User choose a student name on Student Info Management
    And User choose a education term on Student Info Management


  Scenario: TC01 The lesson, student and semester should be selectable.
  Absences should be able to be entered.
  Midterm and Final Exam grades should be able to be entered.
  Info note about the student should be able to be entered.
    When User enters absences, midterm exam, final exam, info note on Student Info Management "5","90","90","successful"
    And User clicks submit button on Student Info Management
    And User waits 2 seconds
    And Verify student info is visible on the student info list "Student Info saved Successfully"




  Scenario: TC02 The teacher should be able to give grades to the students
  (Add Student Info) Negatif Scenario
    When User leave the absentee field empty and fills in the other fields on Student Info Management "90","90","successful"
    And User clicks submit button on Student Info Management
    And User waits 2 seconds
    And User views "Required"


  Scenario: TC03 The teacher should be able to give grades to the students
  (Add Student Info)Negatif Scenario
    When User enter letters the absentee field empty and fills in the other fields on Student Info Management "aaa","90","90","successful"
    And User clicks submit button on Student Info Management
    And User waits 2 seconds
    And User sees "Please enter a current value"
    And User waits 2 seconds
    And User close the page


