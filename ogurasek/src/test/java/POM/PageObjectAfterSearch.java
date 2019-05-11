package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectAfterSearch  extends PageObject{
    public PageObjectAfterSearch(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@class=\"logo\"]")
    private WebElement homeBtn;

    @FindBy(xpath = "//button[@class=\"filters-item__trigger\"]")
    private WebElement filtrBtn;

    @FindBy(xpath = "//button[@class=\"category-item__label\" and @id=\"cc-5015\"]")
    private WebElement boxIt;

    @FindBy(xpath = "//*[@id=\"results\"]/ul/li[1]/div/div[2]/div[1]/div[2]/h3/a")
    private WebElement oferta;




    public void navigateHome(){
        homeBtn.click();
    }

    public void filtrBtnClick(){
        filtrBtn.click();
    }

    public void boxItClick(){
        boxIt.click();
    }

    public void ofertaClick(){
        oferta.click();
    }

}
