import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Chase {

    public WebDriver webDriver;


    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohaib\\IdeaProjects\\testing\\driver\\chromedriver.exe");
         webDriver = new ChromeDriver();
    }

    @Test
    public void launchChase(){
        webDriver.get("https://www.chase.com");

    }

    @Test
    public void loginToChase(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.name("user_name")).sendKeys("Chase@gmail.com");
        webDriver.findElement(By.id("usr_password_home")).sendKeys("password", Keys.ENTER);

    }


    @Test
    public void chaseLoginviamenu(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.xpath("//header[@data-feature='header']//a[@id='skip-sidemenu']")).click();
        webDriver.findElement(By.cssSelector(".chaseanalytics-track-link.signInBtn")).click();
    }



    @Test
    public void chaseRefresh(){
        webDriver.get("https://www.chase.com");
        webDriver.navigate().refresh();

    }


    @Test
    public void checkingAccounts(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.linkText("Checking Accounts")).click();
    }

    @Test
    public void chaseImplicitWait(){
        webDriver.get("https://www.amazon.com");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.close();

    }

    @Test
    public void savings(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.linkText("Savings Accounts and CDs ")).click();
    }

    @Test
    public void closeChaseBrowser() {
        webDriver.get("https://www.chase.com");
        webDriver.close();
    }

    @Test
    public void privacyConditoins(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.name("fm_privacy")).click();

    }

    @Test
    public void termsofUse(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.linkText("Deposit and Prepaid Account Agreements")).click();


    }


    @Test
    public void OnlineBanking(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.name(" regular-link chaseanalytics-track-link")).click();

    }

    @Test
    public void maximizeChase(){
        webDriver.get("https://www.chase.com");
        webDriver.manage().window().maximize();

    }

    @Test
    public void helpHomeOwners(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.linkText("Explore products")).click();
    }



    @Test
    public void siteMap(){
        webDriver.get("https://www.chase.com");
        webDriver.findElement(By.linkText("Site map ")).click();

    }



}
