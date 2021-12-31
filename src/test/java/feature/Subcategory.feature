Feature:  As a user i want to navigate from main category to subcateroy on https://demo.nopcommerce.com/

  @Regression
  Scenario Outline:As a user when I click on  main category so that accordingly i can access their subcategory.

    Given I am on homepage
    When  I should be able to verify "<category>" button accordingly can access it
    And   I should be able to verify "<subcategory>" button accordingly can access it
    And   I should be able to verify  pageurl "<page_URL>" accordingly can access it
    And   I should be able to verify pagetitile "<page_title>" accordingly can access it
    Then  I should be able to verify "<category>" color before and after hover succesfully
    Examples:
      | category    | subcategory    | page_URL                                  | page_title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |













