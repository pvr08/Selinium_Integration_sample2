
@tag
Feature: Feature to test google
  I want to use this template for my feature file

  @smokeTest
  Scenario: Validate google search
    Given browser is open
    And user is on google search
    And user enters a text in search box
    When hits enter
    And validate api
    Then End of the test
    

