package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Activity4.feature"},
        glue = {"src/test/java/stepDefinations"},
        tags = "@activity4",
        // plugin = { "html:target/cucumber-reports/reports" },
        monochrome = true,
        plugin = {"pretty"}

)

public class TestRunner {
    //empty
}