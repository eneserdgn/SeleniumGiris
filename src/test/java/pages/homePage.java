package pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.List;

public class homePage {

    By banner = By.cssSelector(".home-banner");
    By cards = By.cssSelector(".card.mt-4.top-card h5");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkHomePage() {
        elementHelper.checkElementPresence(banner);
    }

    public void checkBanner() {
        elementHelper.checkElementPresence(banner);
    }

    public void checkCard(String name) {
        elementHelper.checkElementWithText(cards,name);
    }


    public void clickCard(String name){
        elementHelper.clickElementWithText(cards,name);
    }


}
