Feature: Vote verify and  popup  alert handling
  @Regression
  Scenario: As a non Register user I should click on Vote button and I can handle popup alert box

 Given I am on homepage
 When  I can click on vote
 And   I should be  verify popmessage  from alert popup
 Then  I can handle ok button