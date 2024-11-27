package stepdefinations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.internal.junit.ArrayAsserts;

import PageObject.LandingPage;
import Utility.TestContestSetup;
import io.cucumber.java.en.*;

public class GreencartsHomeLandingPage {
	
	public LandingPage lg;
	public TestContestSetup setup;
	public GreencartsHomeLandingPage(TestContestSetup setup) {
		this.setup=setup;
	  lg=setup.pageObjectManager.getLandingPageObject();
	}
	
	//LandingPage lg=setup.pageObjectManager.getLandingPageObject();
	@Given("user is on greencart landpage")
	public void user_is_on_greencart_landpage() throws IOException {
	 setup.testbase.webdriverManager();
	}
	@When("user searched with {string} and extract actual name of product")
	public void user_searched_with_and_extract_actual_name_of_product(String string) throws InterruptedException {
		//LandingPage lg =setup.pageObjectManager.getLandingPageObject();
		lg.searchByItem(string);
		Thread.sleep(2000);
		//setup.driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(string);
	    setup.productName1=lg.getProductName().split("-")[0].trim();
	    System.out.println(setup.productName1);
		
	   
	}
	@When("Add number of {string} want to add")
	public void add_number_of_Kilograms_want_to_add(String string) {
		//LandingPage lg=setup.pageObjectManager.getLandingPageObject();
		lg.numberOfquantites(Integer.parseInt(string));
	    
	}
	@Then("click on AddToCart button")
	public void click_on_add_to_cart_button() {
		//LandingPage lg=setup.pageObjectManager.getLandingPageObject();
	lg.clickOnAddCartButton();
	}
	@Then("click on Cart image and click on proceed to checkout")
	public void click_on_cart_image_and_click_on_proceed_to_checkout() {
		//LandingPage lg=setup.pageObjectManager.getLandingPageObject();
     lg.clickOnCartImage();
     lg.procedToCheckOut();
	}
	
	@Then("Validate number of kilograms we are added")
	public void validate_number_of_kilograms_we_are_added() {
		String str=lg.quantity();
		String str1=lg.productName();
		System.out.println(str+" "+str1);
	}
	
	
	
	
}
