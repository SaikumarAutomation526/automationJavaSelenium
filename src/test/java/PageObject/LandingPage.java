package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchByProductName=By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName1=By.xpath("//h4[@class='product-name']");
	By increment=By.xpath("(//a[@class='increment'])[1]");
	By addToCart=By.xpath("(//*[contains(text(),'ADD TO CART')])[1]");
	By carticon=By.xpath("(//*[@class='cart-icon']//img)");
	By proced_To_CheckOut=By.xpath("(//*[contains(text(),'PROCEED TO CHECKOUT')])");
	By orderProductName=By.xpath("(//*[@class='product-name'])");
	By numberOfKilosQuantity=By.xpath("(//*[@class='quantity'])");
	
	
	public void searchByItem(String string) {
		driver.findElement(searchByProductName).sendKeys(string);
	}
	
	public String getProductName() {
		return driver.findElement(productName1).getText();
	}
	public void numberOfquantites(int number) {
		
	for(int i=1;i<=number;i++) {
	driver.findElement(increment).click();
	}
	}
	
	public void clickOnAddCartButton() {
		driver.findElement(addToCart).click();
	}
	
	public void clickOnCartImage() {
		driver.findElement(carticon).click();
	}
	
	public void procedToCheckOut() {
		driver.findElement(proced_To_CheckOut).click();
	}
	
	public String productName() {
	return 	driver.findElement(orderProductName).getText();
	}
	
	public String quantity() {
		
		return driver.findElement(numberOfKilosQuantity).getText();
	}


}
