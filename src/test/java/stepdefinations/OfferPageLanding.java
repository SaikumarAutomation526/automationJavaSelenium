package stepdefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObject.OfferPage;
import Utility.TestContestSetup;
import io.cucumber.java.en.Then;

public class OfferPageLanding {
	 String productName2="";
	 TestContestSetup setup;
	 public OfferPageLanding(TestContestSetup setup) {
		this.setup=setup;
	}
	
	@Then("User searched for same short name of {string} in offers page if product exist")
	public void user_searched_for_same_short_name_of_in_offers_page_if_product_exist(String string) throws InterruptedException {
	 OfferPage op=setup.pageObjectManager.getOfferPageObject();
	 op.clickOnDealsPage();
	  setup.genericUtilies.switchToOffersPage();
	  op.searchProduct(string);
	   Thread.sleep(3000);
	   productName2=op.getProductName().trim();
	   System.out.println(productName2);
	   Assert.assertEquals(setup.productName1, productName2);
	}
	


}
