Feature: Performance of goggle search as per requirement

  Scenario: Search 'Selenium Base questions for interview'in goggle
    Given User is already on goggle search
    When User type 'selenium base questions for interview' on search field and enter
    Then User gets results with the title of 'selenium base questions for interview - Goggle Search '
    And Close the open browser

  Scenario Outline: Search <texttobesearch> in goggle search
    Given User is already on goggle search page
    When User types <tyexttobesearch> in search input field
    Then User will reached the search result page with the title <expectedtitile>
    And Close the browser

    Examples: 
      | texttobesearch | expectedtitile               |
      | Selenium 2.0   | Selenium 2.0 - Goggle Search |
      | Selenium 3.0   | Selenium 3.0 - Goggle Search |
