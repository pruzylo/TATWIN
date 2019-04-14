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
    public WebElement mailTxt;

    @FindBy(xpath = "//button[@class=\"_1x66a\"]")
    public WebElement sendBtn;

    @FindBy(xpath = "//*[@title='Przejdź do strony głównej serwisu']")
    public WebElement homeBtn;

    public void enterEmail(String email){
        mailTxt.sendKeys(email);
        sendBtn.click();
    }
}
