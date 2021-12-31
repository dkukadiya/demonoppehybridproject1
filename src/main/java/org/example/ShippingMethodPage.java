package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ShippingMethodPage extends Utils
{

            By _nextdayair=By.id("//input[@id='shippingoption_1']");
            By _selectoption=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]\n");

            public void selectShippingMethodOption()
           {
               clickOnElement(_selectoption);
               clickOnElement(_selectoption);
           }
}
