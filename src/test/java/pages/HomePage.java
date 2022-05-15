package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import util.JsonReader;

public class HomePage {
    By logo = By.cssSelector("a.main-header-logo");
    By searchBox = By.id("search-form__input-field__search-input");
    By searchButton = By.cssSelector(".search-form__input-field__btn-search.false");

    WebDriver driver;
    ElementHelper helper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.helper = new ElementHelper(driver);
    }


    public void checkLogo() {
        helper.checkElementVisible(logo);
    }

    public void setSearchBox(String product) {
        helper.sendKey(searchBox, product);
    }

    public void clickSearchButton() {
        helper.click(searchButton);
    }


}
