package POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectCalcAdvance extends PageObject{

    public PageObjectCalcAdvance(WebDriver driver) {
        super(driver);
    }

    private String url = "https://zarobki.pracuj.pl/zaawansowany-kalkulator-wynagrodzen";

    @FindBy(xpath = "//a[contains(@href, '#advanceMandateContract')]")
    private WebElement mandateContractTab;

    @FindBy(xpath = "//input[@id='calc--mandate-contract-different-salary-main']")
    private WebElement mandateContractIncomeInput;

    @FindBy(xpath = "//input[@class='btn btn-secondary js-mandate-contract-calculator-button']")
    private WebElement mandateContractCountBtn;

    public void CalculateAdvancedMandateIncome(String inc) throws InterruptedException {
        mandateContractTab.click();
        Thread.sleep(1500);
        mandateContractIncomeInput.sendKeys(inc);
        mandateContractCountBtn.click();
    }

    public void AssertUrl(){
        Assert.assertEquals(url,driver.getCurrentUrl());
    }


}
