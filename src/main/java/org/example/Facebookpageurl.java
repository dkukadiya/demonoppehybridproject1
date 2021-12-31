package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;



public class Facebookpageurl extends Utils
{
    By _acceeptcookies=By.xpath("//div[@class='_9xo5']/button[2]");


    public void CookiesWindowHandles() {
        //window handles
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
    }
    public void acceptCookies(){
        //Accept cookie
        clickOnElement(_acceeptcookies);
    }

    public void verifyUserIsOnFacebookPage(){
        //verify user is on facebook page
        Assert.assertTrue(driver.getCurrentUrl().contains("nopCommerce"));
    }
    public void closeFacebookWindowAndSwitchToMAinWindow() {
        //close facebook tab or childWindow
        driver.close();
        //now user switch to main page (parent window)
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        String parentWindow = iterator.next();
        driver.switchTo().window(parentWindow);
    }
}





