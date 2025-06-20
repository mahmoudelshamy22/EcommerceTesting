package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void testAddProductToCart() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.searchProduct("hoodie");
        Thread.sleep(2000); // wait for results
        home.clickFirstSearchResult();

        ProductPage product = new ProductPage(driver);
        Thread.sleep(1000); // wait for product page load
        product.selectSize();
        product.selectColor();
        product.clickAddToCart();

        Thread.sleep(2000); // optional wait to observe result
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
