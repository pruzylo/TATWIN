package TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


 @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src\\test\\java\\Feature\\PracujPl.feature"},
            glue = {"StepDefos"},
            tags = {"@Test8A"}
    )
 public class TestRunner {

}
