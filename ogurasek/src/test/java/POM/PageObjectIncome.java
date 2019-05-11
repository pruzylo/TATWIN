package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectIncome extends PageObject{
    public PageObjectIncome(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@href,'/kalkulator-wynagrodzen')]")
    private WebElement calculatorBasic;
    @FindBy(xpath = "//a[contains(@href,'/zaawansowany-kalkulator-wynagrodzen')]")
    private WebElement calculatorAdvance;

    public PageObjectCalcBasic CalculatorBasicClick(){
        calculatorBasic.click();
        return new PageObjectCalcBasic(driver);
    }

    public PageObjectCalcAdvance CalculatorAdvanceClick(){
        calculatorAdvance.click();
        return new PageObjectCalcAdvance(driver);
    }



}
