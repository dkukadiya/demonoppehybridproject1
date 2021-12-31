Feature: User can click on facebook page from home page and handle that window.

  @Regression
  Scenario: AS a user whenever I click on the facebook page on the main page of demonoppcommerce.com and i can handle that window page.

    Given user is on Homepage page
    When  user click on facebook symbol from FOLLOW Us menu bar
    And   user can select the Accept all cookies option from pop window
    Then  user can use that page accordingly
