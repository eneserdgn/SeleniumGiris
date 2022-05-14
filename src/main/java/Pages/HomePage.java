package Pages;

import Util.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {


    By logo = By.cssSelector("a.main-header-logo");
    By searchBox = By.id("search-form__input-field__search-input");
    By searchButton = By.cssSelector(".search-form__input-field__btn-search.false");

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public void checkLogo(){
        driver.findElement(logo);
    }

    public void setSearchBox(String product){
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }


}
