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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

    WebDriver driver;
    WebDriverWait wait;
    public PageObjectHome pageHome;
    public PageObjectLogin pageLogin;
    public PageObjectAfterLogin pageAfterLogin;

    String username = "test", password = "test";

    @Before
    public void BeforeTest() throws Throwable{
        System.setProperty(Property.WebDriverName, Property.WebDriverPath);
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        pageHome = new PageObjectHome(driver);
        wait = new WebDriverWait(driver, 5);
    }

    @After
    public void AfterTest() throws Throwable{
        driver.quit();
    }

    @Given("^User opens pracuj$")
    public void user_opens_pracuj() throws Throwable {
        driver.get("http://pracuj.pl");
        System.out.println("open page");

    }

    @When("^User clicks on login$")
    public void user_clicks_on_login() throws Throwable {
        pageLogin = pageHome.loginClick();
    }

    @When("^User provides credentials$")
    public void user_provides_credentials() throws Throwable {
        pageLogin.loginUser(username,password);
    }

    @When("^User clicks on login button")
    public void user_clicks_on_login_button() throws Throwable {
        Thread.sleep(2000);

    }

    @Then("^user is logged in$")
    public void user_is_logged_in() throws Throwable {
         {
             Verify.verify("https://www.pracuj.pl/apps/#/konto/rekomendowane-oferty" == driver.getCurrentUrl());}
        }

//2

    @Given("^User otwiera pracuj\\.pl i loguje się$")
    public void user_otwiera_pracuj_pl_i_loguje_się() throws Throwable {
        driver.get("https://www.pracuj.pl");
        pageLogin = pageHome.loginClick();
    }

    @When("^User sie loguje$")
    public void user_sie_loguje() throws Throwable {
         pageAfterLogin = pageLogin.loginUser(username,password);
    }

    @When("^User wchodzi w profil zawodowy$")
    public void user_wchodzi_w_profil_zawodowy() throws Throwable {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(pageAfterLogin.zawodowy)).click();
    }

    @Then("^profil zawodowy$")
    public void zamyka() throws Throwable {
        Assert.assertEquals(driver.getCurrentUrl(),"https://profil.pracuj.pl/");
        Thread.sleep(1500);
    }
}
