package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	public WebDriver driver;
	
	private By signin=By.linkText("Login");
	private By title=By.xpath("//*[@id=\"content\"]/div/div/h2");
   private By navbar=By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav");
    
public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
this.driver=driver;
}

public Loginpage login() {
	
	driver.findElement(signin).click();
	return new Loginpage(driver);
	}

public WebElement title() {
	
	return driver.findElement(title);
}
public WebElement navbar() {
	
	return driver.findElement(navbar);
}
}
