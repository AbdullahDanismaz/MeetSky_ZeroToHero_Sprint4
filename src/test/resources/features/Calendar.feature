Feature: User can see Daily-Weekly-Monthly calendar view and create new event
  under calendar module

@wip
  Scenario:1-User can display daily calendar view

    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    Then click on the calendar icon on the home page
     And click on the menu toggle icon on calendar page

