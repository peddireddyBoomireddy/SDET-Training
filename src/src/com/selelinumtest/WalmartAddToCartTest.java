package com.selelinumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WalmartAddToCartTest {

    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\peddi\\OneDrive - University of New Haven\\Desktop\\Selenium Training - Copy\\AutomationSelenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.walmart.com");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-tl-id='header-GlobalSearch-input']")));
            searchBox.sendKeys("Mobile Phone");
            searchBox.submit();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.search-result-gridview-item")));
            WebElement firstItem = driver.findElements(By.cssSelector("div.search-result-gridview-item")).get(0);
            firstItem.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.prod-ProductCTA--primary")));
            WebElement addToCartButton = driver.findElement(By.cssSelector("button.prod-ProductCTA--primary"));
            addToCartButton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.prod-ProductOffer-ctaAddToCart")));

            WebElement viewCartButton = driver.findElement(By.cssSelector("span[data-automation-id='pac-pos-view-cart']"));
            if (viewCartButton.isDisplayed()) {
                System.out.println("Item added to cart successfully.");
            } else {
                System.out.println("Failed to add item to cart.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}