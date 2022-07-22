Feature: As a user, I should be able to create/delete any note and see the details of the note.

  Acceptance Criteria:

  S1- User can create a new note
  S2- User can add any note to the favorites
  S3- User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
  S4- User can create a new category by passing a new category name from inside the notes details
  S5- User can delete any note

  Background:


  Scenario: User can create a new note
    Then user click the pencil button on the top menu
    And user click the New note button on the left menu
    And user write notes inside note page
    And verify that user created the note and its title matches with the first word


