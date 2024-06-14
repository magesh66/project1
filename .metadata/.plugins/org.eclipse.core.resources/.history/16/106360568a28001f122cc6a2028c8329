package POMClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{

	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	void testlogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
}
