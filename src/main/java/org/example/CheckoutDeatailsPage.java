package org.example;

import org.openqa.selenium.By;

public class CheckoutDeatailsPage extends Utils
{
    LoadProp loadProp=new LoadProp();
    By _selectcountry= By.id("BillingNewAddress_CountryId");
    By _entercityname=By.id("BillingNewAddress_City");
    By _enterstatename=By.id("BillingNewAddress_StateProvinceId");
    By _enteraddress=By.id("BillingNewAddress_Address1");
    By _enrterzipcode=By.id("BillingNewAddress_ZipPostalCode");
    By _enterphoneno=By.id("BillingNewAddress_PhoneNumber");
    By _clickoncontinue=By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");



    public void enterCheckoutDetailsAllField()
    {
        //select country from dropdown
        selectByFromValue(_selectcountry,loadProp.getProperty("country"));
        //enter the state name
        selectByFromValue(_enterstatename,loadProp.getProperty("state"));
        //enter the city name
        typetext(_entercityname,loadProp.getProperty("city"));
        //enter the addresses field1
        typetext(_enteraddress,loadProp.getProperty("address1"));
        //enter the the zipcode
        typetext(_enrterzipcode,loadProp.getProperty("zipcode"));
        //enter the phone number
        typetext(_enterphoneno,loadProp.getProperty("phonenumber"));
        clickOnElement(_clickoncontinue);
    }}
