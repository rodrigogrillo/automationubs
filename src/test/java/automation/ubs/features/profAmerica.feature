Feature: Careers > Search Job > Professional Americas
    As a common user looking for a job
    I want to search the website
    To check the registered opportunities

  Background: Select the menu Professional Americas
    Given I select the menu Careers
    When I select the submenu Search jobs
    Then The website show the Careers interface
    When I select the option Americas > Professional
    Then the website show the job opportunities

  Scenario: Search for all jobs
    When I select the search option
    Then the website show me all opportunities

  Scenario: Search from Location
    Given I write the location "Brazil" on location field
    When I select the search option
    Then the website show me all opportunities

  Scenario: Search from opportunities
    Given I write the opportunitie "technology" on opportunitie field
    When I select the search option
    Then the website show me all opportunities

  Scenario: No match found
    Given I write the opportunitie "nomatchjob" on opportunitie field
    When I select the search option
    Then the website show me the message "There are no jobs that match your criteria"
