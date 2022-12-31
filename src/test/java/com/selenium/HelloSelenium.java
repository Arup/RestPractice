package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HelloSelenium {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,timeout.getSeconds());
        //googleSearch(driver, wait);
        search(driver);
    }

    private static void googleSearch(WebDriver driver, WebDriverWait wait) {
        try {
            driver.get("https://google.com/ncr");
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
            System.out.println(firstResult.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
    }


    private static void search(WebDriver driver){
        driver.get("http://www.apress.com");
        //Finding Element of search bar
        WebElement search = driver.findElement(By.name("query"));
        //Searching book name as query
        search.sendKeys("Python Testing with Selenium");
        //Submitting the query
        search.submit();
        //Closing browser
        driver.close();
        driver.quit();
    }
}