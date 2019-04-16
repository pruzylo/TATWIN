package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectProfileSettings extends PageObject{

    public PageObjectProfileSettings(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-test='manageAccountTab']")
    public WebElement accountTab;

    @FindBy(xpath = "//input[@id='md-input-21']")
    public WebElement newEmaildTxt;

    @FindBy(xpath = "//input[@id='md-input-22']")
    public WebElement oldPasswordTxt;

    @FindBy(xpath = "//input[@id='md-input-23']")
    public WebElement newPasswordTxt;

    @FindBy(xpath = "//button[@data-test='changeUserPasswordButton']")
    public WebElement changePasswordBtn;

    public void changePassword(String oldPassword, String newPassword){
        oldPasswordTxt.sendKeys(oldPassword);
        newPasswordTxt.sendKeys(newPassword);
        changePasswordBtn.click();
    }
}
