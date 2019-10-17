package MyseleniumTests;

import myPOMpackage.LoginPagePOM;
import myPOMpackage.RegisterPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@Test
	public void checklogin(){
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	LoginPagePOM login=new LoginPagePOM(driver);
	login.enterusername("rekha");
	login.enterpassword("rekha");
	login.clicksignin();
	
	RegisterPOM reg=new RegisterPOM(driver);
	reg.enterfirstname("Rekha");
}
}