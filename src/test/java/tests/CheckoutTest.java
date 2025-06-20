package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.ProductPage;
import pages.CartPage;

public class CheckoutTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void testCheckoutProcess() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.searchProduct("hoodie");
        Thread.sleep(2000); // wait for results
        home.clickFirstSearchResult();

        ProductPage product = new ProductPage(driver);
        Thread.sleep(1000);
        product.selectSize();
        product.selectColor();
        product.clickAddToCart();

        Thread.sleep(1000);
        CartPage cart = new CartPage(driver);
        cart.viewCart();
        cart.proceedToCheckout();

        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Checkout"), "Checkout page not displayed");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
