package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Features",
		glue="stepdefinations",
		monochrome=true,
		tags=("@AddProductToCart or @SearchProduct"),
		plugin = {"html:target/cucumber.html","json:target/cucmber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	//parallel test 
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
