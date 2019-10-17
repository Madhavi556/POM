package myPOMpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {

WebDriver driver;	
By username=By.name("userName");
By password=By.name("password");
By signin=By.name("login");
	


public LoginPagePOM(WebDriver driver)
{
	this.driver=driver;
}

public void enterusername(String UN){
	driver.findElement(username).sendKeys(UN);
}

public void enterpassword(String pwd){
	driver.findElement(password).sendKeys(pwd);
}

public void clicksignin()
{
	driver.findElement(signin).click();
}

}