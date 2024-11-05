@TimeTracker
Feature:TimeTracker

  Background:
    Given The client is on time tracker page with email usuario.clockify@gmail.com and password clockify1234


  @AddTimeEntrySuccessfully
  Scenario: AddTimeEntrySuccessfully
    When The client clicks on Manual
    And The client clicks on 'Project'
    And The client selects project Time Entry
    And The client sets the description TPFinal
    And The client sets start time 13:00
    And The client sets end time 19:00
    And The client sets date 29/10/2024
    And The client clicks on Add button
    Then The client verifies the new time entry is created

  @CancelTimeEntrySuccessfully
  Scenario: CancelTimeEntrySuccessfully
    When The client clicks on Timer
    And The client clicks on 'Project'
    And The client selects project Time Entry
    And The client sets the description CancelledTime
    And The client clicks on Start button
    And The client clicks on three dots
    And The client clicks on Discard
    And The client clicks on Discard confirmation
    Then The client verifies the new time entry is not created
    And The client sees the message Timer cancelled


  @UpdateTimeEntrySuccessfully
  Scenario: UpdateTimeEntrySuccessfully
    And The client clicks on Manual
    And The client clicks on 'Project'
    And The client selects the project New project
    And The client sets the description Edit
    And The client clicks on Add button
    When The client sets the Updated description
    Then The client verifies the updated data


