Feature: Verify the website second heading

  Scenario: Read the second heading of the website and verify the text
    Given User is on Google Home Page
    When User is navigate to URL
    And User Get the "Second Heading" of the website
    And User verifies "Second Heading" match exactly "Quia quis non"
    Then User close the browser

