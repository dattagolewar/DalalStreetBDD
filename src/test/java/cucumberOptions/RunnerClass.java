package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(		features = "src/test/java/featureLayer",
		glue = "stepDefinations",
		dryRun = true
		
		)


public class RunnerClass extends AbstractTestNGCucumberTests{

}
