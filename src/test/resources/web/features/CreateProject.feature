@CreateProject  @Regression  @Automated
Feature: Create Project

  Background:
    Given The client is on time tracker page with email 'usuario.clockify@gmail.com' and password 'clockify1234'


  @CreateProjectSuccessful   @Smoke
  Scenario: Create project successfully
    When The client clicks on 'Project'
    And The client clicks on 'Create new project'
    And The client sets project name
    And The client clicks on 'Create'
    Then The client verifies the new project is created