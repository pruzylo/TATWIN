package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class PageObjectAfterLogin extends PageObject{

    public PageObjectAfterLogin(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait  = new WebDriverWait(driver, 5);
    Actions a = new Actions(driver);
    @FindBy(xpath = "//a[@data-test='userProfileTab']")
    public WebElement zawodowy;

    @FindBy(xpath = "//a[@data-test='settingsTab']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//span[@data-test='userAccount']")
    public WebElement profileDropList;

    @FindBy(xpath = "//a[@data-shared-ga='menu##userMenu##cv']")
    public WebElement profileDropListDocuments;

    @FindBy(xpath = "//a[@data-test='myFilesTab']")
    public WebElement sideMenuDocuments;

    public void zawodowyClick(){
        zawodowy.click();
    }

    public PageObjectProfileSettings settingsClick(){
        settingsBtn.click();
        return new PageObjectProfileSettings(driver);
    }

    public PageObjectDocuments ProfileDropListDocumentsClick(){
        wait.until(ExpectedConditions.visibilityOf(profileDropList)).click();
        profileDropListDocuments.click();
        return new PageObjectDocuments(driver);
    }

    public PageObjectDocuments SideMenuDocumentsClick(){
        wait.until(ExpectedConditions.visibilityOf(sideMenuDocuments)).click();
        return new PageObjectDocuments(driver);
    }

}
