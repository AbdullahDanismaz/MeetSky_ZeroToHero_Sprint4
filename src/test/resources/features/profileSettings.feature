
@MESK-397
Feature: User can view and update details via Profile Settings

Background:  User has logged in to Home Page
Given Navigate to login page
When Enter username into "Employee93" inputBox
And Enter password into "Employee123" inputBox
And Click on the login button on the login page
Then Verify that user can login files page successfully

  @MESK-386
  Scenario: User Can see their Full Name
  Given Click on Profile Settings
  And Click on Settings
  Then Verify "zak" is visible


   @MESK-387
   Scenario:User can see their email
   Given Click on Profile Settings
   And Click on Settings
   Then Verify  email "employee93@meetsky.net" is visible


  @MESK-388
    Scenario:User can see their email
    Given Click on Profile Settings
    And Click on Settings
    Then Verify  Phone Number "+447542506923" is visible

  @MESK-394
    Scenario: User can change "Full name" info under Profile Settings page
    Given Click on Profile Settings
    And Click on Settings
    And clear the placeholder
    And type new Full name "Zukhriddin Abdumadzhidov"
    Then Verify  "Zukhriddin Abdumadzhidov" is visible

  @MESK-395
    Scenario: User can make Phone Number private
    Given Click on Profile Settings
    And Click on Settings
    And Click dropdown next to Phone Number
    And click private
    Then verify phone number is private

  @MESK-396
    Scenario: User can see the current local time under the Locale
    Given Click on Profile Settings
    And Click on Settings
    Then Verify Local time is visible








