package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Select the first available size option
    public void selectSize() {
        driver.findElement(By.cssSelector("div.swatch-attribute.size div.swatch-option")).click();
    }

    // Select the first available color option
    public void selectColor() {
        driver.findElement(By.cssSelector("div.swatch-attribute.color div.swatch-option")).click();
    }

    // Click the Add to Cart button
    public void clickAddToCart() {
        driver.findElement(By.id("product-addtocart-button")).click();
    }
}
