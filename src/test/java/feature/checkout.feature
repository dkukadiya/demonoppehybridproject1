Feature: checkout feature
  @Regression
  Scenario:  As a register user I can add product in to the add to cart button and checkout aswell on https://demo.nopcommerce.com/

  Given  user is on registration page
  When   user enters required registration details
  And    click on register submit button
  And    user should able to register successfully
  And    user click on Computers menu
  And    user Select desktops category
  And    Click on Build own Computer item
  And    user select all build it features
  And    user click on add to cart button
  And    user can add that product in to the Shopping cart
  And    user tick on the terms & condition service checkbox option
  And    user click on the Checkout button
  And    user can enter all mandatory fields in  Billing address page and click on continue button
  And    user choose the mandatory shipping method option and click on continue button
  And    user select the credit card Payment Method option and click on continue button
  And    user enter payment card information and click on continue button
  And    user click on confirm button
  Then   user should be able to checkout successfully











