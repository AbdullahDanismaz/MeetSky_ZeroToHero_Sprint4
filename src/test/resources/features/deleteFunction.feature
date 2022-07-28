Feature:1-User can login with valid credentials
Background:



  Scenario:1-User can login with valid credentials

    Given Navigate to login page
    When Enter username into "Employee43" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully



