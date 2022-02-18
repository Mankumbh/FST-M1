Feature: Login into the website’s backend

  Scenario: Visit the site’s backend and login
    Given User is on Google Home Page
    When User is navigate to dashboard URL
    And User enter "root" in "Username" field
    And User enter "pa$$w0rd" in "Password" field
    And User click on "Log in"
    And User click on "Job Listing"
    And User click on "Add New"
    And User enter "Automation" in "Position" field
    Then User close the browser
