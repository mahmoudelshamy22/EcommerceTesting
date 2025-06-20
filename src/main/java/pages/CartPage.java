package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void viewCart() {
        driver.findElement(By.cssSelector(".action.showcart")).click();
    }

    public void proceedToCheckout() {
        driver.findElement(By.cssSelector("a.checkout")).click(); // Adjust this if needed
    }
}
