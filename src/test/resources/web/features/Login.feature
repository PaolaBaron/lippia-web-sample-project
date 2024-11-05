@Login     @Regression   @Automated
Feature:Login in clockify web

  Background:
    Given The client is on landing page
    And The client clicks on 'Log in'

  @SuccessfulManualLogin   @Smoke
  Scenario: Successful manual login
    When The client clicks on 'Log in manually'
    And The client sets the email 'usuario.clockify@gmail.com'
    And The client sets the password 'clockify1234'
    And The client clicks on 'Login' button
    Then The client is on time tracker page

  @FailedManualLogin
  Scenario: Failed manual login with invalid email
    When The client clicks on 'Log in manually'
    And The client sets the email 'clockifygmail.com'
    And The client clicks on password field
    Then The client visualizes the error message 'Email format is not valid'

  @FailedManualLogin
  Scenario: Failed manual login with wrong password
    When The client clicks on 'Log in manually'
    And The client sets the email 'usuario.clockify@gmail.com'
    And The client sets the password 'clockify'
    And The client clicks on 'Login' button
    Then The client visualizes the message 'Invalid email or password'

