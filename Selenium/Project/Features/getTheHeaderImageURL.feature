@SeleniumProject
Feature: Get the url of the header image

  Scenario:  Print the url of the header image to the console
    Given User is on Google Home Page
    When User is navigate to URL
    And User get the URL of Header image
    And User print the URL on console
    Then User close the browser