#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Demosite task



  Scenario Outline: Go to demosite make a user account and login with that same account
   Given I access "www.thedemosite.co.uk/"
    When I click on the add user link and that takes me to the add user page
    And the user enters "<user>" username in the username text box
    And the user enters "<password>" password in the password text box
    And the user clicks the save user button
    And the user clicks on the login user link
    And the user enters the same "<user>" username in the username text box
    And the user enters the same  "<password>" password in the password text box
    And the user clicks the testlogin  button
    Then I verify I have logged in with the "**Successful Login**" text.

    Examples: 
      | user  | password | 
      | fdgghgfhgf|dfgdfg | 
      
