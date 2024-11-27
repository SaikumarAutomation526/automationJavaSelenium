package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// intializing the chromedriver once 
public class TestBase  {
	public WebDriver driver;
	
	public WebDriver webdriverManager() throws IOException{
		FileInputStream fl=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fl);
		String url=prop.getProperty("QAUrl");

		if(driver==null)
		{	
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
				driver.get(url);
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		 return driver;
	}

}
