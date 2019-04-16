package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectAfterLogin extends PageObject{

    public PageObjectAfterLogin(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-test='userProfileTab']")
    public WebElement zawodowy;

    @FindBy(xpath = "//a[@data-test='settingsTab']")
    public WebElement settingsBtn;

    public void zawodowyClick(){
        zawodowy.click();
    }

    public PageObjectProfileSettings settingsClick(){
        settingsBtn.click();
        return new PageObjectProfileSettings(driver);
    }

}
