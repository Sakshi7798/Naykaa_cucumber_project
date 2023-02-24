Feature: Search a product feature.
  Scenario:Verify that the user can be able to search a product.
    Given the user navigates to the home page.
    When the user enter the product name.
    Then the product results should be displayed.

  Scenario:Search using an invalid keyword
    Given the user on the Nykaa homepage
    When the user  type "&" into the search box
    Then the user should see a message

  Scenario: Search with partial input
    Given  the user on the Nykaa homepage
    When the user  type "masc" in the search bar.
    Then Verify that it Showing 2 of 2 results for masc
@smoke
    Scenario Outline: Search product with brand keywords
      Given the user on the Nykaa homepage
      When  the user search for  "<product brand name>" in the search bar.
      Then  results for"<result>"
      Examples:
        |product brand name          |result                                        |
        |Lakme  Lipstick             | Showing 20 of 31 results for Lakme Lipstick  |
        |Face primer                 | Showing 20 of 398 results for Face primer    |







