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

public static final String USERNAME = "fayeqnaj";

  public static final String ACCESS_KEY = "4284d675-faa6-4fef-9c43-b1a5c4b2ed2a";

  public static final String sURL = "https://" + USERNAME + ":" + ACCESS_KEY +"@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub";
  static String sauceUserName = "fayeqnaj";
  static String sauceAccessKey = "4284d675-faa6-4fef-9c43-b1a5c4b2ed2a";
  @Jiraapi(Ticketlogging=true)
@Test
public  void saucetest() throws MalformedURLException {
	
// TODO Auto-generated method stub



DesiredCapabilities caps = new DesiredCapabilities();


caps.setCapability("username", sauceUserName);
caps.setCapability("name", "Web Driver demo Test");
//set your sauce labs access key
caps.setCapability("accessKey", sauceAccessKey);

//set browser to Safari
caps.setCapability("browserName", "Chrome");

//set operating system to macOS version 10.13
caps.setCapability("platform", "Windows 10");

//set the browser version to 11.1
caps.setCapability("version", "90");

URL url = new URL(sURL);

WebDriver  driver = new RemoteWebDriver(url, caps);
driver.manage().window().maximize();


driver.get("https://www.amazon.com/");

System.out.println(driver.getTitle());
driver.get("http://google.com");
System.out.println(driver.getTitle());

}



}
