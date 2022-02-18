Feature: Apply to a job

  Scenario: Search for a job and apply for it
    Given User is on Google Home Page
    When User is navigate to URL
    And User click on "Post Job"
    And User enter "TestFSTProject123@gmail.com" in "Your email" field
    And User enter "Automation Testing" in "Job Title" field
    And User enter "Required Skill is Selenium, Cucumber, Jenkins" in "Description" field
    And User enter "TestFSTProject123@yahho.com" in "Application email" field
    And User enter "IBM" in "Company name" field
    And User click on "Preview"
    And User click on "Submit Listing"
    And User click on "Jobs"
    And User enter "Automation" in search job field
    And User click on "Search Jobs"
    Then User close the browser

#    or use below steps
#    And User fills below "Job Details"
#      | Field             | input                                       |
#      | Your email        | Testorojfstroj123@yahho.com                 |
#      | Job Title         | Automation Testing                          |
#      | Description       | Required Skill is Selenium,Cucumber,Jenkins |
#      | Application email | Testfstproj123@yahho.com                    |
#      | Company name      | IBM                                         |