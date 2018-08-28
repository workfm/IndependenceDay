package medibankBDDframework.website;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Transfer_Money.feature", format = { "pretty",
        "html:target/site/cucumber-pretty",
        "rerun:target/rerun.txt",
        "json:target/cucumber1.json" })

public class testrunner extends AbstractTestNGCucumberTests {
	
}