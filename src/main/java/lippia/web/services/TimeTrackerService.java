package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import io.lippia.api.lowcode.variables.VariablesManager;
import junit.framework.Assert;
import lippia.web.constants.TimeTrackerConstants;


import static com.crowdar.core.actions.ActionManager.isPresent;
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

    public static void setStart(String start) {
        WebActionManager.click(TimeTrackerConstants.START_INPUT);
        WebActionManager.setInput(TimeTrackerConstants.START_INPUT,start);
    }

    public static void setEnd(String end) {
        WebActionManager.click(TimeTrackerConstants.END_INPUT);
        WebActionManager.setInput(TimeTrackerConstants.END_INPUT,end);
    }

    public static void setDate(String date) {
        WebActionManager.click(TimeTrackerConstants.DATE_INPUT);
        WebActionManager.setInput(TimeTrackerConstants.DATE_INPUT,date);
    }

    public static void clickOnAdd() {
        WebActionManager.click(TimeTrackerConstants.ADD_BUTTON);
    }

    public static void verifyTimeEntry() {
        WebActionManager.waitVisibility (TimeTrackerConstants.NEW_TIME_ENTRY);
        Assert.assertTrue(isVisible(TimeTrackerConstants.NEW_TIME_ENTRY));
    }

    public static void setDescription(String description) {
        WebActionManager.setInput(TimeTrackerConstants.DESCRIPTION_INPUT, description);
    }

    public static void clickOnTimer() {
        WebActionManager.click(TimeTrackerConstants.TIMER);
    }

    public static void clickOnStart() {
        WebActionManager.click(TimeTrackerConstants.START_BUTTON);
    }

    public static void clickOnThreeDots() {
        WebActionManager.click(TimeTrackerConstants.THREE_DOTS);
    }

    public static void clickOnDiscard() {
        WebActionManager.click(TimeTrackerConstants.DISCARD);
    }

    public static void clickOnDiscardConfirmation() {
        WebActionManager.click(TimeTrackerConstants.DISCARD_CONFIRMATION);
    }

    public static void verifyCancelledTimeEntry() {
        Assert.assertFalse(isPresent(TimeTrackerConstants.CANCELLED_TIME_ENTRY));
    }

    public static void clickOnManual() {
        WebActionManager.click(TimeTrackerConstants.MANUAL);
    }


    public static void setUpdatedDescription(String updated) {
        WebActionManager.getElement(TimeTrackerConstants.UPDATED_DESCRIPTION);
        WebActionManager.click(TimeTrackerConstants.UPDATED_DESCRIPTION);
        WebActionManager.setInput(TimeTrackerConstants.UPDATED_DESCRIPTION,updated);
    }

    public static void selectProject(String project) {
        WebActionManager.click(TimeTrackerConstants.PROJECT,project);
    }

    public static void seeMessage() {
        WebActionManager.waitPresence(TimeTrackerConstants.TIMER_CANCELLED);
        Assert.assertTrue(isPresent(TimeTrackerConstants.TIMER_CANCELLED));
    }

    public static void selectTheProject(String newProject) {
        WebActionManager.click(TimeTrackerConstants.NEW_PROJECT,newProject);
    }

    public static void verifyUpdatedData() {
        Assert.assertTrue(isVisible(TimeTrackerConstants.UPDATED));
    }

}

