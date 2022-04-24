import com.sun.jndi.ldap.sasl.LdapSasl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");



        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://www.google.com/");
    }
}
