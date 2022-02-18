Feature: Apply to a job

  Scenario: Search for a job and apply for it
    Given User is on Google Home Page
    When User is navigate to URL
    And User click on "Jobs"
    And User Get the "Second Page Title" of the website
    And User enter "Banking" in search job field
    And User click on "Search Jobs"
    And User click on "select job"
    And User click on "Apply for job"
    And User print the details on console
    Then User close the browser