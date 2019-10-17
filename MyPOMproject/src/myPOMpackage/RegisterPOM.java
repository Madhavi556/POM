package myPOMpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM {
	
	WebDriver driver;
By firstname=By.name("firstName");




public RegisterPOM(WebDriver driver){
	this.driver=driver;
}

public void enterfirstname(String FN){
	driver.findElement(By.name("firstName"));
}
}