package com.June2021.StepDefinitions;

import com.June2021.BaseClass.DriverFactory;
import com.June2021.PageObject.IndividualProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualProductSearchSteps {

    IndividualProductSearch individualProductSearch = new IndividualProductSearch();

    @Given("user is on argos home page")
    public void user_is_on_argos_home_page() {
      individualProductSearch.getCurrentUrl();
    }

    @When("user is search nike product")
    public void user_is_search_nike_product() {
    individualProductSearch.doSearch("nike");
    }

    @Then("user should able to see all nike related products")
    public void user_should_able_to_see_all_nike_related_products() {
    individualProductSearch.nikeProductTitle();
    }

}
