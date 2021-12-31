package org.example;

import org.openqa.selenium.By;

public class PaymentMethodpage extends Utils
{

    By _creditcardoptions=By.xpath("//input[@id=\"paymentmethod_1\"]");
    By _continuebutton=By.id("payment-method-buttons-container");

    public void selectCreditCardOption()
    {
        waitForVisible(_creditcardoptions,10);
        clickOnElement(_creditcardoptions);
        waitForVisible(_continuebutton,10);
        clickOnElement(_continuebutton);
    }
}
