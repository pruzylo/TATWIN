package POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectCalcBasic extends PageObject{
    public PageObjectCalcBasic(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='calculator-salary']")
    private WebElement incomeInput;
    @FindBy(xpath = "//input[@id='main-calculator-button']")
    private WebElement countBtn;


    String url = "https://zarobki.pracuj.pl/kalkulator-wynagrodzen";


    public void AssertUrl() {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }

    public void CalculateIncome(String inc){
        incomeInput.sendKeys(inc);
        countBtn.click();
    }
}
