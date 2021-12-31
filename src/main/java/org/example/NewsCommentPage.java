package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewsCommentPage extends Utils {
    LoadProp loadProp = new LoadProp();
    org.openqa.selenium.By _AddTitle = By.id("AddNewComment_CommentTitle");
    By _AddComment = By.id("AddNewComment_CommentText");
    By _verifymessage = By.xpath("//div[@class=\"page-title\"]");
    By _verifymessage1 = By.xpath("//*[@id=\"comments\"]/div[1]/strong");
    By _comment=By.xpath("//div[@class='comment-list']");
    By _commentbox=By.xpath("//div[@class=\"comment news-comment\"]");


    public void userShouldbeAbletoEnterNewsCommentinNewsCommentbox() {

        typetext(_AddTitle, loadProp.getProperty("title"));
        //Type the Comment in commentfield box
        typetext(_AddComment, loadProp.getProperty("comment"));
        //Click on the  new Comment button
    }

    public void clickonnewscommentbutton() {
        waitForClickable(By.xpath("//div/button[@class=\"button-1 news-item-add-comment-button\"]"), 10);
        clickOnElement(By.xpath("//div/button[@class=\"button-1 news-item-add-comment-button\"]"));
    }

    public void verifyNewsOnlieMessageAndCommentMessage() {
        // Assert.assertTrue(driver.getTitle().contains("new-online-store-is-open"));
        Assert.assertEquals(getTextFromElement(_verifymessage), loadProp.getProperty("expectedResult"));
        Assert.assertEquals(getTextFromElement(_verifymessage1), loadProp.getProperty("expectedResult1"));
    }

    public void verifyNewlyAddedCommentAppearInTheCommentList() {
    //verify my comment is last
        WebElement comment1= driver.findElement(_comment);
        //declared Array for comment lst
        List<WebElement> compares=comment1.findElements(_commentbox);
        //stored last comment in alist
        WebElement printlastComment=compares.get(compares.size()-1);
        //print last comment
        System.out.println(printlastComment.getText());
        //assert last comment with your comment
        Assert.assertTrue(printlastComment.getText().contains(loadProp.getProperty("comment")));

    }


}





