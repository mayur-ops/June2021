package com.June2021.PageObject;

import com.June2021.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PriceRange extends DriverFactory {

    public void currentUrl(){
       String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,"https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
    }

    @FindBy(css = ".Checkboxstyles__CheckboxOption-b61uwr-3.cKQGxN")
    List<WebElement> priceRanges;

    public void priceRangeList(){
    for (WebElement priceRange: priceRanges){
        System.out.println(priceRange.getText());
        if (priceRange.getText().contains("£10 - £15")){
            priceRange.click();
            break;
        }
    }
    }

    @FindBy(css = ".ProductCardstyles__Title-h52kot-12.PQnCV")
    List<WebElement> priceRangeProducts;

    public void priceRangeProductsList(){
        for(WebElement priceRangeProduct: priceRangeProducts){
            System.out.println(priceRangeProduct.getText());
            if (priceRangeProduct.getText().contains("Nike Men's Core Fitness Gloves - Large")){
                priceRangeProduct.click();
                break;
            }
        }
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[1]/section[2]/section/div[15]/div/div[2]/button")
    WebElement addToTrolley;

    public void addToTrolleyProduct(){
        addToTrolley.click();
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[3]/div[1]/section[2]/section/div[13]/div/div/div[1]/footer/div/div[2]/a")
    WebElement goToTrolley;
    public void goToTrolleyProduct(){
        goToTrolley.click();
    }

    @FindBy(xpath = "//*[@id=\"basket-content\"]/main/div[2]/section[1]/div[1]/ul/li/div/section/div/div[2]/div[2]/div/div[1]/p/a/span")
    WebElement basketProduct;

    public void basketProduct(){
       String actualProduct = basketProduct.getText();
       System.out.println(actualProduct);
       Assert.assertThat(actualProduct, Matchers.containsString("Nike Men's Core Fitness Gloves - Large"));
    }

    @FindBy(xpath = "//*[@id=\"basket-content\"]/main/div[2]/section[1]/div[1]/ul/li/div/section/div/div[2]/div[2]/div/div[3]/div/span")
    WebElement productPrice;

    public void priceAssertion(){
        String actualPrice = productPrice.getText();

        String priceWithoutPound = actualPrice.replace("£"," ");
        double priceInDouble = Double.parseDouble(priceWithoutPound);

        System.out.println(priceInDouble);
        Assert.assertThat(priceInDouble,Matchers.is(11.99));

    }

}
