package com.litigiven.tests;

import com.litigiven.utilities.BrowserUtils;
import com.litigiven.utilities.ConfigurationReader;
import com.litigiven.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Driver_Util_Search_Test {


    // TC #1: Google/Bing searches
    @Test
    public void google_search_test() {

        //2- Go to: https://google.com
        // Driver.getDriver(A) --> will return me the "driver"
        // From now on, we will write Driver.getDriver() instead of writing 'driver'.
        Driver.getDriver().get(ConfigurationReader.getTheProperty("googleURL"));

        //3- Write “apple” in search box
        WebElement searchWord = Driver.getDriver().findElement(By.xpath("//textarea[@name='q']"));
        searchWord.sendKeys(ConfigurationReader.getTheProperty("searchKey") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        String expectedTitle = ConfigurationReader.getTheProperty("searchKey") + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Title provided is not matching the expected one!!!");
    }
    @Test
    public void anyURl_search_test2() {

        //2- Go to: https://bing.com
        // Driver.getDriver(A) --> will return me the "driver"
        // From now on, we will write Driver.getDriver() instead of writing 'driver'.
        Driver.getDriver().get(ConfigurationReader.getTheProperty("desiredURL"));

        //3- Write “apple” in search box
        WebElement searchWord = Driver.getDriver().findElement(By.xpath("//textarea[@name='q']"));
        BrowserUtils.sleep(4);
        searchWord.sendKeys(ConfigurationReader.getTheProperty("searchKey") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        String expectedTitle = ConfigurationReader.getTheProperty("searchKey") + " - Search";
        BrowserUtils.sleep(4);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Title provided is not matching the expected one!!!");
    }


    @AfterMethod
    public void tearDownMethod() {


       // we will use Driver closeDriver();


        Driver.closeDriver();
    }
}
