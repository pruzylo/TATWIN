package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectForgotPassword  extends PageObject{

    public PageObjectForgotPassword(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@class=\"egkVq\"]")
    private WebElement mailTxt;

    @FindBy(xpath = "//button[@class=\"_1x66a\"]")
    private WebElement sendBtn;

    @FindBy(xpath = "//*[@title='Przejdź do strony głównej serwisu']")
    private WebElement homeBtn;

    public void enterEmail(String email){
        mailTxt.sendKeys(email);
        sendBtn.click();
    }
}
