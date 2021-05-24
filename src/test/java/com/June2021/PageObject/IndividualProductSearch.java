package com.June2021.PageObject;

import com.June2021.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class IndividualProductSearch extends DriverFactory {

    public String getCurrentUrl(){
       String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertThat(currentUrl,Matchers.containsString("https://www.argos.co.uk/"));
        return currentUrl;
    }

    @FindBy(id = "searchTerm")
    WebElement searchTextBox;

    public void doSearch(String item){
        searchTextBox.sendKeys(item);
        searchTextBox.sendKeys(Keys.ENTER);
    }

    @FindBy(css = ".styles__SearchTerm-sc-1haccah-1.eslAyR")
    WebElement nikeProductPageTitle;

    public String nikeProductTitle(){
        String title = nikeProductPageTitle.getText();
        System.out.println(title);
        Assert.assertEquals(title,"nike");
        return title;
    }
}
