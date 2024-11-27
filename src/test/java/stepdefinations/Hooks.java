package stepdefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.TestContestSetup;
import io.cucumber.java.*;

public class Hooks {
	TestContestSetup setup;
	public Hooks(TestContestSetup setup) throws IOException {
		this.setup=setup;
	}
	@After
	public void close() throws IOException {
		setup.testbase.webdriverManager().quit();
		
	}
   @AfterStep
   public void screenShot(Scenario scenario) throws IOException {
	   WebDriver driver=setup.testbase.webdriverManager();
	   if(scenario.isFailed()) {
		  File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 byte[] fileContent= FileUtils.readFileToByteArray(sourcePath);
		  scenario.attach(fileContent, "image/png", "image");
	
	   }
   }
}
