package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LandingPageService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {


    @Given("The client is on landing page")
    public void theClientIsOnLandingPage() {
        LandingPageService.navegarWeb();
    }

    @And("The client clicks on 'Log in'")
    public void theClientClicksOnLogIn() {
        LandingPageService.ClickOnLogIn();
    }

    @When("The client clicks on 'Log in manually'")
    public void theClientClicksOnLogInManually() {
        LoginService.logInManually();
    }

    @And("The client sets the email '(.*)'")
    public void theClientSetsTheEmail(String email) {
        LoginService.setEmail( email );
    }

    @And("The client sets the password '(.*)'")
    public void theClientSetsThePassword(String pass) {
        LoginService.setPassword( pass );

    }

    @And("The client clicks on 'Login' button")
    public void theClientClicksOnLoginButton() {
        LoginService.logInButton();
    }

    @And("The client clicks on password field")
    public void theClientClicksOnPasswordField() {
        LoginService.passwordField();
    }

    @Then("The client visualizes the error message '(.*)'")
    public void theClientVisualizesTheErrorMessage(String error) {
        LoginService.errorMessage(error);
    }

    @Then("The client visualizes the message '(.*)'")
    public void theClientVisualizesTheMessage(String invalid) {
        LoginService.Error(invalid);
    }
}







