package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectLogin extends PageObject{
    public PageObjectLogin(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@title='Przejdź do strony głównej serwisu']")
    public WebElement homeBtn;

    @FindBy(xpath = "//input[@class='egkVq' and @data-test='input-email']")
    public WebElement userTxt;

    @FindBy(xpath = "//input[@class=\"egkVq\" and @data-test=\"input-password\"]")
    public WebElement passTxt;

    @FindBy(className = "_19V_Q")
    public WebElement loginSubmitBtn;

    @FindBy(xpath = "//*[@class=\"_1Ab5J\"]")
    public WebElement forgetBtn;

    @FindBy(xpath = "//button[@title='Pokaż hasło']")
    public WebElement hideBtn;


    public PageObjectAfterLogin loginUser(String username, String password) throws InterruptedException {
        userTxt.sendKeys(username);
        passTxt.sendKeys(password);
        loginSubmitBtn.click();
        Thread.sleep(1500);
        return new PageObjectAfterLogin(driver);
    }

    public void navigateHome(){
        homeBtn.click();
    }

    public void forgotPasswordBtnClick(){
        forgetBtn.click();
    }

    public void ukryjHaslo(){
        hideBtn.click();
    }
}
