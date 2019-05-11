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
    private WebElement kluczField;

    @FindBy(id = "location")
    private WebElement miastoField;

    @FindBy(id = "searchBtn")
    private WebElement searchBtn;

    @FindBy(className = "onboarding-action")
    private WebElement okBtn;

    @FindBy(className = "onboarding-tooltip__close")
    private WebElement exiNotifBtn;

    @FindBy(xpath = "//a[@class='header__profil_cnt_log']")
    private WebElement loginBtn;

    @FindBy(className = "header__profil_cnt_btn")
    private WebElement registerBtn;

    @FindBy(xpath = "//h3[@class=\"board__section_title board__section_title--orange tab\"]")
    private WebElement superoferty;

    @FindBy(xpath = "//div[@class=\"tabs-content-tab\"]/p[@class=\"board__section_more\"]/a[1][@class=\"link link--dark\"]")
    private WebElement wiecej;


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
