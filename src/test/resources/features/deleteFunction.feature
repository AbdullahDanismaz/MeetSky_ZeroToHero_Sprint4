Feature:As a user, I should be able to see all deleted files and delete/restore them permenantly under the Deleted Files tab.

  Acceptance Criteria:

  User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
  User can order the all deleted files by newest to oldest or visa versa
  User can order alphabetically all the deleted files based on their names
  User can delete any deleted file permenantly by using the three dots icon in the file’s line
  User can restore any deleted file and see it again under the All Files tab


  Background:1-User can login with valid credentials
  Given Navigate to login page
  When Enter username into "Employee43" inputBox
  And Enter password into "Employee123" inputBox
  And Click on the login button on the login page
  Then Verify that user can login files page successfully





@wip
  Scenario:  User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
    When user deletes first file
    And user deletes second file
    And User navigate to deleted Files
    Then Verify that user see the deleted files ordered newest to oldest by default


