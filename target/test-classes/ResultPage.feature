Feature: Nike result page functionality

  @PriceRange
  Scenario: Nike result page price range functionality

    Given user is on argos nike product web page
    When user would like to select ten to fifteen pound price range product
    And user able to select one product out of all display ten to fifteen pound related products
    And user is able to add selected product in to trolley
    And user able to send product go to trolley
    Then user should able to see selected product in the basket for check out
