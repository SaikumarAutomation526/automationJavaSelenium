package Utility;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectManager;

public class TestContestSetup {
	public WebDriver driver;
	public String productName1;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtilies genericUtilies;
	public TestContestSetup() throws IOException {
		testbase=new TestBase();
		pageObjectManager =new PageObjectManager(testbase.webdriverManager());
		genericUtilies = new GenericUtilies(testbase.webdriverManager());
	}
	
}
