@SeleniumProject
Feature: Navigate to another page

  @Test
  Scenario: Navigate to the Jobs page on the site.
    Given User is on Google Home Page
    When User is navigate to URL
    And User click on "Jobs"
    And User Get the "Second Page Title" of the website
    And User verifies "Second Page Title" match exactly "Jobs – Alchemy Jobs"
#    And User verifies "title" match exactly "Alchemy Jobs – Job Board Application"
    Then User close the browser