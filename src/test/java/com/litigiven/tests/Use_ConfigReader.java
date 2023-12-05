package com.litigiven.tests;

import com.litigiven.utilities.ConfigurationReader;
import com.litigiven.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Use_ConfigReader {

    WebDriver driver;
    // TC #4: Google search
    // Use `configuration.properties` for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.

    @BeforeMethod
    public void setUpMethod() {
        //1- Open a chrome browser
        //driver = WebDriverFactory.getDriver("chrome");

        // same as above, but more dynamic
       // driver = WebDriverFactory.getDriver(ConfigurationReader.getTheProperty("browser"));

        String browserType = ConfigurationReader.getTheProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- Go to: https://google.com

       // driver.get("https://google.com");
        driver.get(ConfigurationReader.getTheProperty("googleURL")); // same as the above, but more dynamic
    }

    @AfterMethod
    public void tearDownMethod(){
        //driver.quit();
    }
    @Test
    public void google_search_test(){

        //3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getTheProperty("searchKey") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        String expectedTitle = ConfigurationReader.getTheProperty( "searchKey")+" - Google Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Title provided is not as expected!");

    }
}
