import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Amazon {

    public WebDriver webDriver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohaib\\IdeaProjects\\testing\\driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test
    public void amazonLogin() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("nav-link-accountList")).click();
    }

    @Test
    public void enterCredentials() {
        webDriver.get("https://www.amazon.com/");
        webDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        webDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        webDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }

    @Test
    public void searchonAmazon() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toothbrush");
        webDriver.findElement(By.className("nav-input")).click();
    }

    @Test
    public void refreshPage() {
        webDriver.get("https://www.amazon.com");
        webDriver.navigate().refresh();

    }

    @Test
    public void maximizeWebPage() {
        webDriver.get("https://www.amazon.com");
        webDriver.manage().window().maximize();

    }

    @Test
    public void closeBrowser() {
        webDriver.get("https://www.amazon.com");
        webDriver.close();
    }

    @Test
    public void tryPrime() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Try Prime")).click();

    }

    @Test
    public void Orders() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Orders")).click();

    }

    @Test
    public void Cart() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Cart" +
                "t")).click();

    }

    @Test
    public void displayCategories() {
        webDriver.get("https://www.amazon.com");
        List<WebElement> categories = webDriver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        for (WebElement search : categories) {
            System.out.println(search.getText());
        }

        }


    @Test
    public void CreditCardAmazon() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//a[@class='nav_a']")).click();

    }


}




