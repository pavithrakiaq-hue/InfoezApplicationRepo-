package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Features",
		glue = {"StepDefinition","Hooks"},
		dryRun = false,
		plugin = {"pretty","html:target/CucumberReport.html"},
		monochrome= true,
		tags = "not @Signup"
)
public class RunnerClass{
}
