package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils
{
    org.openqa.selenium.By _clickonDesktopCategory=By.linkText("Desktops");
    public void clickOnDesktop()
    {

        //Select the Desktops
        waitForClickable(_clickonDesktopCategory, 30);
        clickOnElement(_clickonDesktopCategory);
    }}


