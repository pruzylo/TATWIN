package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectHome extends PageObject {

    public PageObjectHome(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id = "keywords")
    public WebElement kluczField;

    @FindBy(id = "location")
    public WebElement miastoField;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(className = "onboarding-action")
    public WebElement okBtn;

    @FindBy(className = "onboarding-tooltip__close")
    public WebElement exiNotifBtn;

    @FindBy(xpath = "//a[@class='header__profil_cnt_log']")
    public WebElement loginBtn;

    @FindBy(className = "header__profil_cnt_btn")
    public WebElement registerBtn;

    @FindBy(xpath = "//h3[@class=\"board__section_title board__section_title--orange tab\"]")
    public WebElement superoferty;

    @FindBy(xpath = "//div[@class=\"tabs-content-tab\"]/p[@class=\"board__section_more\"]/a[1][@class=\"link link--dark\"]")
    public WebElement wiecej;


    public PageObjectLogin loginClick(){
        loginBtn.click();
        return new PageObjectLogin(driver);
    }

    public void superofertyClick(){
        superoferty.click();
        wiecej.click();
    }

    public void searchJob(String keyWord, String location){
        kluczField.sendKeys(keyWord);
        miastoField.sendKeys(location);
        searchBtn.click();
        okBtn.click();
        exiNotifBtn.click();
    }

}
