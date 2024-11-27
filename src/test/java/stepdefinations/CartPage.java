package stepdefinations;



import PageObject.CartPagePO;
import Utility.TestContestSetup;
import io.cucumber.java.en.Then;

public class CartPage {
	public TestContestSetup setup;
	public CartPagePO cartPagePo;
	public CartPage(TestContestSetup setup) {
		this.setup=setup;
		 cartPagePo=setup.pageObjectManager.getCartPagePO();
	}
	
    // CartPagePO cartPagePo=setup.pageObjectManager.getCartPagePO();

	@Then("click on place Order")
	public void click_on_place_order() throws InterruptedException {
		 //CartPagePO cartPagePo=setup.pageObjectManager.getCartPagePO();
	    cartPagePo.clickOnPlaceOrder();
	}
	@Then("choose country and terms of condition button")
	public void choose_country_and_terms_of_condition_button() {
		// CartPagePO cartPagePo=setup.pageObjectManager.getCartPagePO();
	  cartPagePo.dropdown();
	  cartPagePo.clickOnTermsAndCon();
	}
	@Then("Click on Proceed Button")
	public void click_on_proceed_button() {
		// CartPagePO cartPagePo=setup.pageObjectManager.getCartPagePO();
	  cartPagePo.clickOnProceed();
	}

}
