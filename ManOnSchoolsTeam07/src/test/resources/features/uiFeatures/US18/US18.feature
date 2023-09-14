Feature:US18 The teacher should be able to view and update the grades given to the student.(Student Info List)
  Background:
      Given User navigates to "base_url"
      And User waits 5 seconds
      Then User clicks on "login_url" on home page
      And User enters a user name and password "teacherUserName","teacherPassword"
      And User clicks on log in


    Scenario Outline: TC01 In the Student Info List; Name, Lesson Name, Absentee, Midterm and Final Exam, Note, Info Note and Average information should be visible
    The teacher should be able to update the student grade information
    The teacher should be able to delete the grade information.
      Then User views name
      And User waits 2 seconds
      And User views Choose Lesson
      And User waits 2 seconds
      And User views Absentee
      And User waits 2 seconds
      And User views Midterm Exam
      And User views Final Exam
      And User views Note
      And User views Info Note
      And User views Average
      And User clicks edit button
      And User updates  "<absentee>", "<midtermExam>", "<finalExam>", "<infoNote>"
      And User waits 2 seconds
      And User clicks Submit button
      And User verify "Student Info updated Successfully"
      And User waits 2 seconds
      And user clicks x button
      And User waits 2 seconds
      And user clicks deleteButton
      And User verify delete "Student Info delete Successfully"



      Examples:
        | absentee | midtermExam | finalExam | infoNote |
        | 7        | 80          | 70        | normal   |

  Scenario: TC02 The teacher should be able to view and update the grades given to the student.(Student Info List)
  Negatif Scenario
    Then User choose a lesson on Student Info Management
    And User waits 2 seconds
    And User choose a student name on Student Info Management
    And User waits 2 seconds
    And User choose a education term on Student Info Management
    And User waits 2 seconds
    When User enters absences, midterm exam, final exam, info note on Student Info Management "5","90","90","successful"
    And User waits 2 seconds
    And User clicks submit button on Student Info Management
    And User waits 2 seconds
    And Verify student info is visible on the student info list "Student Info saved Successfully"
    And User waits 2 seconds
    And User clicks edit button
    Then User views name
    And User waits 2 seconds
    And User  don't choose Lesson and User fills in the other fields
    And User waits 2 seconds
    And User clicks Submit button
    And User waits 2 seconds
    And User should see "Please Choose Lesson"
    And User close the page















