package org.example;
import org.testng.Assert;

public class VotePopupHandling extends  Utils
{
    LoadProp loadProp=new LoadProp();

    public void popuphandlingbutton()
    {
        driver.switchTo().alert().accept();

    }
    public void verifyPopmessageUrl()
    {
      Assert.assertEquals(driver.switchTo().alert().getText(),loadProp.getProperty("expectedpopupmessage"));
    }

}
