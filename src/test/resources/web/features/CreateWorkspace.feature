@CreateWorkspace  @Regression  @Automated
Feature:Create Workspace

  Background:
    Given The client is on time tracker page with email 'usuario.clockify@gmail.com' and password 'clockify1234'


  @CreateWorkspaceSuccessful   @Smoke
  Scenario: Create workspace successfully
    When The client clicks on three dots icon
    And The client clicks on 'Manage Workspaces'
    And The client clicks on 'Create new workspace' button
    And The client sets the workspace name
    And The client clicks on Create
    Then The client verifies the new workspace is created

