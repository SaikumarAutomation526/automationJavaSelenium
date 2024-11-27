package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public WebDriver driver;
	public OfferPage offerPage;
	public CartPagePO cartpagePo;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPageObject() {
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	public OfferPage getOfferPageObject() {
		offerPage=new OfferPage(driver);
		return offerPage;
	}
	public CartPagePO getCartPagePO() {
		cartpagePo =new CartPagePO(driver);
		return cartpagePo;
	}
	
	

}
