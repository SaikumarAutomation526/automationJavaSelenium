package Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilies {
	public WebDriver driver;
	public GenericUtilies(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void switchToOffersPage() throws InterruptedException {
		  Set<String> str=driver.getWindowHandles();
		   List<String> handel=new ArrayList<String>(str);
		   driver.switchTo().window(handel.get(1));
		   Thread.sleep(3000);
	}

}
