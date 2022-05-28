Feature: Actitime Login Functionality

  Scenario: Validate actitime login fuctionality using valide username and password
    Given User is already in actitime log in page
    When User Enter username
    And Enter password
    And click on login button
    Then Verify Actitime Homepage Opened or Not

  Scenario: Validate actitime login fuctionality using valid Credientials
    Given User is Already have valid URL for Actitime Login page "https://demo.actitime.com/login.do"
    When User Enters Username As "admin"
    And Enter password as "manager"
    And click on Login button
    Then Verify Actitime page As "Act-Time-Enter Time-Track"

  Scenario: Validate actitime login fuctionality using Invalid Credientials
    Given User is Already have valid URL for Actitime Login page "https://demo.actitime.com/login.do"
    When User Enters Username As "admin"
    And Enter password as "manager12345"
    And click on Login button
    Then Verify Actitime page As "Act-Time login"

  Scenario Outline: Validate actitime login fuctionality using <type> Credientials
    Given User is Already have valid URL for Actitime Login page <url>
    When User Enters Username As <username>
    And Enter password as <password>
    And click on Login button
    Then Verify Actitime page As < page Title>

    Examples: 
      | type  | url                                | username | password     | page Title                |
      | name1 | https://demo.actitime.com/login.do | admin    | manager      | Act-Time-Enter Time-Track |
      | name2 | https://demo.actitime.com/login.do | admin    | manager12345 | Act-Time login            |
