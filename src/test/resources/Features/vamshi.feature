#Author: Vamshidhar Reddy

@tag
Feature: Vamshi test Cases
  Sample Test cases writter for Contact Us Page

#PASSED
@tag1
  Scenario: Validate  lables in contact us page 
    Given browser is open
    When user is on nandamurisloution website
    When user clicks contact us from header
    Then user is navigated to contact us page
    And user is able to see name label 
    And user is able to see email label
    And user is able to see contact number label
    And user is able to see subject label
    And user is able to see message label
    And user is able to see send message button
    Then end of test cases
   
    
@tag2
  Scenario: Validate  fields in contact us page 
    Given browser is open
    When user is on nandamurisloution website
    When user clicks contact us from header
    Then user is navigated to contact us page
    And user is able to see name text field 
    And user is able to see email text field
    And user is able to see contact number text field
    And user is able to see subject text field
    And user is able to see message text field
    Then end of test cases
    
    #PASSED
    @tag3
  Scenario: Validate phone, location and email in contact us page
    Given browser is open
    When user is on nandamurisloution website
    When user clicks contact us from header
    Then user is navigated to contact us page
    And user is able to see the phone number
    And user is able to see Location 
    And user is able to see email address
    Then end of test cases
    
    @tag4
  Scenario: Validate google maps in contact us page
    Given browser is open
    When user is on nandamurisloution website
    When user clicks contact us from header
    Then user is navigated to contact us page
    And user is able see google maps iframe
    Then end of test cases
    
    
   #PASSED 
  @tag5
  Scenario: Validate social platform icons in the contact us page
    Given browser is open
    When user is on nandamurisloution website
    When user clicks contact us from header
    Then user is navigated to contact us page
    And user is able to see facebook icon in contact us page
    And user is able to see twitter icon in contact us page
    And user is able to see insta icon in contact us page
    And user is able to see linkedin icon in contact us page
    Then end of test cases
    
   
    