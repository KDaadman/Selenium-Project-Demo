package com.litigiven.utilities;

//TASK: NEW METHOD CREATION
//Method name : getDriver
//Method Type: Static Method
// Accepts String arg: browserType
//  - This arg will determine what type of browser is opened
//  - if "chrome" passed --> it will open chrome brwoser
//  - if "firefox" passed --> it will open firefox brwoser.
//RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

   public static WebDriver getDriver(String browserType) {
       if (browserType.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
           return new ChromeDriver();

       } else if(browserType.equalsIgnoreCase("firefox")) {
           WebDriverManager.firefoxdriver().setup();
           return  new FirefoxDriver();
       }else {
           System.out.println("Given String does NOT represent any browser");
           System.out.println("Either that browser doesn't exist or is not currently supported.");
           System.out.println("driver = null");

           return null;

       }
   }
}

