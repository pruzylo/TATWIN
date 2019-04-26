package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectProfileSettingsAccount extends PageObject{

    public PageObjectProfileSettingsAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-test='manageAccountTab']")
    public WebElement accountTab;

    @FindBy(xpath = "//input[@data-test='newUserEmail']")
    public WebElement newEmaildTxt;

    @FindBy(xpath = "//input[@data-test='currentUserPassword']")
    public WebElement oldPasswordTxt;

    @FindBy(xpath = "//input[@data-test='newUserPassword']")
    public WebElement newPasswordTxt;

    @FindBy(xpath = "//button[@data-test='changeUserPasswordButton']")
    public WebElement changePasswordBtn;

    public void changePassword(String oldPassword, String newPassword){
        oldPasswordTxt.sendKeys(oldPassword);
        newPasswordTxt.sendKeys(newPassword);
        changePasswordBtn.click();
    }
}
