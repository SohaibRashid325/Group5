import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 import java.util.List;
import java.util.concurrent.TimeUnit;

public class MavenTest {

    public WebDriver webDriver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohaib\\IdeaProjects\\testing\\driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void LogintoNetflix() {
        webDriver.get("https://www.netflix.com/");
        webDriver.findElement(By.linkText("Sign In")).click();
        webDriver.findElement(By.name("email")).sendKeys("nazibah95@gmail.com");
        webDriver.findElement(By.name("password")).sendKeys("Nazibah95");
        webDriver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
        webDriver.findElement(By.className("profile-icon")).click();
        webDriver.findElement(By.className("searchBox")).click();
        webDriver.findElement(By.xpath("//div[@class='secondary-navigation']//button[@class='searchTab']")).sendKeys("Anime");
        webDriver.findElement(By.className("notifications-menu")).click();


    }


}
