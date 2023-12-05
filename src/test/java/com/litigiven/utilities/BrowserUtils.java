package com.litigiven.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
This class will be storing only the  utility methods that cab used across the project.
 */
public class BrowserUtils {

    /*
    This method will accept in (seconds) and execute Thread.sleep() method for given duration
    Arg: int second
     */
    public static void sleep(int second){

        second *= 1000;

        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        //Returns and stores all window handles in a Set.
        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String eachHandle : allWindowsHandles) {
            driver.switchTo().window(eachHandle);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    public static void verifyTitleContains(WebDriver driver, String expectedInTitle) {

        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));


    }


}
