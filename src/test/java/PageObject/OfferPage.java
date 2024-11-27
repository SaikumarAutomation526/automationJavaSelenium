package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
 public WebDriver driver;
 
	public OfferPage(WebDriver driver) {
	this.driver=driver;
	}
	By dealsPage=By.xpath("//a[contains(text(),'Top Deals')]");
	By searchProductName=By.xpath("//input[@id=\"search-field\"]");
	By productName=By.xpath("(//td[contains(text(),'Tomato')])");
	
	
	public void clickOnDealsPage() {
		driver.findElement(dealsPage).click();
	}
	
	public void searchProduct(String str) {
		driver.findElement(searchProductName).sendKeys(str);
	}
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}

}
