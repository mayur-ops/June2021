package com.June2021.PageObject;

import com.June2021.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NikeListProducts extends DriverFactory {

    @FindBy(css = ".ProductCardstyles__Title-gm8lcq-12.hkIdWm")
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

    @FindBy(css = "span[data-test=\"product-title\"]")
    WebElement selectedProduct;

    public void listAssertion(){
        String actualProduct = selectedProduct.getText();
        System.out.println(actualProduct);
        //Assert.assertEquals(actualProduct,"Nike Brasilia Small Black Holdall");
        Assert.assertThat(actualProduct, Matchers.containsString("Nike Brasilia Small Black Holdall"));
    }

}