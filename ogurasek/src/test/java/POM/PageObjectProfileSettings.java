package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectProfileSettings extends PageObject{

    public PageObjectProfileSettings(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@data-test='manageAccountTab']")
    private WebElement accountTab;



    public PageObjectProfileSettingsAccount accountTabClick(){
        accountTab.click();
        return new PageObjectProfileSettingsAccount(driver);
    }
}
