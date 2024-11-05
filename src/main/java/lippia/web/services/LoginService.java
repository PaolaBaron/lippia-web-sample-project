package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class LoginService {
    public static void logInManually() {WebActionManager.click(LoginConstants.BUTTON_LOG_IN_MANUALLY);}
    public static void setEmail(String email) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT, email);}
    public static void setPassword(String pass) {WebActionManager.setInput(LoginConstants. PASSWORD_INPUT, pass);}
    public static void logInButton() {WebActionManager.click(LoginConstants.BUTTON_LOG_IN);}
    public static void errorMessage(String error) {WebActionManager.waitVisibility(LoginConstants.ERROR_MESSAGE,error);
        Assert.assertTrue(isVisible(LoginConstants.ERROR_MESSAGE));}
    public static void passwordField() {WebActionManager.click(LoginConstants.PASSWORD_INPUT);}
    public static void Error(String invalid) {WebActionManager.waitVisibility(LoginConstants.ERROR,invalid);
        Assert.assertTrue(isVisible(LoginConstants.ERROR));
    }
    public static void verifyUrl(String Url) {
        Assert.assertEquals(Url,DriverManager.getDriverInstance().getCurrentUrl());
    }
}
