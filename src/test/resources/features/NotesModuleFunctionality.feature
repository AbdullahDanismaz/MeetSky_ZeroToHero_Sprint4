Feature: As a user, I should be able to create/delete any note and see the details of the note.

  Acceptance Criteria:

  AC1- User can create a new note
  AC2- User can add any note to the favorites
  AC3- User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
  AC4- User can create a new category by passing a new category name from inside the notes details
  AC5- User can delete any note

  Background:

  Scenario: AC1 User can create a new note
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    Then user click the pencil button on the top menu
    And user click the New note button on the left menu
    And user write notes inside note page
    And verify that user created the note and its title matches with the first word

  Scenario: AC2 User can add any note to the favorites
    Given Navigate to login page
    When Enter username into "Employee113" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully
    When user click the pencil button on the top menu
    And user click one note three dot menu link
    And user click to Add to favorites inside the opened menu
    And user click Files button on the head menu
    And user click to Favorites on the left menu
    Then verify that favorite note inside the favorites




