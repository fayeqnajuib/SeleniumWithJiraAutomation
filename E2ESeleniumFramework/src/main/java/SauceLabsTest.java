import java.net.MalformedURLException;

import java.net.URL;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLabsTest {

public static final String USERNAME = "fayeqnaj";

  public static final String ACCESS_KEY = "4284d675-faa6-4fef-9c43-b1a5c4b2ed2a";

  public static final String saURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub";
  static String sauceUserName = "fayeqnaj";
  static String sauceAccessKey = "4284d675-faa6-4fef-9c43-b1a5c4b2ed2a";


public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub



DesiredCapabilities caps = new DesiredCapabilities();


caps.setCapability("username", sauceUserName);

//set your sauce labs access key
caps.setCapability("accessKey", sauceAccessKey);

//set browser to Safari
caps.setCapability("browserName", "Chrome");

//set operating system to macOS version 10.13
caps.setCapability("platform", "Windows 10");

//set the browser version to 11.1
caps.setCapability("version", "90");



WebDriver  driver = new RemoteWebDriver(new URL(saURL), caps);

driver.get("http://google.com");

System.out.println(driver.getTitle());

}



}
