package com.litigiven.pages;

import com.litigiven.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Litigiven_ContactPage {

    public Litigiven_ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy (xpath = "(//p[@id='comp-it2peav5__more__label'])[1]")
   public WebElement homepageMoreOption;

    @FindBy (xpath = "//li[@id='comp-it2peav5moreContainer1']")
    public WebElement contactpageClick;

    @FindBy (name = "first-name")
    public WebElement firstNameInput;

    @FindBy (name = "last-name")
    public WebElement lastNameInput;

    @FindBy (name = "email")
    public WebElement emailInput;

    @FindBy (xpath = "//textarea[@id='textarea_comp-lnmijxy05']")
    public WebElement messageInputBox;

    @FindBy(xpath = "//span[text()='Send']")
    public WebElement sendButton;

    @FindBy (xpath = "//span[text()='Thanks for submitting!']")
    public WebElement thanksgivingMessage;
}
