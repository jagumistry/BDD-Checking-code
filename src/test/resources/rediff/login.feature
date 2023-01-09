@Rediff
Feature: Validating Login page of rediff.com
  I want to validate positive and negative scenarios for this page
  
  @Validatewihcorrectcredentials
  Scenario: Validate login functionality with correct username and password
  Given I open a chrome browser
  And I enter the url https://rediff.com
  And I click on the signin page
  Then I am redirected to the login page
  And I enter the correct username seleniumpanda@gmail.com
  And I enter the correct password Selenium@123
  When I click on the signin button
  Then I am logged into my rediffmail inbox
  But I see there is always a lag of 4 to 5 seconds
  
  
  @ValidateInboxPage
  Scenario: Validate inbox page of rediffmail
  Given I open a chrome browser
  And I enter the url https://rediff.com
  And I click on the signin page
  Then I am redirected to the login page
  And I enter the correct username seleniumpanda@gmail.com
  And I enter the correct password Selenium@123
  When I click on the signin button
  Then I am logged into my rediffmail inbox
  And I can see my profile name on top right
  And I see the logout link under my profile name
  
  
  
  
  