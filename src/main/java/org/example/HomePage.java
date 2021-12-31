package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import org.testng.Assert;


public class HomePage  extends Utils


    {
        //Click on register button
        By _registerLinkButton=By.linkText("Register");
        By _clickonnewsonlinestore=By.linkText("New online store is open!");
        By _computer=By.linkText("Computers");
        By _facebookbuton=By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");
        By _clickvote=By.id("vote-poll-1");

        public void clickonRegisterButton()
        {
            clickOnElement(_registerLinkButton);

        }
        public void NewOnlineStoreIsOpen()
        {
            //Click on New online store is open
            clickOnElement(_clickonnewsonlinestore);
        }
        public void clickOnComputer()
        {
            //Click on computer menu bar
            clickOnElement(_computer);
        }
        public void clickOnCategory(String category)
        {
        clickOnElement(By.linkText(category));
       }

        public void clickOnSubcategory(String subcategory)
        {
            Actions action = new Actions(driver);
            WebElement element = driver.findElement(By.linkText(subcategory));
            action.moveToElement(element).perform();
            waitForVisible((org.openqa.selenium.By) element,15);
        }
        public void clickOnFacebookPage()
        {
            clickOnElement(_facebookbuton);
        }
        public void clickonVoteButton()
        {
            clickOnElement(_clickvote);
        }
        public void colorTest(String categoryname)
        {
           // driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
           // String expectedcolor= "#555";

            WebElement color = driver.findElement(By.linkText(categoryname));
            String s1 = color.getCssValue("color");
            System.out.println("Before : " + s1);
            Actions actions = new Actions(driver);
            actions.moveToElement(color).build().perform();
            WebElement AfterHover = driver.findElement(By.linkText(categoryname));
            String s2 = color.getCssValue("color");
            System.out.println("After Hover : " + s2);
            System.out.println(s2.equals(loadProp.getProperty("blue")));
            Assert.assertTrue(s2.equals(loadProp.getProperty("blue")));

        }
    }

