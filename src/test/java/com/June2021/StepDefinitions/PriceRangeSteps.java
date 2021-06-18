package com.June2021.StepDefinitions;

import com.June2021.PageObject.PriceRange;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceRangeSteps {

    PriceRange priceRange = new PriceRange();

    @Given("user is on argos nike product web page")
    public void user_is_on_argos_nike_product_web_page() {
    priceRange.currentUrl();
    }
    @When("user would like to select ten to fifteen pound price range product")
    public void user_would_like_to_select_ten_to_fifteen_pound_price_range_product() {
    priceRange.priceRangeList();
    }

    @When("user able to select one product out of all display ten to fifteen pound related products")
    public void user_able_to_select_one_product_out_of_all_display_ten_to_fifteen_pound_related_products() {
    priceRange.priceRangeProductsList();
    }
    @When("user is able to add selected product in to trolley")
    public void user_is_able_to_add_selected_product_in_to_trolley() {
    priceRange.addToTrolleyProduct();
    }
    @When("user able to send product go to trolley")
    public void user_able_to_send_product_go_to_trolley() {
    priceRange.goToTrolleyProduct();
    }
    @Then("user should able to see selected product in the basket for check out")
    public void user_should_able_to_see_selected_product_in_the_basket_for_check_out() {
    priceRange.basketProduct();
    priceRange.priceAssertion();
    }

}
