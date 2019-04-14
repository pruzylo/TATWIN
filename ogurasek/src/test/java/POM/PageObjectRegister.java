package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectRegister extends PageObject{

    public PageObjectRegister(WebDriver driver)
    {

        super(driver);
    }

    @FindBy(xpath = "//*[@class=\"logo\"]")
    public WebElement homeBtn;

    @FindBy(xpath = "//input[@class=\"egkVq\" and @data-test=\"input-email\"]")
    public WebElement userTxt;

    @FindBy(xpath = "//div[@class=\"_7jlJY _3xZ9L\"]/a[@title=\"Regulamin\"]")
    public WebElement regulaminBox;

    @FindBy(xpath = "//input[@class=\"egkVq\" and @data-test=\"input-password\"]")
    public WebElement passTxt;

    @FindBy(xpath = "//label[@class=\"_34dTT _1EX2X\"]/input[@class=\"_27a29\"]")
    public WebElement acceptTick;

    @FindBy(xpath = "//button[@class = '_1OR2h']")
    public WebElement registerBtn;

    public void registerData(String username, String password){
        userTxt.sendKeys(username);
        passTxt.sendKeys(password);
        //acceptTick.click();
        registerBtn.click();
    }

    public void RegulaminBoxClick(){
        regulaminBox.click();
    }


}
