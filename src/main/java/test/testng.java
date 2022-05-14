package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class testng {
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @Parameters("browser")
    @BeforeTest()
    public void beforeTest(String browser) {
        System.out.println("before test");
        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        else if (browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.iedriver().setup();
            driver= new InternetExplorerDriver();
        }
        driver.get("https://www.google.com/");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("before group");
    }

    @Test(groups = {"login", "basarili"})
    public void basariliLogin() {
        System.out.println("Basarili Login Case i");
    }

    @Test(groups = {"login", "basarisiz"})
    public void yanlisEmail() {
        System.out.println("Yanlis Email Case i");
    }

    @Test(groups = {"login", "basarisiz"})
    public void yanlisSifre() {
        System.out.println("Yanlis sifre Case i");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");

    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
        driver.close();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");

    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("after group");

    }
}
