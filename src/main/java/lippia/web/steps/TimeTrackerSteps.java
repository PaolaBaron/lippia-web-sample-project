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

    @And("The client clicks on 'Manage Workspaces'")
    public void theClientClicksOnManageWorkspaces() {
        TimeTrackerService.manageWorkspaces();
    }

    @Given("The client is on time tracker page with email 'usuario.clockify@gmail.com' and password 'clockify1234'")
    public void theClientIsOnTimeTrackerPageEmailPassword() {
        LandingPageService.navegarWeb();
        LandingPageService.ClickOnLogIn();
        LoginService.logInManually();
        String email = "usuario.clockify@gmail.com";
        LoginService.setEmail( email );
        String pass = "clockify1234";
        LoginService.setPassword( pass );
        LoginService.logInButton();
        TimeTrackerService.verifyMessage();
        TimeTrackerService.verifyUrl("https://app.clockify.me/tracker#");
    }

    @When("The client clicks on 'Project'")
    public void theClientClicksOnProject() {
        TimeTrackerService.clickOnProject();
    }

    @And("The client clicks on 'Create new project'")
    public void theClientClicksOnCreateNewProject() {
        TimeTrackerService.newProjectButton();
    }

    @When("The client clicks on name icon")
    public void theClientClicksOnNameIcon() {
        TimeTrackerService.clickOnNameIcon();
    }

    @And("The client clicks on 'Log out'")
    public void theClientClicksOnLogOut() {
        TimeTrackerService.clickOnLogOut();
    }

    @And("The client sets project name")
    public void theClientSetsProjectName() {
        String projectName = TimeTrackerService.ProjectNameGenerator.generateRandomProjectName();
        TimeTrackerService.setProjectName(projectName);
    }
    @And("The client clicks on 'Create'")
    public void theClientClicksOnCreate() {
        TimeTrackerService.clickOnCreate();
    }
    @Then("The client verifies the new project is created")
    public void theClientVerifiesNewProjectIsCreated() {
        String projectName = TimeTrackerService.ProjectNameGenerator.generateRandomProjectName();
        TimeTrackerService.verifyCreatedProject(projectName);
    }
    @Then("The client verifies login page is displayed")
    public void theClientVerifiesLoginPageIsDisplayed() {
        LoginService.verifyUrl("https://app.clockify.me/en/login");
    }
}

   

    



