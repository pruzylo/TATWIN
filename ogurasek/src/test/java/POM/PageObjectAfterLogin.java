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

    @FindBy(xpath = "//a[@data-test='userAccount']")
    public WebElement profileDropList;

    @FindBy(xpath = "//a[@data-shared-ga='menu##userMenu##cv']")
    public WebElement profileDropListDocuments;

    public void zawodowyClick(){
        zawodowy.click();
    }

    public PageObjectProfileSettings settingsClick(){
        settingsBtn.click();
        return new PageObjectProfileSettings(driver);
    }

    public PageObjectDocuments ProfileDropListDocumentsClick(){
        profileDropList.click();
        profileDropListDocuments.click();
        return new PageObjectDocuments(driver);
    }

}
