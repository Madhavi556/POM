package POMwithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void checklogin(){
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.manage().window().maximize();
	LoginPagefactory LoginPage=PageFactory.initElements(driver, LoginPagefactory.class);
	LoginPage.sendUserName("rekha");
	LoginPage.sendPassword("rekha");
	LoginPage.clickLoginBtn();
	
	driver.close();
	
	
	
}
}
