Feature:1-User can login with valid credentials

  Background: 1-User can login with valid credentials

    Given Navigate to login page
    When Enter username into "Employee63" inputBox
    And Enter password into "Employee123" inputBox
    And Click on the login button on the login page
    Then Verify that user can login files page successfully

  @wip
  Scenario: User can upload a file
    Given Navigate and Click on the files folder
    Given Navigate and Click plus link icon
    When Click Upload file list option
    When Select a test upload file
    Then Click Open button on pop up window

  Scenario: User can create a new folder
    Given Navigate and Click plus link icon
    When Click New folder list option
    And Click arrow button
    Then Verify that user created New folder

  Scenario: User can move or copy any selected item to any folder
    Given Click on the three dots button
    When Click move or copy button
    And Click on the folder name where you want to move your file
    And Click on the Move button
    And Click on the three dots button
    And Click move or copy button
    And Click on the folder name where you want to copy your file
    Then Click on Copy button