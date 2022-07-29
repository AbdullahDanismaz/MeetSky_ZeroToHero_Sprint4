Feature: As a user, I should be able to change folder view order by using Name/Size/Modified buttons


  Background:  User can login with valid credentials
    Given Navigate to login page
    When Enter username into "Employee73" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully



@wip
  Scenario:User can change folder view order by Name
    When Click on the triangle next to "Name" button.
    And if triangle is North possitioned
    Then user should see asscending "Name" order
    And if triangle is South possitioned
    Then user should see descending "Name" order


  Scenario:User can change folder view order by Size
    When Click on the Size button.
    Then    User should see order by Size



  Scenario:    User can change folder view order by Modified
    When Click on the Modified button.
    Then  User should see order by Modified



  Scenario: User can change the folder view by clicking the
  toggle-view button at the right corner of all files tab screen
    When Click the toggle-view button at the right corner of all files tab screen.
    Then User should see the  toggle-view .




  Scenario: User can select all the files at once and see the total values of all files in the
  first line when clicked on the “select all” checkbox at the left top corner of the list
    When  Click on the “select all” checkbox at the left top corner of the list.
    Then  User should see the total values of all files in the first line .

#Hello

