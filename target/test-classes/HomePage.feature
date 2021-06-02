Feature: Argos home page functionality

  @search
  Scenario: Argos home page functionality
    Given user is on argos home page
    When user is search nike product
    Then user should able to see all nike related products

  @select
  Scenario: argos account page functionality
    Given user is on argos home page
    When user is search nike product
    And user select the product by relevance high to low price range
    Then user should able to see all high to low price range product
