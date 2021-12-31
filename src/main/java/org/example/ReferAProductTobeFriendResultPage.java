package org.example;

import org.testng.Assert;

public class ReferAProductTobeFriendResultPage extends Utils
{
    public void verifyUserReferAProductToFriendSuccessFully()
    {
        //Confitmation Message on Sending Email
        String ActualMessage = getTextFromElement(org.openqa.selenium.By.xpath("//div[@class='result']"));
        String ExpectedMessge = "Your message has been sent.";
        Assert.assertEquals(ActualMessage,ExpectedMessge," Your message has not been sent.");
    }
}
