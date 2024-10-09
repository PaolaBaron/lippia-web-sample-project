package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.WorkspacesConstants;
import java.util.UUID;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class WorkspacesService {

    public static WorkspaceNameGenerator workspaceNameGenerator;

    public static void newWorkspaceButton() {
        WebActionManager.waitVisibility(WorkspacesConstants.BUTTON_CREATE_NEW_WORKSPACE);
        WebActionManager.waitClickable(WorkspacesConstants.BUTTON_CREATE_NEW_WORKSPACE);
        WebActionManager.click(WorkspacesConstants.BUTTON_CREATE_NEW_WORKSPACE);
    }
    public static void setWorkspaceName(String workspaceName) {
        WebActionManager.setInput(WorkspacesConstants.WORKSPACE_NAME_INPUT,workspaceName);
    }
    public static void clickOnCreate() {
        WebActionManager.click(WorkspacesConstants.CREATE_BUTTON);
    }
    public static class WorkspaceNameGenerator {
        public static String generateRandomWorkspaceName() {
            return UUID.randomUUID().toString().toUpperCase().substring(0,6);
        }
        public static void main(String[] args) {
            String randomProjectName = generateRandomWorkspaceName();
            System.out.println(randomProjectName);
        }
    }
    public static void verifyCreatedWorkspace(String workspaceName) {
        Assert.assertTrue(isVisible(workspaceName));
    }
}
