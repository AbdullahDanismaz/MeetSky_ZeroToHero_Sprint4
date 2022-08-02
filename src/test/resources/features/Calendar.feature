Feature: User can see Daily-Weekly-Monthly calendar view and create new event
  under calendar module

  @MESK-389
  Scenario:1-User can display daily calendar view
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    Then click on the calendar icon on the home page
     And click on the menu toggle icon on calendar page

  @MESK-392
    Scenario: User can click day button on calendar menu
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    Then click on the calendar icon on the home page
    And click on the menu toggle icon on calendar page
    Then User can click day button on calendar menu

       @MESK-390
      Scenario: User can click week button on calendar menu
        Given Navigate to login page
        When Enter username into "Employee113" inputBox
        And Enter password into "Employee123" inputBox
        And Click on the login button on the login page
        Then Verify that user can login files page successfully
        Then click on the calendar icon on the home page
        And click on the menu toggle icon on calendar page
        Then User can click week button on calendar menu

        @MESK-390
      Scenario: User can click month button on calendar menu
        Given Navigate to login page
        When Enter username into "Employee113" inputBox
        And Enter password into "Employee123" inputBox
        And Click on the login button on the login page
        Then Verify that user can login files page successfully
        Then click on the calendar icon on the home page
        And click on the menu toggle icon on calendar page
        Then User can click month button on calendar menu

   @MESK-406
  Scenario: User can create a new event on calendar page
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    Then click on the calendar icon on the home page
    And User can create a new event on calendar page

    @MESK-407
  Scenario: user can delete an event on calendar page
      Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    Then click on the calendar icon on the home page
    And User can create a new event on calendar page
    And User should click save button
    Then user need to choose untitled event on calendar
    And user should click dots on event page
    Then user can delete an event on calendar page

