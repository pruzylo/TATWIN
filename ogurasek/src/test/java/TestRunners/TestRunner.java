package TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


 @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src\\test\\java\\Feature\\Search_Text.feature"},
            glue = {"StepDefos"}
    )
 public class TestRunner {

}
