package POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectFavourite extends PageObject {
    public PageObjectFavourite(WebDriver driver) {
        super(driver);
    }

    String url = "https://www.pracuj.pl/apps/#/konto/zapisane-oferty";

    @FindBy(xpath = "//*[@data-test='removeSavedOfferBtn']")
    public WebElement removeFavBtn;

    public void AssertUrl(){
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    public void RemoveFavClick(){
        removeFavBtn.click();
    }




}
