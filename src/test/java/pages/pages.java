package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class pages {

    By baslik = By.cssSelector(".main-header");
    By menu = By.cssSelector(".show .btn-light span");
    By chooseFile = By.id("uploadFile");
    By fileText = By.id("uploadedFilePath");
    By links = By.cssSelector("#linkWrapper a");
    By responseCode = By.cssSelector("#linkResponse b:nth-child(1)");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;


    public pages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkHeader(String header) {
        elementHelper.checkElementText(baslik, header);
    }


    public void clickMenu(String degisken) {
        elementHelper.clickElementWithText(menu, degisken);
    }

    public void chooseFile(String file) {
        elementHelper.sendKey(chooseFile, file);
    }

    public void checkFile(String file) {
        elementHelper.checkElementText(fileText, file);
    }

    public void clickLinks(String link) {
        elementHelper.clickElementWithText(links, link);
    }

    public void checkResponseCode(String code) {
        elementHelper.checkElementText(responseCode, code);
    }

}
