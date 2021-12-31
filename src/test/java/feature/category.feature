Feature: category page

  @test5
  Scenario Outline: As a user when i click on that specific category so i can access that category

    Given I am on homepage
    When  I should be able to verify "<category>" button accordingly can access it
    And   I should be able to verify  pageurl "<page_URL>" accordingly can access it
    Then  I should be able to verify pagetitile "<page_title>" accordingly can access it
    Examples:
      | category          |  |page_URL                                       | page_title        |
      | Computers         |  | https://demo.nopcommerce.com/computers         | Computers         |
      | Electronics       |  | https://demo.nopcommerce.com/electronics       | Electronics       |
      | Apparel           |  | https://demo.nopcommerce.com/apparel           | Apparel           |
      | Digital downloads |  | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
      | Books             |  | https://demo.nopcommerce.com/books             | Books             |
      | Jewelry           |  | https://demo.nopcommerce.com/jewelry           | Jewelry           |
      | Gift Cards        |  | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |



