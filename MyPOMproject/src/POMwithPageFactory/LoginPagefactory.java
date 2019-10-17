package POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagefactory {
WebDriver driver; 
	
	@FindBy(name="userName")
	WebElement username; 
	
	@FindBy(name="password")  //identify dynamically using library use how
	WebElement password;
	
	@FindBy(name="login")
	WebElement loginBtn; 

	public LoginPagefactory(WebDriver driver) {  //local driver from page factory
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String UN) {
		
		username.sendKeys(UN);
	}
	
	public void sendPassword(String pass) {
		password.sendKeys(pass); 
	}
	
	public void clickLoginBtn() {
		loginBtn.click(); 
	}
}
