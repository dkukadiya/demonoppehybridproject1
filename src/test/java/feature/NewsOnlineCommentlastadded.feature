Feature: As a register user New comment will add and that comment will disappear in the last.
  @Regression
  Scenario:  As a register user when i click on details and user can fill all the mandatory comment field then
    user should be able to see that last comment.

    Given user is on registration page
    When  user enters required registration details
    And   click on register submit button
    And   user should able to register successfully
    And   user click on continue button
    And   user click on New online store is open
    And   user verify user is on new online store is open and verify leave your comment message
    And   user enters required Comments details
    And   user should able to add comment in NewsCommentPage successfully
    Then  user should be able to see succesfully lase comment in the commentbox


