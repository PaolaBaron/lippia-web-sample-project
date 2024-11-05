package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LandingPageService;
import lippia.web.services.LoginService;
import lippia.web.services.TimeTrackerService;



public class TimeTrackerSteps extends PageSteps {


    @Then("The client is on time tracker page")
    public void theClientIsOnTimeTrackerPage() {
        TimeTrackerService.verifyMessage();
        TimeTrackerService.verifyUrl("https://app.clockify.me/tracker#");
    }
    @When("The client clicks on three dots icon")
    public void theClientClicksOnThreeDotsIcon() {
        TimeTrackerService.dotsIcon();
    }

    @Given("The client is on time tracker page with email (.*) and password (.*)")
    public void theClientIsOnTimeTrackerPageEmailPassword(String email,String pass) {
        LandingPageService.navegarWeb();
        LandingPageService.ClickOnLogIn();
        LoginService.logInManually();
        LoginService.setEmail( email );
        LoginService.setPassword( pass );
        LoginService.logInButton();
        TimeTrackerService.verifyMessage();
        TimeTrackerService.verifyUrl("https://app.clockify.me/tracker#");
    }

    @When("The client clicks on 'Project'")
    public void theClientClicksOnProject() {
        TimeTrackerService.clickOnProject();
    }


    @When("The client sets start time (.*)")
    public void theClientSetsStartTime(String start) {
        TimeTrackerService.setStart(start);
    }

    @And("The client sets end time (.*)")
    public void theClientSetsEndTime(String end) {
        TimeTrackerService.setEnd(end);
    }

    @And("The client sets date (.*)")
    public void theClientSetsDate(String date) {
        TimeTrackerService.setDate(date);
    }

    @And("The client clicks on Add button")
    public void theClientClicksOnAddButton() {
        TimeTrackerService.clickOnAdd();
    }

    @Then("The client verifies the new time entry is created")
    public void theClientVerifiesTheNewTimeEntry() {
        TimeTrackerService.verifyTimeEntry();
    }

    @And("The client sets the description (.*)")
    public void theClientSetsTheDescription(String description) {
        TimeTrackerService.setDescription(description);
    }

    @When("The client clicks on Timer")
    public void theClientClicksOnTimer() {
        TimeTrackerService.clickOnTimer();
    }

    @And("The client clicks on Start button")
    public void theClientClicksOnStartButton() {
        TimeTrackerService.clickOnStart();
    }

    @And("The client clicks on three dots")
    public void theClientClicksOnThreeDots() {
        TimeTrackerService.clickOnThreeDots();
    }

    @And("The client clicks on Discard")
    public void theClientClicksOnDiscard() {
        TimeTrackerService.clickOnDiscard();
    }

    @And("The client clicks on Discard confirmation")
    public void theClientClicksOnDiscardConfirmation() {
        TimeTrackerService.clickOnDiscardConfirmation();
    }

    @Then("The client verifies the new time entry is not created")
    public void theClientVerifiesTheNewTimeEntryIsNotCreated() {
        TimeTrackerService.verifyCancelledTimeEntry();
    }

    @And("The client clicks on Manual")
    public void theClientClicksOnManual() {
        TimeTrackerService.clickOnManual();
    }

    @When("The client sets (.*) description")
    public void theClientSetsUpdatedDescription(String updated) {
        TimeTrackerService.setUpdatedDescription(updated);
    }

    @And("The client selects project (.*)")
    public void theClientSelectsProject(String project) {
        TimeTrackerService.selectProject(project);
    }

    @And("The client sees the message Timer cancelled")
    public void theClientSeesTheMessageTimerCancelled() {
        TimeTrackerService.seeMessage();
    }

    @And("The client selects the project (.*)")
    public void theClientSelectsTheProjectNewProject(String newProject) {
        TimeTrackerService.selectTheProject(newProject);
    }

    @Then("The client verifies the updated data")
    public void theClientVerifiesTheUpdatedData() {
        TimeTrackerService.verifyUpdatedData();
    }
}

   

    



