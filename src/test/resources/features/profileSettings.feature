Feature: User can view and update details via Profile Settings

Background:  User has loggen in to Home Page
Given Navigate to login page
When Enter username into "Employee93" inputBox
And Enter password into "Employee123" inputBox
And Click on the login button on the login page
Then Verify that user can login files page successfully

@MESK-386
  Scenario: User Can see their Full Name
  Given Click on Profile Settings
  And Click on Settings
  Then Verify "<zak>" is visible





