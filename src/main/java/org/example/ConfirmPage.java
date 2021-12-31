package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;



public class ConfirmPage extends Utils
{
    LoadProp loadProp=new LoadProp();
    By _confirfmbutton=By.id("confirm-order-buttons-container");
    By _verifymessage=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public void forverifyclickOnConfirmButton()
    {

        clickOnElement(_confirfmbutton);
    }
    public void verifyUserShouldOrderSuccessfully()
    {
        waitForVisible(_verifymessage,15);
        Assert.assertTrue(driver.getCurrentUrl().contains("completed"));
        Assert.assertEquals(getTextFromElement(_verifymessage),loadProp.getProperty("expectedresult"));
    }

}
