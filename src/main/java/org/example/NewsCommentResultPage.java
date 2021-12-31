package org.example;

import org.testng.Assert;

public class NewsCommentResultPage extends Utils
{
    public void userAddedMessagenewsCommentSuccesfullyinPage()
    {
        //print the 'Message News comment is successfully added' in the concole
        String ActualCommentSuccesMessage = getTextFromElement(org.openqa.selenium.By.xpath("//div[@class='result']"));
        String ExpectedRegisterSuccesMessage = "News comment is successfully added.";
        Assert.assertEquals(ActualCommentSuccesMessage,(ExpectedRegisterSuccesMessage), "News comment is successfully added");
    }
}
