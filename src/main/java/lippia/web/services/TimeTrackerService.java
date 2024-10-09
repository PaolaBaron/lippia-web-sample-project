package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.TimeTrackerConstants;
import java.util.UUID;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class TimeTrackerService {

    public static void verifyMessage() {
        WebActionManager.waitVisibility (TimeTrackerConstants.MESSAGE);
        Assert.assertTrue(isVisible(TimeTrackerConstants.MESSAGE));
    }
    public static void verifyUrl(String Url) {
        Assert.assertEquals(Url,DriverManager.getDriverInstance().getCurrentUrl());
    }
    public static void dotsIcon() {
        WebActionManager.click(TimeTrackerConstants.THREE_DOTS_ICON);
    }
    public static void manageWorkspaces() {
        WebActionManager.click(TimeTrackerConstants.MANAGE_WORKSPACES);
    }
    public static void clickOnProject() {
        WebActionManager.click(TimeTrackerConstants.PROJECT_BUTTON);
    }
    public static void newProjectButton() {
        WebActionManager.waitVisibility(TimeTrackerConstants.NEW_PROJECT_BUTTON);
        WebActionManager.waitClickable(TimeTrackerConstants.NEW_PROJECT_BUTTON);
        WebActionManager.click(TimeTrackerConstants.NEW_PROJECT_BUTTON);
    }
    public static void clickOnNameIcon() {
        WebActionManager.click(TimeTrackerConstants.NAME_ICON);
    }
    public static void clickOnLogOut() {
        WebActionManager.waitVisibility(TimeTrackerConstants.BUTTON_LOG_OUT);
        WebActionManager.waitClickable(TimeTrackerConstants.BUTTON_LOG_OUT);
        WebActionManager.click(TimeTrackerConstants.BUTTON_LOG_OUT);
    }
    public static void clickOnCreate() {
        WebActionManager.click(TimeTrackerConstants.CREATE_BUTTON);
    }
    public static void verifyCreatedProject(String projectName) {
        WebActionManager.click(TimeTrackerConstants.PROJECTS_BUTTON);
        WebActionManager.setInput(TimeTrackerConstants.FIND_BY_NAME_INPUT,projectName);
        WebActionManager.click(TimeTrackerConstants.APPLY_FILTER_BUTTON);
        Assert.assertTrue(isVisible(projectName));
    }
    public static class ProjectNameGenerator {
        public static String generateRandomProjectName() {
            return UUID.randomUUID().toString().toUpperCase().substring(0,6);
        }
        public static void main(String[] args) {
            String randomProjectName = generateRandomProjectName();
            System.out.println(randomProjectName);
        }
}
    public static void setProjectName(String projectName) {
        WebActionManager.setInput(TimeTrackerConstants.PROJECT_NAME_INPUT,projectName);
    }
}

