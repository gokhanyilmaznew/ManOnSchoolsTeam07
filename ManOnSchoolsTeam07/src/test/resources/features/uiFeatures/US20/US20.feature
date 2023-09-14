Feature: Teacher should be able to view, update and delete meetings.
  (Meet List)
  Background:
    Given User navigates to "base_url"
    And User waits 5 seconds
    Then User clicks on "login_url" on home page
    And User enters a user name and password "teacherUserName","teacherPassword"
    And User clicks on log in

    Scenario: TC01_Teacher should be able to view, update and delete meetings.
    Meetings, Date, Start Time, Stop Time and Description should be visible
    Be able to update meetings
    Delete meetings
      When User click on Menu Button
      And Click the Meet Management button
      And Verify that the 'Meet list' text appears
      And

