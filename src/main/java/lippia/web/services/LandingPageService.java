package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.LandingPageConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LandingPageService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void ClickOnLogIn() {
        WebActionManager.click(LandingPageConstants.BUTTON_LOG_IN);
    }
}
