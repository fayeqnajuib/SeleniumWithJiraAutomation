package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	
	public WebDriver driver;
	
	private By email=By.id("user_email");
	private By password=By.id("user_password");
	private By loginbutton=By.xpath("//input[@value='Log In']");
	private By Forgotpassword=By.linkText("Forgot Password?");

public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
this.driver=driver;
}

public WebElement getemail() {
	
	return driver.findElement(email);
}

public WebElement getpassword() {
	
	return driver.findElement(password);
}
public WebElement getloginbutton() {
	
	return driver.findElement(loginbutton);
}
public ForgotPassword forgotpassword() {
	driver.findElement(Forgotpassword).click();
	return new ForgotPassword(driver);

}
}
