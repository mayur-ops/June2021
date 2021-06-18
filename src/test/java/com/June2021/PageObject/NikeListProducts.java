package com.June2021.PageObject;

import com.June2021.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NikeListProducts extends DriverFactory {

    @FindBy(css = ".ProductCardstyles__Title-h52kot-12.PQnCV")
    List<WebElement> nikeProducts;

    public void nikeProductList() {
        for (WebElement nikeProduct : nikeProducts) {
            System.out.println(nikeProduct.getText());
            if (nikeProduct.getText().contains("Nike Brasilia Small Black Holdall")) {
                nikeProduct.click();
                break;
            }
        }
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[1]/section[1]/div[1]/h1/span[1]")
    WebElement selectedProduct;

    public void listAssertion(){
        String actualProduct = selectedProduct.getText();
        System.out.println(actualProduct);
        //Assert.assertEquals(actualProduct,"Nike Brasilia Small Black Holdall");
        Assert.assertThat(actualProduct, Matchers.containsString("Nike Brasilia Small Black Holdall"));
    }

}