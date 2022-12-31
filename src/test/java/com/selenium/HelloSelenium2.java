package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class HelloSelenium2 {
    @FindBy(id="asd")
    private WebElement searchField;

    public static void main(String[] args) {

//        System.setProperty("webdriver.gecko.driver","//Users//arup//seleniumdrivers//geckodriver");
//        File pathBinary = new File("/Applications/Firefox.app/Contents/MacOS/firefox-bin");
//        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//        DesiredCapabilities desired = DesiredCapabilities.firefox();
//        FirefoxOptions options = new FirefoxOptions();
//        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));

        System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        WebDriver driver = new FirefoxDriver();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,timeout.getSeconds());
        try {

            getWebElementSubmit(driver);

//            WebElement email = getWebElementEmail(driver);
//            WebElement pwd = getWebElementPassword(driver);
//
//
//            System.out.println( pwd.getTagName());
           // System.out.println( submit.getText()+"  "+submit.getAttribute("class"));
        } finally {
            driver.quit();
        }
    }

    private static WebElement getWebElementEmail(WebDriver driver) {
        driver.get("https://www.dice.com/dashboard/login");
        return driver.findElement(By.id("email"));
    }

    private static WebElement getWebElementPassword(WebDriver driver) {
        driver.get("https://www.dice.com/dashboard/login");
        return driver.findElement(By.id("password"));
    }

    private static void getWebElementSubmit(WebDriver driver) {
        driver.get("https://developer.mozilla.org/en-US/docs/Learn/HTML/Tables/Basics");
        WebElement submit1 = driver.findElements(By.xpath("//*[@id='content']/article/div[3]/table/tbody/tr[1]/td[1]")).get(0);
        WebElement submit2 = driver.findElements(By.xpath("//*[@id='content']/article/div[3]/table/tbody/tr[2]/td[2]")).get(0);
        WebElement submit3 = driver.findElements(By.xpath("//*[@id='content']/article/div[3]/table/tbody/tr[3]/td[3]")).get(0);
        //window handles
        driver.getWindowHandle();
        driver.getWindowHandles();
        //loading frames
        //driver.switchTo().frame("test");

        //screenshots
        //File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //window.scrollBy(0,200);
        //driver.manage() --for cookies etc

//        submit.sendKeys()
        Actions actions = new Actions(driver);
//       actions.click(submit1).perform();

//        actions.
//        clickAndHold().
//        moveByOffset(50,200).
//        release().
//        perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        System.out.println(js.executeScript("return document.title"));

        System.out.println(submit1.getText());
        System.out.println(submit2.getText());
        System.out.println(submit3.getText());

    }

//    void PhantomJS(){
//        WebDriverManager.phantomjs().setup();;
//        WebDriver driver = new PhantomJsDriverManager();
//    }

//@DataProvider(name="data-provider-method")
//    public String[] nameArrayDataProvider(){
//        return new String[]{"hello","adam","eve"};
//}

//    @Test(dataProivder="data-provider-method")
//    void dataDriven(){
//
//    }

//Page Object Model, avoid repetation (pattern) or managing selenium tests
//https://www.browserstack.com/guide/page-object-model-in-selenium#:~:text=Page%20Object%20Model%2C%20also%20known,application%20as%20a%20class%20file.

//    void test(){
//        PageFactory pf = PageFactory.initElements(driver,LoginPage.class);
//         create class and map it to the element
//    }

//Remember Page Object Model, makes code more readable.

//Selenium grid, set of boxes
    //npm install selenium-standalone@latest -g
    //RemoteWebDriver
    //Selenium Grid, Hub and Nodes, cabpabilities


}