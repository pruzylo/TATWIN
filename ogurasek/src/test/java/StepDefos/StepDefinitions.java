package StepDefos;

import POM.*;
import Properties.Property;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import io.cucumber.messages.com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class StepDefinitions {

    WebDriver driver;
    WebDriverWait wait;
    public JavascriptExecutor js;

    public PageObjectHome pageHome;
    public PageObjectLogin pageLogin;
    public PageObjectAfterLogin pageAfterLogin;
    public PageObjectProfileSettings pageProfileSettings;
    public PageObjectProfileSettingsAccount pageProfileSettingsAccount;
    public PageObjectDocuments pageDocuments;
    public PageObjectOffers pageOffers;
    public PageObjectFavourite pageFavourite;
    public PageObjectIncome pageIncome;
    public PageObjectCalcBasic pageCalcBasic;
    public PageObjectCalcAdvance pageCalcAdvance;
    public PageObjectFirstJob pageFirstJob;


    @Before
    public void BeforeTest() {
        System.setProperty(Property.WebDriverName, Property.WebDriverPath);
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        pageHome = new PageObjectHome(driver);
        wait = new WebDriverWait(driver, 5);
        js = (JavascriptExecutor) driver;
    }

    @Given("^User opens pracuj\\.pl$")
    public void user_opens_pracuj_pl() throws Throwable {
        driver.get("http://pracuj.pl");
    }

    @When("^User logs in$")
    public void user_logs_in() throws Throwable {
        pageLogin = pageHome.loginClick();
        pageAfterLogin = pageLogin.loginUser(Property.username, Property.password);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onesignal-popover-cancel-button']"))).click();
        } catch (Exception e) {
            System.out.println("no popup occured");
        }
    }

    @When("^User moves to professional profile$")
    public void user_moves_to_professional_prifle() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(pageAfterLogin.zawodowy)).click();
    }

    @Then("^user is on professional profile page$")
    public void user_is_on_professional_profile_page() throws Throwable {
        Assert.assertEquals(driver.getCurrentUrl(), "https://profil.pracuj.pl/");
    }

    @Then("^page is closed$")
    public void page_is_closed() throws Throwable {
        Thread.sleep(1500);
        driver.quit();
    }

    @Then("^user is logged in$")
    public void user_is_logged_in() throws Throwable {

        Assert.assertEquals("https://www.pracuj.pl/apps/#/konto/rekomendowane-oferty", driver.getCurrentUrl());
    }

    @Then("^User moves to settings$")
    public void user_moves_to_settings() throws Throwable {
        pageProfileSettings = pageAfterLogin.settingsClick();
    }

    @Then("^User moves to profile settings$")
    public void user_moves_to_profile_settings() throws Throwable {
        pageProfileSettingsAccount = pageProfileSettings.accountTabClick();
    }

    @Then("^User changes password$")
    public void user_changes_password() throws Throwable {
        js.executeScript("arguments[0].scrollIntoView();", pageProfileSettingsAccount.oldPasswordTxt);
        pageProfileSettingsAccount.changePassword("oldPwd", "newPwd");
    }

    @Then("^User moves to documents")
    public void user_moves_to_documents() throws Throwable {
        pageDocuments = pageAfterLogin.ProfileDropListDocumentsClick();
        //pageDocuments = pageAfterLogin.SideMenuDocumentsClick();
    }

    @Then("^User is on Documents page")
    public void user_is_on_Documents_page() throws Throwable {
        Assert.assertEquals("https://www.pracuj.pl/apps/#/konto/cv-i-inne-dokumenty", driver.getCurrentUrl());
    }

    @Then("^User can delete document")
    public void user_can_delete_document() throws Throwable {
        pageDocuments.DeleteDocTry();
    }

    @When("^User moves to offers$")
    public void user_moves_to_offers() throws Throwable {
        pageOffers = pageAfterLogin.OffersClick();
    }

    @Then("^User is on Offers page$")
    public void user_is_on_Offers_page() throws Throwable {
        pageOffers.assertUrl();
    }

    @Then("^User can filter$")
    public void user_can_filter() throws Throwable {
        pageOffers.filterCategory();
        pageOffers.filterPosition();
    }

    @Then("^User can add offer to favourites")
    public void user_can_add_offer_to_favourites() throws Throwable {
        pageOffers.addToFav();
    }

    @When("^User moves to favourites$")
    public void user_moves_to_favourites() throws Throwable {
        pageFavourite = pageAfterLogin.ProfileDropListFavouriteClick();
    }

    @Then("^User is on Favourites page$")
    public void user_is_on_Favourites_page() throws Throwable {
        pageFavourite.AssertUrl();
    }

    @Then("^User can remove offer from favourites")
    public void user_can_remove_offer_from_favourites() throws Throwable {
        pageFavourite.RemoveFavClick();
    }

    @When("^User moves to Income page$")
    public void user_moves_to_Income_page() throws Throwable {
        pageIncome = pageAfterLogin.IncomeClick();
    }

    @When("^User moves to Calculator page$")
    public void user_moves_to_Calculator_page() throws Throwable {
        pageCalcBasic = pageIncome.CalculatorBasicClick();
    }

    @Then("^User is on Calculator page$")
    public void user_is_on_Calculator_page() throws Throwable {
        pageCalcBasic.AssertUrl();
    }

    @Then("^User can calculate basic income")
    public void user_can_calculate_basic_income() throws Throwable {
        pageCalcBasic.CalculateIncome("4000");
    }

    @When("^User moves to Calculator Advanced page$")
    public void user_moves_to_Calculator_Advanced_page() throws Throwable {
        pageCalcAdvance = pageIncome.CalculatorAdvanceClick();
        Thread.sleep(1500);
    }

    @Then("^User is on Calculator Advanced page$")
    public void user_is_on_Calculator_Advanced_page() throws Throwable {
        pageCalcAdvance.AssertUrl();

    }

    @Then("^User can calculate advanced income")
    public void user_can_calculate_advanced_income() throws Throwable {
        pageCalcAdvance.CalculateAdvancedMandateIncome("4000");
    }

    @When("^User moves to First Job page$")
    public void user_moves_to_First_Job_page() throws Throwable {
        pageFirstJob = pageAfterLogin.FirstJobClick();
        Thread.sleep(1500);
    }

    @Then("^User is on First Job page$")
    public void user_is_on_First_Job_page() throws Throwable {
        pageFirstJob.AssertUrl();
    }

    @Then("^User can find offer")
    public void user_can_find_offer() throws Throwable {
        pageOffers.SearchOffer("Automation tester", "Poznań");
    }
}


