
Feature: etsy search box test
  @etsy
  Scenario Outline: User should be able find the searched item

    Given user navigates to etsy home page
    And  user login on Etsy home page
    When user searches "<item>"
    Then user should be able to see the title "Cucumber | Etsy"

    Examples:
      | item            |
      | cucumber        |





