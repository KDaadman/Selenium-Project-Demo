package com.litigiven.tests;

import com.litigiven.pages.W3School_Double_Click_Page;
import com.litigiven.utilities.ConfigurationReader;
import com.litigiven.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick_Demo {

    @Test
    public void double_click_test1(){

       // TC #1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get(ConfigurationReader.getTheProperty("w3SchoolsURL"));

       // Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.
        //switching to iframe using id/name attribute value
       // Driver.getDriver().switchTo().frame("iframeResult");

        // switching to iframe using its index
       // Driver.getDriver().switchTo().frame(0);

        //switching to iframe using its web element
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']")));


        W3School_Double_Click_Page paragraph = new W3School_Double_Click_Page();
        Actions actions = new Actions(Driver.getDriver());
        //3. Double click on the text “Double-click me to change my text color.
        actions.doubleClick(paragraph.doubleClickMe).perform();

        //4. Assert: Text’s “style” attribute value contains “red”.

        String actualAttributeValue = paragraph.doubleClickMe.getAttribute("style");

        String expectedAttributeValue = "red";

        Assert.assertTrue(actualAttributeValue.contains(expectedAttributeValue),"The actual text's style value does not contain the text as expected!");

       // Driver.closeDriver();

    }
}
