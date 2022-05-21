package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pages {

    By baslik = By.cssSelector(".main-header");

    WebDriver driver;
    WebDriverWait wait;


    public pages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }


    public void checkHeader(String header) {
        wait.until(ExpectedConditions.textToBe(baslik, header));
    }

}
