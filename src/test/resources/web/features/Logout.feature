@Logout  @Regression   @Automated
Feature: Log out from Clockify

  Background:
    Given The client is on time tracker page with email 'usuario.clockify@gmail.com' and password 'clockify1234'

  @SuccessfulLogout    @Smoke
  Scenario: Successful logout
    When The client clicks on name icon
    And The client clicks on 'Log out'
    Then The client verifies login page is displayed