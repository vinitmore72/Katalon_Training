import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Include/features",
        glue = {"stepdefinitions"},
        plugin = {
                "pretty",
                "html:Reports/cucumber-html-report",
                "json:Reports/cucumber.json"
        },
        monochrome = true
)
public class CucumberRunner{
}