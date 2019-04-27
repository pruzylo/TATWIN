package POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageObjectFavourite extends PageObject {
    public PageObjectFavourite(WebDriver driver) {
        super(driver);
    }

    String url = "https://www.pracuj.pl/apps/#/konto/zapisane-oferty";

    public void AssertUrl(){
        Assert.assertEquals(url, driver.getCurrentUrl());
    }


}
