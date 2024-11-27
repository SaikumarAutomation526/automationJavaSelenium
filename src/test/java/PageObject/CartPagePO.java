package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPagePO {
	public WebDriver driver;
	public CartPagePO( WebDriver driver){
		this.driver=driver;
	}
   
By place_Order=By.xpath("(//*[contains(text(),'Place Order')])");
By dropDown=By.tagName("select");
By check_Agre=By.xpath("(//input[@class='chkAgree'])");
By proceed =By.xpath("(//*[contains(text(),'Proceed')])");

public void clickOnPlaceOrder() throws InterruptedException {
	driver.findElement(place_Order).click();
	Thread.sleep(3000);
}
public void dropdown() {
	Select sc = new Select(driver.findElement(dropDown));
	sc.selectByValue("India");
	
}
public void clickOnTermsAndCon(){
driver.findElement(check_Agre).click();
}

public void clickOnProceed() {
	driver.findElement(proceed).click();
}


}
