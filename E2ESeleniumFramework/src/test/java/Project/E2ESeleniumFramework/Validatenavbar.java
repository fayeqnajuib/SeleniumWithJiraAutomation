package Project.E2ESeleniumFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Jira.Jiraapi;
import pageobjects.Landingpage;
import resources.base;


public class Validatenavbar extends base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	}
	@Jiraapi(Ticketlogging=true)
	@Test
	public void validatenavbar() throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	Landingpage l=new Landingpage(driver);

Assert.assertTrue(l.navbar().isDisplayed());
	}
	@AfterTest
	public void teardown(){
		driver.close();
	}
}