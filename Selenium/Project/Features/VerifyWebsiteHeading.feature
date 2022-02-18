Feature: Verify the website heading

  Scenario:  Read the heading of the website and verify the text
    Given User is on Google Home Page
    When User is navigate to URL
    And User Get the "Heading" of the website
    And User verifies "Heading" match exactly "Welcome to Alchemy Jobs"
    Then User close the browser

