package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerpage extends Utils
{
    By _EmailFriendButton=By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");
    LoadProp loadProp=new LoadProp();
    By _selectprocesser=By.id("product_attribute_1");
    By _selectram=By.id("product_attribute_2");
    By _radioButton=By.id("product_attribute_3_6");
    By _radioButton1=By.id("product_attribute_4_9");
    By _checkbox2=By.id("product_attribute_5_11");
    By _checkbox3=By.id("product_attribute_5_12");
    By _clickaddcartbutton=By.id("add-to-cart-button-1");
    By _shoppingcart=By.xpath("//span[contains(text(),'Shopping cart')]");
    By _termsofconditionbox=By.id("termsofservice");
    By _checkoutbutton=By.id("checkout");



    public void ClickOnEmailFriendButton()
    {
        //Click on the Email a friend Button
        clickOnElement(_EmailFriendButton);

    }
  public void buildItDetailsFeatures()
  {
      //select processer from dropdown
      selectByFromValue(_selectprocesser, loadProp.getProperty("processer"));
      //select ram from drop down list
      selectByFromValue(_selectram, loadProp.getProperty("ram"));
      //select Hdd radio button
      clickOnElement(_radioButton);
      //select os option from radio button
      clickOnElement(_radioButton1);
      //select all the checkbox
      clickOnElement(_checkbox2);
      clickOnElement(_checkbox3);
  }
        public void addToCardButton()
      {
      //click on add to card button
      clickOnElement(_clickaddcartbutton);
     // waitForVisible(_clickaddcartbutton, 10);
      }
       public void verifyShoppingCart()
        {
        //click shopping cart
        clickOnElement(_shoppingcart);
        }
        public void checkOnTermsConditionBox()
        {

            clickOnElement(_termsofconditionbox);
        }
        public void clickOnCheckoutButton()
        {
         clickOnElement(_checkoutbutton);
        }



}


