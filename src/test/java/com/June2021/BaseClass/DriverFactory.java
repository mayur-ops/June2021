package com.June2021.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        //driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.manage().window().maximize();
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    public void closedBrowser(){
        driver.quit();
    }

}
