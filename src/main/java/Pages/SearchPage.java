package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    By searchPageLogo = By.cssSelector("");

    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }


    public void checkSearchPage(){
        //driver.findElement(searchPageLogo);
    }
}
