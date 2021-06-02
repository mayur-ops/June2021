package com.June2021.StepDefinitions;

import com.June2021.PageObject.NikeListProducts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NikeListProductsSteps {

    NikeListProducts nikeListProducts = new NikeListProducts();

    @When("user select one product out of nike list of products")
    public void user_select_one_product_out_of_nike_list_of_products() {
    nikeListProducts.nikeProductList();
    }


    @Then("user able to add selected product in basket")
    public void user_able_to_add_selected_product_in_basket() {
    nikeListProducts.listAssertion();
    }


}
