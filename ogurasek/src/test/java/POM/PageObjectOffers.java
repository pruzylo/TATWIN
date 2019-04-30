package POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectOffers extends PageObject {

    public PageObjectOffers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@data-test='category-filter-button']")
    public WebElement categoryFilter;

    @FindBy(xpath = "//*[contains(text(),'Bankowość')]")
    public WebElement categoryBank;

    @FindBy(xpath = "//*[@class='filters-footer__search-button']")
    public WebElement searchBtn;

    @FindBy(xpath = "//button[@data-test='position-filter-button']")
    public WebElement positionFilter;

    @FindBy(xpath = "//label[@class='employments-type-item__label' and @for='et-4']")
    public WebElement positionSpec;

    @FindBy(xpath = "//button[@class='offer-actions__favs-trigger']")
    public WebElement addToFavBtn;

    @FindBy(xpath = "//input[@class='keyword__field']")
    public WebElement keyWordInput;

    @FindBy(xpath = "//input[@class='workplace__field']")
    public WebElement locationInput;

    @FindBy(xpath = "//button[@class='form-send__element']")
    public WebElement searchOfferBtn;




    public void assertUrl(){
        Assert.assertEquals("https://www.pracuj.pl/praca", driver.getCurrentUrl());
    }

    public void filterCategory(){
        categoryFilter.click();
        categoryBank.click();
        searchBtn.click();
    }

    public void filterPosition(){
        positionFilter.click();
        positionSpec.click();
        searchBtn.click();
    }

    public void addToFav() {
        addToFavBtn.click();
    }

    public void SearchOffer(String position, String location){
        keyWordInput.sendKeys(position);
        locationInput.sendKeys(location);
        searchOfferBtn.click();
    }
}
