package org.example;

import org.openqa.selenium.By;

public class PaymentInformationPage extends Utils

{
    By _selectcardtype=By.id("CreditCardType");
    By _entercardholdername=By.id("CardholderName");
    By _entercardnumber=By.id("CardNumber");
    By _selectmonth=By.id("ExpireMonth");
    By _selectyear=By.id("ExpireYear");
    By _entercode=By.id("CardCode");
    By _continuebutton=By.xpath("//div[@id='payment-info-buttons-container']/button");


    public  void userEnterAllPaymentCardDetails()
    {
        //select the creditcard
        selectByFromValue(_selectcardtype,loadProp.getProperty("creditcard"));
        //enter cardholder name
        typetext(_entercardholdername,loadProp.getProperty("creditcard"));
        //enter cardnumber
        typetext(_entercardnumber,loadProp.getProperty("Cardnumber"));
        //select the month
        selectByFromValue(_selectmonth,loadProp.getProperty("expireMonth"));
        //select the year
        selectByFromValue(_selectyear,loadProp.getProperty("expireYear"));
        //enter yhe card code
        typetext(_entercode,loadProp.getProperty("cardcode"));
        //click on continue button
        clickOnElement(_continuebutton);
    }}


