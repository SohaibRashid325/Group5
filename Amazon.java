import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    public void searchAndGoBack(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        webDriver.navigate().back();
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
    public void AmazonimplicitWait(){
        webDriver.get("https://www.amazon.com");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.close();

    }

    @Test
    public void closeBrowser() {
        webDriver.get("https://www.amazon.com");
        webDriver.close();
    }

    @Test
    public void click() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//a[@href='/business/ref=footer_retail_b2b')")).click();
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
    public void searchGoBackAndRefresh(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        webDriver.navigate().back();
        webDriver.navigate().refresh();
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
    public void ConditionsofUse() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Conditions of Use")).click();

    }

    @Test
    public void locatingTheSearchBar(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox"));
    }

    @Test
    public void privacyNotice() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Privacy Notice")).click();


    }

    @Test
    public void ConductSearchAndGoForward(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Galaxy s9 cases", Keys.ENTER);
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
    }


    @Test
    public void interestBasedAds() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Interest-Based Ads")).click();

    }


    @Test
    public void backToTop(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.className("navFooterBackToTopText")).click();


    }

    @Test
    public void Back(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Try Prime")).click();
        webDriver.navigate().back();

    }

    @Test
    public void AmazonTitle (){
        webDriver.get("https://www.amazon.com");
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        webDriver.close();
    }

    @Test
    public void validLoginforAmazon(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chocolategirl1995@gmail.com");
        webDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("tester123");
        webDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }

    @Test
    public void checkAmazonBrowsingHistory(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chocolategirl1995@gmail.com");
        webDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("tester123");
        webDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        webDriver.findElement(By.id("nav-recently-viewed")).click();
    }


    @Test
    public void Reccomendations(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chocolategirl1995@gmail.com");
        webDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("tester123");
        webDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        webDriver.findElement(By.linkText("Recommended For You")).click();

    }

    @Test
    public void yourProfile(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chocolategirl1995@gmail.com");
        webDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("tester123");
        webDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        webDriver.findElement(By.linkText("Your Profile")).click();

    }
    @Test
    public void Todaysdeals(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("chocolategirl1995@gmail.com");
        webDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        webDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("tester123");
        webDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        webDriver.findElement(By.linkText("Prime Student, start your 6-month trial")).click();
    }
    
    @Test//hey
    public void AmazonCategoriesDrop(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).click();
    }

    @Test//h
    public void mainCategories(){
        AmazonCategoriesDrop();
        webDriver.findElement(By.xpath("//option[@value='']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("", Keys.ENTER);
    }
    
    
    @Test//h
    public void AmazonCategories(){
        AmazonCategoriesDrop();
        webDriver.findElement(By.xpath("//option[@value='']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("", Keys.ENTER);
    }




    @Test
    public void giftCards(){
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Gift Cards")).click();
        }


}




