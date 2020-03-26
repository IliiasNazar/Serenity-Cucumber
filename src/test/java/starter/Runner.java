package starter;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-report.json"},
        features = "src/test/resources/features",
        tags="@etsy",
        glue = "starter",
        monochrome = true

)
public class Runner {

}
