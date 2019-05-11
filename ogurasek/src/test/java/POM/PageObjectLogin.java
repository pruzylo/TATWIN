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
    private WebElement homeBtn;

    @FindBy(xpath = "//input[@class='egkVq' and @data-test='input-email']")
    private WebElement userTxt;

    @FindBy(xpath = "//input[@class=\"egkVq\" and @data-test=\"input-password\"]")
    private WebElement passTxt;

    @FindBy(className = "_19V_Q")
    private WebElement loginSubmitBtn;

    @FindBy(xpath = "//*[@class=\"_1Ab5J\"]")
    private WebElement forgetBtn;

    @FindBy(xpath = "//button[@title='Pokaż hasło']")
    private WebElement hideBtn;


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
