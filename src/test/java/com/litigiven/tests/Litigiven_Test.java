package com.litigiven.tests;

import com.litigiven.pages.Litigiven_ContactPage;
import com.litigiven.utilities.BrowserUtils;
import com.litigiven.utilities.ConfigurationReader;
import com.litigiven.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Litigiven_Test {

    Litigiven_ContactPage contactPage;

    @BeforeMethod
    public void setUpMethod() {

        // TC #1: Litigiven contact page navigation
        //1. Go to Litigiven homepage
        //https://www.litigiven.com

        Driver.getDriver().get(ConfigurationReader.getTheProperty("litigivenURL"));

        contactPage = new Litigiven_ContactPage();
    }

    @AfterMethod
    public void tearDownMethod(){

        //Driver.closeDriver();
    }
    @Test

    public void say_hello_litigiven_test(){

        //2. create Acctions object to perform actions.
        Actions actions = new Actions(Driver.getDriver());

        // Hover over the More option on the upper right corner
        BrowserUtils.sleep(2);
        actions.moveToElement(contactPage.homepageMoreOption).perform();

        //3. click Contact on the dropdown
        BrowserUtils.sleep(3);
        contactPage.contactpageClick.click();

        //4. type first name in the firstname inputbox
        contactPage.firstNameInput.sendKeys("David");

        //5. type last name in the lastname inputbox
        contactPage.lastNameInput.sendKeys("Wilson");
        contactPage.emailInput.sendKeys("email.test@gmail.com");

        //6. type email in the email inputbox
        contactPage.messageInputBox.sendKeys("Thanks");

        //7. click the send button to send the given data.
       //contactPage.sendButton.click();

       // Finally, Verify the expected result with the actual result.
         // Expected: "Thanks for submitting!"
       // String expectedResultMessage ="Thanks for submitting!";
       // String actualResultMessage = contactPage.thanksgivingMessage.getText();

       // Assert.assertTrue(actualResultMessage.equals(expectedResultMessage),"The acual message provided is not as expected!!!");
    }
}
