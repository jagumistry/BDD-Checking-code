package runner_files;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true,
		monochrome = true,
		features = {"src/test/resources"},
		glue = {"rediff"},
		plugin = {"pretty", "html:target/site/CucumberReport.html", "json:target/cucumber1/json"},
	    tags = "@Validatewihcorrectcredentials or @ValidateInboxPage"
	    )

public class Runner_JUNIT {
	

}
