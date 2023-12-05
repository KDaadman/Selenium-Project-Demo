package com.litigiven.pages;

import com.litigiven.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School_Double_Click_Page {

    // 1. Create constructor and initialize the 'driver' instance and 'object' of the current class.
    public W3School_Double_Click_Page() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    // instead of using findElement(), we use @RindBy annotation.

    @FindBy (id = "demo")
    public WebElement doubleClickMe;
}
