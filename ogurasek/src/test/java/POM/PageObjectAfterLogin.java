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
    WebDriverWait wait  = new WebDriverWait(driver, 10);

    @FindBy(xpath = "//a[@data-test='userProfileTab']")
    private WebElement zawodowy;

    @FindBy(xpath = "//a[@data-test='settingsTab']")
    private WebElement settingsBtn;

    @FindBy(xpath = "//*[@data-test='userAccount']")
    private WebElement profileDropList;

    @FindBy(xpath = "//a[@data-shared-ga='menu##userMenu##cv']")
    private WebElement profileDropListDocuments;

    @FindBy(xpath = "//a[@data-shared-ga='menu##userMenu##ulubione']")
    private WebElement profileDropListFavourite;

    @FindBy(xpath = "//a[@data-test='myFilesTab']")
    private WebElement sideMenuDocuments;

    @FindBy(xpath = "//a[@data-shared-ga='menu##menu##oferty_pracy']")
    private WebElement offersTab;

    @FindBy(xpath = "//a[@data-shared-ga='menu##menu##zarobki']")
    private WebElement incomeTab;

    @FindBy(xpath = "//a[@data-shared-ga='menu##menu##student']")
    private WebElement firstJobTab;

    public void zawodowyClick(){
        zawodowy.click();
    }

    public PageObjectProfileSettings settingsClick(){
        settingsBtn.click();
        return new PageObjectProfileSettings(driver);
    }

    public PageObjectDocuments ProfileDropListDocumentsClick() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(profileDropList)).click();
        profileDropListDocuments.click();
        return new PageObjectDocuments(driver);
    }

    public PageObjectDocuments SideMenuDocumentsClick(){
        wait.until(ExpectedConditions.visibilityOf(sideMenuDocuments)).click();
        return new PageObjectDocuments(driver);
    }

    public PageObjectFavourite ProfileDropListFavouriteClick() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(profileDropList)).click();
        profileDropListFavourite.click();
        return new PageObjectFavourite(driver);
    }

    public PageObjectOffers OffersClick(){
        offersTab.click();
        return new PageObjectOffers(driver);
    }

    public PageObjectIncome IncomeClick(){
        incomeTab.click();
        return new PageObjectIncome(driver);
    }

    public PageObjectFirstJob FirstJobClick(){
        firstJobTab.click();
        return new PageObjectFirstJob(driver);
    }

}
