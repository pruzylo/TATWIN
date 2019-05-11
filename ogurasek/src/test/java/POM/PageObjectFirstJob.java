package POM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageObjectFirstJob extends PageObject{

    public PageObjectFirstJob(WebDriver driver) {
        super(driver);
    }



    private String url = "https://www.pracuj.pl/praca?et=3%2c1";



    public void AssertUrl(){
        Assert.assertEquals(url,driver.getCurrentUrl());
    }


}
