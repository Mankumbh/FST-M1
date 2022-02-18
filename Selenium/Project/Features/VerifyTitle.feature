Feature: Verify the website title

  Scenario: Read the title of the website and verify the text
    Given User is on Google Home Page
    When User is navigate to URL
    And User Get the "title" of the website
    And User verifies "title" match exactly "Alchemy Jobs – Job Board Application"
    Then User close the browser