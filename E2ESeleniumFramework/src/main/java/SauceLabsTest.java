import java.net.MalformedURLException;

import java.net.URL;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;



public class SauceLabsTest {

public static final String USERNAME = "fayeqn";

  public static final String ACCESS_KEY = "6d48fd92-1846-46cc-a401-1c32aaf5aad1";

  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "ondemand.eu-central-1.saucelabs.com:443/wd/hub";
  static String sauceUserName = "fayeqn";
  static String sauceAccessKey = "6d48fd92-1846-46cc-a401-1c32aaf5aad1";


public static void main(String[] args) throws MalformedURLException {

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

driver.get("http://google.com");

System.out.println(driver.getTitle());

}



}
