package Runner;

import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


@CucumberOptions(
        features = {"src/main/java/Features"},
        glue = {"StepDefinitions"},
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                "json:Reports/CucumberReport/Report",
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @Parameters("browser")
    @BeforeTest()
    public void beforeTest(String browser) {
        System.out.println("before test");
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get("https://www.lcwaikiki.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        driver.quit();
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("after group");

    }
}
