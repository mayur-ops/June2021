package com.June2021.PageObject;

import com.June2021.BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RelevanceSearch extends DriverFactory {

    @FindBy (id = "sort-select")
    WebElement relevanceOptions;

    public void relevance (){
        Select select = new Select(relevanceOptions);
        select.selectByVisibleText("Price: High - Low");

    }
    public void relevanceAssertion(){
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,"https://www.argos.co.uk/search/nike/opt/sort:price:desc/");
    }

}
