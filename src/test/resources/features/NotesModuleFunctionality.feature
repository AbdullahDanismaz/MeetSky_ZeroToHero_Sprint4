@MESK-405
Feature: As a user, I should be able to create/delete any note and see the details of the note.

  Acceptance Criteria:

  AC1- User can create a new note
  AC2- User can add any note to the favorites
  AC3- User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
  AC4- User can create a new category by passing a new category name from inside the notes details
  AC5- User can delete any note

  Background:
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully

  @MESK-399
  Scenario: AC1 User can create a new note
    Then user click the pencil button on the top menu
    And user click the New note button on the left menu
    And user write notes inside note page
    And verify that user created the note and its title matches with the first word

  @MESK-401
  Scenario: AC2- User can add any note to the favorites
    When user click the pencil button on the top menu
    And user click one note three dot menu link
    And user click to Add to favorites inside the opened menu
    Then verify that favorite note inside the favorites

  @MESK-402
  Scenario: AC3- User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
    When user click the pencil button on the top menu
    And user click the first favorite note
    And user click right three dot menu
    And user click the details button
    Then user verify the informations showed under the header note

  @MESK-403
  Scenario: AC4- User can create a new category by passing a new category name from inside the notes details
    When user click the pencil button on the top menu
    And user click right three dot menu
    And user click the details button
    And user enter the new category name inside the input under the categories
    And user click the enter arrow
    And user click the categories button on the left menu
    And user verify the new category name displayed on the left menu

  @MESK-404
  Scenario: AC5- User can delete any note
    When user click the pencil button on the top menu
    And user click one note three dot menu link
    And user click th Delete button

