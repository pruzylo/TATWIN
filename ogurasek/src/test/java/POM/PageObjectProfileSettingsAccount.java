package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectProfileSettingsAccount extends PageObject{

    public PageObjectProfileSettingsAccount(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-test='manageAccountTab']")
    private WebElement accountTab;

    @FindBy(xpath = "//input[@data-test='newUserEmail']")
    private WebElement newEmaildTxt;

    @FindBy(xpath = "//input[@data-test='currentUserPassword']")
    public WebElement oldPasswordTxt;

    @FindBy(xpath = "//input[@data-test='newUserPassword']")
    private WebElement newPasswordTxt;

    @FindBy(xpath = "//button[@data-test='changeUserPasswordButton']")
    private WebElement changePasswordBtn;

    public void changePassword(String oldPassword, String newPassword){
        oldPasswordTxt.sendKeys(oldPassword);
        newPasswordTxt.sendKeys(newPassword);
        changePasswordBtn.click();
    }
}
