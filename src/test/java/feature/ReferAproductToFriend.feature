Feature: Only Registerd user should be able to Refer a Product to Friend on DemoNopeCommerce website.

@test3
Scenario: Registerd user should be able to Refer Any product to Friend on DemoNopeCommerce website

  Given user is on registration page
  When  user enters required registration details
  And   click on register submit button
  And   user should able to register successfully
  And   user click on Computers menu
  And   Select desktops category
  And   Click on Build own Computer item
  And   Click on Email a Friend's button
  And   user enters required emailFriend's Details
  And   click on Send email button
  Then  user should be able to Refer product to friend


