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
    public void Department() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//div[@class='nav-fill']//span[@class='nav-line-2']")).click();
    }

    @Test
    public void mainPrimeVideo() {
        Department();
        WebElement element = webDriver.findElement(By.xpath("//div[@class='fsdDeptBox']//div[@class='fsdDeptCol']"));
        List<WebElement> links = element.findElements(By.tagName("a"));

        for (WebElement urls : links)
            System.out.println(urls.getText());
    }

    @Test
    public void ScreenShots() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=videogames']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("NBA 2K", Keys.ENTER);
    }


    public void Games() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=mobile-apps']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apps and games", Keys.ENTER);
    }

    @Test
    public void ArtsAndCrafts() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=arts-crafts']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("arts and crafts", Keys.ENTER);
    }

    @Test
    public void CategoriesArtsAutomotive() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=automotive']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("automotive parts", Keys.ENTER);
    }

    @Test
    public void AutomotiveParts() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=automotive']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("automotive parts", Keys.ENTER);
    }

    @Test
    public void Baby() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=baby-products']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("baby", Keys.ENTER);
    }

    @Test
    public void BeautyPersonal() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=beauty']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Beauty & Personal Care", Keys.ENTER);
    }

    @Test
    public void CategoriesBooks() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=stripbooks']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("books", Keys.ENTER);
    }

    @Test
    public void CategoriesCDVinyl() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=popular']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("CDs & Vinyl", Keys.ENTER);
    }


    @Test
    public void SearchGoBackGoForwardClearSearchAndSearchForMoreItems() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.findElement(By.id("twotabsearchtextbox")).clear();
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cuff Links", Keys.ENTER);
    }

   
    public void AmazonBrowserClose() {
        webDriver.get("https://www.amazon.com");
        webDriver.close();
    }

    public void Categories() {
        webDriver.get("https://www.amazon.com");
        List<WebElement> categories = webDriver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        for (WebElement search : categories) {
            System.out.println(search.getText());

            webDriver.close();
        }
    }

    @Test
    public void mainDeliverTo() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.cssSelector(".nav-a.nav-a-2.a-popover-trigger.a-declarative")).click();
    }

    @Test
    public void ClickDone() {
        mainDeliverTo();
        webDriver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
        webDriver.close();
    }
    
    @Test
    public void mainCategoriesdrop() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).click();
    }

    @Test
    public void Alexa() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=alexa-skills']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("alexa", Keys.ENTER);
    }

    @Test
    public void Device() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=amazon-devices']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("amazon device", Keys.ENTER);
    }

    @Test
    public void AmazonFresh() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=amazonfresh']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("amazon fresh", Keys.ENTER);
    }

    @Test
    public void WarehouseDeals() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=warehouse-deals']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("warehouse deals", Keys.ENTER);
    }

    @Test
    public void Appliances() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=appliances']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("appliances", Keys.ENTER);
    }

    


    @Test
    public void CellphoneAccessories() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=mobile']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cell Phones & Accessories", Keys.ENTER);
    }

    @Test
    public void CategoriesClothingShoes() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=fashion']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Clothing, Shoes & Jewelry", Keys.ENTER);
    }

    @Test
    public void CategoriesWomen() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='value=\"search-alias=fashion-womens\"']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("womens", Keys.ENTER);
    }

    @Test
    public void Men() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=fashion-mens']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men", Keys.ENTER);
    }

    @Test
    public void Girls() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=fashion-girls']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("girls", Keys.ENTER);
    }

    @Test
    public void Boys() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=fashion-boys']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("boys", Keys.ENTER);
    }

    @Test
    public void BabyFashion() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=fashion-baby']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("baby fashion", Keys.ENTER);
    }

    @Test
    public void Collectibles() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=collectibles']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("collectibles", Keys.ENTER);
    }

    @Test
    public void Computers() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=computers']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("computers", Keys.ENTER);
    }

    @Test
    public void Courses() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=courses']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("courses", Keys.ENTER);
    }

    @Test
    public void Credit() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=financial']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Credit and Payment Cards", Keys.ENTER);
    }

    @Test
    public void DigitalMusic() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=digital-music']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("digital music", Keys.ENTER);
    }

    @Test
    public void Electronics() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=electronics']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("electronics", Keys.ENTER);
    }

    @Test
    public void Garden() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=lawngarden']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Garden & Outdoor", Keys.ENTER);
    }

    @Test
    public void GiftCard() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=gift-cards']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("gift cards", Keys.ENTER);
    }

    @Test
    public void Grocery() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=grocery']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Grocery & Gourmet Food", Keys.ENTER);
    }

    @Test
    public void Handmade() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=handmade']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("handmade", Keys.ENTER);
    }

    @Test
    public void Health() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=hpc']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Health, Household & Baby Care", Keys.ENTER);
    }

    @Test

    public void HomeBusinessService() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=local-services']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home & Business Services", Keys.ENTER);
    }

    @Test
    public void HomeKitchen() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=garden']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Home & Kitchen", Keys.ENTER);
    }

    @Test
    public void Industrial() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=industrial']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Industrial & Scientific", Keys.ENTER);
    }

    @Test
    public void Kindle() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=digital-text']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kindle Store", Keys.ENTER);
    }

    @Test
    public void AmazonTravel() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=fashion-luggage']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Luggage & Travel Gear", Keys.ENTER);
    }

    @Test
    public void Luxury() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=luxury-beauty']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Luxury Beauty", Keys.ENTER);
    }

    @Test
    public void Magazine() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=magazines']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Magazine Subscriptions", Keys.ENTER);
    }

    @Test
    public void Movies() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=movies-tv']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Movies & TV", Keys.ENTER);
    }

    @Test
    public void Musical() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=mi']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Musical Instruments", Keys.ENTER);
    }

    @Test
    public void OfficeProducts() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=office-products']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Office Products", Keys.ENTER);
    }

    @Test
    public void PetSupplies() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=pets']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Pet Supplies", Keys.ENTER);
    }

    @Test
    public void PrimeSavings() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=prime-exclusive']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Exclusive Savings", Keys.ENTER);
    }

    @Test
    public void PrimePantry() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=pantry']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Pantry", Keys.ENTER);
    }

    @Test
    public void PrimeVideo() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=instant-video']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Prime Video", Keys.ENTER);
    }

    @Test
    public void Software() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=software']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("software", Keys.ENTER);
    }

    @Test
    public void Sports() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=sporting']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Sports & Outdoors", Keys.ENTER);
    }

    @Test
    public void HomeImprovement() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=tools']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Tools & Home Improvement", Keys.ENTER);
    }

    @Test
    public void ToysGames() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=toys-and-games']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Toys & Games", Keys.ENTER);
    }

    @Test
    public void Vehicles() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=vehicles']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Vehicles", Keys.ENTER);
    }

    @Test
    public void Videogames() {
        mainCategoriesdrop();
        webDriver.findElement(By.xpath("//option[@value='search-alias=videogames']")).click();
        webDriver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ps4 games", Keys.ENTER);
    }

    @Test
    public void Game() {
        Videogames();
        webDriver.findElement(By.xpath("//div[@id='resultsCol']//ul[@id='s-results-list-atf']//li[@id='result_4']//img[@class='s-access-image cfMarker']")).click();
    }

    @Test
    public void mainAddGOWToCart() {
        Game();
        webDriver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    }

    @Test
    public void amazonLogin() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("nav-link-accountList")).click();
    }

    @Test
    public void searchAndGoBack() {
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
    public void AmazonimplicitWait() {
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

    public void AmazonSearchBackForwardClearSearchTest() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.findElement(By.id("twotabsearchtextbox")).clear();
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
    public void searchGoBackAndRefresh() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        webDriver.navigate().back();
        webDriver.navigate().refresh();
    }

    @Test
    public void AmazonmainAmzonBrowserTitle() {
        webDriver.get("https://www.amazon.com");
        System.out.println(webDriver.getCurrentUrl());
        System.out.println(webDriver.getTitle());
        webDriver.close();
    }

    @Test
    public void Cart() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.linkText("Cart" +
                "t")).click();

    }

    @Test
    public void mainSearchForItemsGoBackAndSearchMore() {
        webDriver.get("https://www.amazon.com");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("razors", Keys.ENTER);
        webDriver.navigate().back();
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone cases", Keys.ENTER);
        webDriver.navigate().back();


    }

}


