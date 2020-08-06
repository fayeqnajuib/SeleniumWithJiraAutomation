package Project.E2ESeleniumFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Jira.Jiraapi;
import pageobjects.ForgotPassword;
import pageobjects.Landingpage;
import pageobjects.Loginpage;
import resources.base;

public class Homepage extends base {
	public WebDriver driver;
	//public static Logger log=LogManager.getLogger(Homepage.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=InitializeDriver();
				
		
	}
	@Jiraapi(Ticketlogging=true)
	@Test(dataProvider="getdata")
	public void homepagel(String username,String Password,String text) throws IOException{
		driver.get(url);
	//	log.info("URL Opened");
	Landingpage l=new Landingpage(driver);
	Loginpage l2=l.login();
	
l2.getemail().sendKeys(username);
l2.getpassword().sendKeys(Password);
//log.info(text);
l2.getloginbutton().click();
ForgotPassword fp=l2.forgotpassword();
fp.getEmail().sendKeys("abcd");
fp.sendMeInstructions().click();
	
	}
	@AfterTest
	public void teardown(){
		driver.close();
	}
@DataProvider()
public Object[][] getdata() {
	Object[][] d=new Object[2][3];
	d[0][0]="abcd@gmail.com";
	d[0][1]="def";
	d[0][2]="Restricted user";
	
d[1][0]="hhh@gmail.com";
	d[1][1]="jjwjw";
	d[1][2]="Non Restricted user";
return d;
}
}
