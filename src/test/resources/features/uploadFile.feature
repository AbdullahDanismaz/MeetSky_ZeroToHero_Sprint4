
@wip
  Scenario: User can upload a file
    Given Navigate and Click '+' link icon
    When Click 'Upload file' list option
    When Select a test upload file
    Then Click 'Open' button on pop up window

Scenario: User can create a new folder
  Given Navigate and Click '+' link icon
  When Click 'New folder' list option
  And Click 'arrow' button
  Then Verify that user created 'New folder'

  Scenario: User can move or copy any selected item to any folder