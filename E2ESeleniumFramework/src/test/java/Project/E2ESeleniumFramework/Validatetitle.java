package Project.E2ESeleniumFramework;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Jira.Jiraapi;
import pageobjects.Landingpage;
import resources.base;


public class Validatetitle extends base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	}
	@Jiraapi(Ticketlogging=true)
	@Test
	public void validatetitle() throws IOException{
driver=InitializeDriver();
		System.out.println("dodked");
		
		driver.get(url);
	Landingpage l=new Landingpage(driver);
	l.title().getText();
	Assert.assertEquals(l.title().getText(), "FEATURED COssURSES");
	
	}
	@AfterTest
	public void teardown(){
		driver.close();
	}
}