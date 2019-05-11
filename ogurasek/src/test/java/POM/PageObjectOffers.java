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
    private WebElement categoryFilter;

    @FindBy(xpath = "//*[contains(text(),'Bankowość')]")
    private WebElement categoryBank;

    @FindBy(xpath = "//*[@class='filters-footer__search-button']")
    private WebElement searchBtn;

    @FindBy(xpath = "//button[@data-test='position-filter-button']")
    private WebElement positionFilter;

    @FindBy(xpath = "//label[@class='employments-type-item__label' and @for='et-4']")
    private WebElement positionSpec;

    @FindBy(xpath = "//button[@class='offer-actions__favs-trigger']")
    private WebElement addToFavBtn;

    @FindBy(xpath = "//input[@class='keyword__field']")
    private WebElement keyWordInput;

    @FindBy(xpath = "//input[@class='workplace__field']")
    private WebElement locationInput;

    @FindBy(xpath = "//button[@class='form-send__element']")
    private WebElement searchOfferBtn;




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
