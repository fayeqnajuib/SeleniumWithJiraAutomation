package Project.E2ESeleniumFramework;
import java.net.MalformedURLException;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Jira.Jiraapi;



public class SauceLabsTest {

public static final String USERNAME = "fayeqn";

  public static final String ACCESS_KEY = "6d48fd92-1846-46cc-a401-1c32aaf5aad1";

  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "ondemand.eu-central-1.saucelabs.com:443/wd/hub";
  static String sauceUserName = "fayeqn";
  static String sauceAccessKey = "6d48fd92-1846-46cc-a401-1c32aaf5aad1";
  @Jiraapi(Ticketlogging=true)
@Test
public  void saucetest() throws MalformedURLException {
	
// TODO Auto-generated method stub



DesiredCapabilities caps = new DesiredCapabilities();


caps.setCapability("username", sauceUserName);

//set your sauce labs access key
caps.setCapability("accessKey", sauceAccessKey);

//set browser to Safari
caps.setCapability("browserName", "Safari");

//set operating system to macOS version 10.13
caps.setCapability("platform", "macOS 10.13");

//set the browser version to 11.1
caps.setCapability("version", "11.1");



WebDriver  driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), caps);
driver.manage().window().maximize();


driver.get("https://www.amazon.com/");

System.out.println(driver.getTitle());
driver.get("http://google.com");
System.out.println(driver.getTitle());

}



}
