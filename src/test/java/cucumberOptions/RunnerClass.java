package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(		features = "src/test/java/featureLayer/LoginFeature.feature"
		,glue = "stepDefinations" 
    // ,dryRun = true
		,monochrome = true
		,plugin = {"pretty","html:target/cucumberReport.html","json:target/cucumberreport.json"}
		)


public class RunnerClass extends AbstractTestNGCucumberTests{

}
