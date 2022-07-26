Feature: As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Background:  User can login with valid credentials
    Given Navigate to login page
    When Enter username into "Employee73" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully

  @wip
  Scenario:User can change folder view order by Name
    When Click on the Name button.
    Then User should see order by Name

