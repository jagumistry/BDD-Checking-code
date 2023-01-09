package runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = true,
		monochrome = true,
		features = {"src/test/resources"},
		glue = {"rediff"},
		plugin = {"pretty", "html:target/site/CucumberReport.html", "json:target/cucumber1/json"},
	    tags = "@Validatewihcorrectcredentials or @ValidateInboxPage"
	    )


public class Runner_TestNG extends AbstractTestNGCucumberTests {

}
