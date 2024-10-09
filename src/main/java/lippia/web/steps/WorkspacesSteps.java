package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.TimeTrackerService;
import lippia.web.services.WorkspacesService;

public class WorkspacesSteps extends PageSteps {

    @And("The client clicks on 'Create new workspace' button")
    public void theClientClicksOnButton() {
        WorkspacesService.newWorkspaceButton();

    }
    @And("The client sets the workspace name")
    public void theClientSetsTheWorkspaceName() {
        String workspaceName = WorkspacesService.WorkspaceNameGenerator.generateRandomWorkspaceName();
        WorkspacesService.setWorkspaceName(workspaceName);
    }

    @Then("The client verifies the new workspace is created")
    public void theClientVerifiesTheNewWorkspaceIsCreated() {
        String workspaceName = WorkspacesService.workspaceNameGenerator.generateRandomWorkspaceName();
        WorkspacesService.verifyCreatedWorkspace(workspaceName);
    }
    @And("The client clicks on Create")
    public void theClientClicksOnCreate() {
        WorkspacesService.clickOnCreate();
    }
}









