package POM;

import gherkin.deps.com.google.gson.annotations.Until;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class PageObjectDocuments extends PageObject {
    public PageObjectDocuments(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@data-test='deleteFileBtn']")
    public WebElement deleteDocBtn;

    @FindBy(xpath = "//button[@data-test='CancelBtn']")
    public WebElement cancelDeletionBtn;

    public void DeleteDocTry(){
        deleteDocBtn.click();
        Assert.assertTrue(cancelDeletionBtn.isDisplayed());
        cancelDeletionBtn.click();
    }

}

