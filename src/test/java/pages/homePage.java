package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class homePage {

    By banner = By.cssSelector(".home-banner");
    By cards = By.cssSelector(".card.mt-4.top-card h5");

    WebDriver driver;
    WebDriverWait wait;

    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void checkHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(banner));
    }

    public void checkBanner() {
        wait.until(ExpectedConditions.presenceOfElementLocated(banner));
    }

    public void checkCard(String name) {
        boolean girdi = false;
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cards));
        for (WebElement elem : elements) {
            String elemText = elem.getText();
            if (elemText.contains(name)) {
                girdi = true;
                break;
            }
        }
        Assert.assertEquals(true, girdi);
    }


    public void clickCard(String name){
        boolean girdi = false;
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cards));
        for (WebElement elem : elements) {
            String elemText = elem.getText();
            if (elemText.contains(name)) {
                elem.click();
                girdi = true;
                break;
            }
        }
        Assert.assertEquals(true, girdi);
    }


}
