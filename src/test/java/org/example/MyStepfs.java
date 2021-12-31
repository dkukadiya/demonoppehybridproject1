package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepfs
{
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationResultPage registrationResultPage=new RegistrationResultPage();
    NewsCommentPage newsCommentPage=new NewsCommentPage();
    NewsCommentResultPage  newsCommentResultPage=new NewsCommentResultPage();
    ComputerPage computerPage=new ComputerPage();
    DesktopPage desktopPage=new DesktopPage();
    BuildYourOwnComputerpage bulidyourOwnComputerPage=new BuildYourOwnComputerpage();
    ReferAProductTobeFriend referAProductTobeFriend=new ReferAProductTobeFriend();
    ReferAProductTobeFriendResultPage referAproductTobeFriendResultPage=new ReferAProductTobeFriendResultPage();
    CategoryUrl categoryUrl=new CategoryUrl();
    Facebookpageurl facebookpageurl=new Facebookpageurl();
    CheckoutDeatailsPage checkoutDeatailsPage=new CheckoutDeatailsPage();
    ShippingMethodPage shippingMethodPage=new ShippingMethodPage();
    PaymentMethodpage paymentMethodpage=new PaymentMethodpage();
    PaymentInformationPage paymentInformationPage=new PaymentInformationPage();
    ConfirmPage confirmPage=new ConfirmPage();
    VotePopupHandling votePopupHandling=new VotePopupHandling();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickonRegisterButton();

    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {

        registrationPage.usercanAddRegistrationDetails();

    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {

    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationResultPage.verifyUserShouldbeabletoRegisterSuccesfully();
    }
    @Given("user click on New online store is open")
    public void user_click_on_new_online_store_is_open() {
        homePage.NewOnlineStoreIsOpen();

    }
    @When("user enters required Comments details")
    public void user_enters_required_comments_details() {
       newsCommentPage.userShouldbeAbletoEnterNewsCommentinNewsCommentbox();

    }
    @When("click on New Comment button")
    public void click_on_new_comment_button() {
        newsCommentPage.clickonnewscommentbutton();
    }
    @Then("user should able to add comment in NewsCommentPage successfully")
    public void user_should_able_to_add_comment_in_news_comment_page_successfully() {
        newsCommentResultPage.userAddedMessagenewsCommentSuccesfullyinPage();
    }
    @Given("user is on Homepage")
    public void user_is_on_homepage() {
        homePage.clickonRegisterButton();
    }
    @Given("user is on Computers category page")
    public void user_is_on_computers_category_page() {
        homePage.clickOnComputer();
    }
    @When("user Select desktops category")
   public void user_select_desktops_category() {
        computerPage.clickOnDesktop();
    }
    @Then("user should able to NavigateTodesktopPage Succesfully")
    public void user_should_able_to_navigate_todesktop_page_succesfully() {
        desktopPage.VerifyUsershouldBeabletoNavigateToDesktopPage();
    }

    @When("user click on Computers menu")
    public void user_click_on_computers_menu() {
        homePage.clickOnComputer();
    }
    @When("Select desktops category")
    public void select_desktops_category() {
        computerPage.clickOnDesktop();    }
    @When("Click on Build own Computer item")
    public void click_on_build_own_computer_item() {
        desktopPage.userCanClickOnBuildYourOwncomputer();
    }
    @When("Click on Email a Friend's button")
    public void click_on_email_a_friend_s_button() {
        bulidyourOwnComputerPage.ClickOnEmailFriendButton();
    }
    @When("user enters required emailFriend's Details")
    public void user_enters_required_email_friend_s_details() {
        referAProductTobeFriend.usercanenteremailfrienddetails();
    }
    @When("click on Send email button")
    public void click_on_send_email_button() {
        referAProductTobeFriend.clickOnEmailButton();
    }
    @Then("user should be able to Refer product to friend")
    public void user_should_be_able_to_refer_product_to_friend() {
        referAproductTobeFriendResultPage.verifyUserReferAProductToFriendSuccessFully();
    }
    @Given("I am on homepage")
    public void i_am_on_homepage() {
    }
    @When("I should be able to verify {string} button accordingly can access it")
    public void i_should_be_able_to_verify_button_accordingly_can_access_it(String category) {
        homePage.clickOnCategory(category);
    }


    @Then("I should be able to verify pagetitile {string} accordingly can access it")
    public void iShouldBeAbleToVerifyPagetitileAccordinglyCanAccessIt(String pagetitle) {
        categoryUrl.verifyUsergetPageTitle(pagetitle);

    }

    @And("I should be able to verify  pageurl {string} accordingly can access it")
    public void iShouldBeAbleToVerifyPageurlAccordinglyCanAccessIt(String pageurl) {
        categoryUrl.verifyUsergetPageurl(pageurl);
    }
    @When("I should be able to verify {string} button accordinly can access it")
    public void i_should_be_able_to_verify_button_accordinly_can_access_it(String subcategory)
    {
       homePage.clickOnSubcategory(subcategory);
    }
    @Then("I should be able to verify {string} color before and after hover succesfully")
    public void i_should_be_able_to_verify_color_before_and_after_hover_succesfully(String categoryname) {
        homePage.colorTest(categoryname);

    }
    @Given("user is on Homepage page")
    public void user_is_on_homepage_page() {
       homePage.clickOnFacebookPage();
    }

    @When("user click on facebook symbol from FOLLOW Us menu bar")
    public void user_click_on_facebook_symbol_from_follow_us_menu_bar() {
        facebookpageurl.CookiesWindowHandles();
        facebookpageurl.acceptCookies();
    }
    @When("user can select the Accept all cookies option from pop window")
    public void user_can_select_the_accept_all_cookies_option_from_pop_window() {
        facebookpageurl.verifyUserIsOnFacebookPage();
    }

    @Then("user can use that page accordingly")
    public void user_can_use_that_page_accordingly()
    {

        facebookpageurl.closeFacebookWindowAndSwitchToMAinWindow();
    }

    @When("user select all build it features")
    public void user_select_all_build_it_features() {
        bulidyourOwnComputerPage.buildItDetailsFeatures();
    }
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        bulidyourOwnComputerPage.addToCardButton();
    }
    @When("user can add that product in to the Shopping cart")
    public void user_can_add_that_product_in_to_the_shopping_cart() {

        bulidyourOwnComputerPage.verifyShoppingCart();
    }
    @When("user tick on the terms & condition service checkbox option")
    public void user_tick_on_the_terms_condition_service_checkbox_option() {
        bulidyourOwnComputerPage.checkOnTermsConditionBox();
    }
    @When("user click on the Checkout button")
    public void user_click_on_the_checkout_button()
    {
        bulidyourOwnComputerPage.clickOnCheckoutButton();
    }
    @When("user can enter all mandatory fields in  Billing address page and click on continue button")
    public void user_can_enter_all_mandatory_fields_in_billing_address_page_and_click_on_continue_button() {
        checkoutDeatailsPage.enterCheckoutDetailsAllField();
    }
    @When("user choose the mandatory shipping method option and click on continue button")
    public void user_choose_the_mandatory_shipping_method_option_and_click_on_continue_button() {

        shippingMethodPage.selectShippingMethodOption();
    }
    @When("user select the credit card Payment Method option and click on continue button")
    public void user_select_the_credit_card_payment_method_option_and_click_on_continue_button() {
        paymentMethodpage.selectCreditCardOption();
    }
    @When("user enter payment card information and click on continue button")
    public void user_enter_payment_card_information_and_click_on_continue_button() {
        paymentInformationPage.userEnterAllPaymentCardDetails();
    }
    @When("user click on confirm button")
    public void user_click_on_confirm_button() {
        confirmPage.forverifyclickOnConfirmButton();
    }
    @Then("user should be able to checkout successfully")
    public void user_should_be_able_to_checkout_successfully() {
        confirmPage.verifyUserShouldOrderSuccessfully();
    }
    @When("I can click on vote")
    public void i_can_click_on_vote()
    {
     homePage.clickonVoteButton();
    }
    @When("I should be  verify popmessage  from alert popup")
    public void i_should_be_verify_popmessage_from_alert_popup() {
        votePopupHandling.verifyPopmessageUrl();
    }
    @Then("I can handle ok button")
    public void i_can_handle_ok_button() {
        votePopupHandling.popuphandlingbutton();
    }
    @When("user click on continue button")
    public void user_click_on_continue_button() {

        registrationPage.clickOncontinue();
    }
    @When("user verify user is on new online store is open and verify leave your comment message")
    public void user_verify_user_is_on_new_online_store_is_open_and_verify_leave_your_comment_message() {
       newsCommentPage.verifyNewsOnlieMessageAndCommentMessage();
       newsCommentPage.userShouldbeAbletoEnterNewsCommentinNewsCommentbox();
       newsCommentPage.clickonnewscommentbutton();
    }
    @Then("user should be able to see succesfully lase comment in the commentbox")
    public void user_should_be_able_to_see_succesfully_lase_comment_in_the_commentbox() {
    newsCommentPage.verifyNewlyAddedCommentAppearInTheCommentList();

    }

}



