package com.June2021.StepDefinitions;

import com.June2021.PageObject.RelevanceSearch;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RelevanceSearchSteps {

    RelevanceSearch relevanceSearch = new RelevanceSearch();

    @When("user select the product by relevance high to low price range")
    public void user_select_the_product_by_relevance_high_to_low_price_range() {
      relevanceSearch.relevance();
    }

    @Then("user should able to see all high to low price range product")
    public void user_should_able_to_see_all_high_to_low_price_range_product() {
    relevanceSearch.relevanceAssertion();
    }

}
