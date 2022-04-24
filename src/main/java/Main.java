import com.sun.jndi.ldap.sasl.LdapSasl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        /////////////Manage///////////////////
        //Timeouts
        // Bu komutları bir kere yazıyoruz. Bütün heryerde işliyor.
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // sayfanın yüklenmesini bekler
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// yapılan işlemleri bekler

        //Window
        driver.manage().window().maximize();// pencereyi maximize  yapar     bi kere yazıyoruz
        driver.manage().window().fullscreen(); // pencereyi fullsccren yapar     bi kere yazıyoruz
        int xDüzlemi = driver.manage().window().getPosition().getX();// Pencerenin x düzlemindeki konumunu verir integer olarak
        int yDüzlemi = driver.manage().window().getPosition().getY(); // Pencerenin y düzlemindeki konumunu verir integer olarak


        /////////////Quit-Close///////////////////
        driver.quit(); //hepsini kapatır
        driver.close();//bulunduğu sekmeyi kapatır

        /////////Url İşlemleri////////////////
        driver.get("https://www.google.com/"); // siteye gitmek için kullanılır
        String suankiSite = driver.getCurrentUrl(); // sayfadaki urli getirir
        String title = driver.getTitle(); // sayfanın titleını getirir
        String pageSource = driver.getPageSource(); // Sayfanın kaynak kodlarını çeker

        /////////Navigate////////////////
        driver.navigate().to("https://www.google.com/"); // urle gitmek için
        driver.navigate().back(); // geri gitmek için
        driver.navigate().forward(); // ileri gitmek için
        driver.navigate().refresh(); // sayfayı yenilemek için


        ///////Window Handle/////////////////
        Set<String> sayfalar = driver.getWindowHandles(); // Sayfalar arası geçiş için kullanıyoruz
        String sayfa = driver.getWindowHandle();


        ////////////Frame///////////////////
        WebElement frame = driver.findElement(By.xpath("/html/body/iframe[1]"));
        driver.switchTo().frame(frame);
        driver.switchTo().defaultContent();


        /////////////Find Elements////////////////
        driver.findElement(By.xpath(""));
        driver.findElements(By.xpath(""));




    }
}
