package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CategoryUrl extends Utils
{
    By _pagetitle=By.xpath("//h1");

    public  void verifyUsergetPageurl(String pageurl) {
        Assert.assertTrue(driver.getCurrentUrl().equals(pageurl));

    }
    public  void  verifyUsergetPageTitle(String pagetitle)
    {
        Assert.assertEquals(driver.findElement(_pagetitle).getText(),pagetitle);

    }


}


