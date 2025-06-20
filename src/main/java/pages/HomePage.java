package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By searchBox = By.id("search");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchBox).submit();
    }

    public void clickFirstSearchResult() {
        driver.findElement(By.cssSelector(".product-item-link")).click();
    }
}
