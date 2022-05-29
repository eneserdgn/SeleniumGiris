package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class tutorialPage {

    By btn_HomeIcon = MobileBy.AndroidUIAutomator("new UiSelector().description(\"Home\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public tutorialPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkHomePage() {
        elementHelper.checkElementPresence(btn_HomeIcon);
    }



}
