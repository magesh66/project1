package Parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parellel 
{

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	void openBrowser(String br) throws InterruptedException
	{
		switch (br) {
		case "chrome":driver=new ChromeDriver();

		break;
		case "edge":driver=new EdgeDriver();
		break;

		default:System.out.println("Invalid Browser");return;

		}

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	void testLogo()
	{
		boolean displayed = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();	
		Assert.assertEquals(displayed,true);
	}

	@Test
	void testTitle()
	{
		String title = driver.getTitle();	
		Assert.assertEquals(title, "OrangeHRM");
	}


	@Test
	void testUrl()
	{
		String currentUrl = driver.getCurrentUrl();	
		Assert.assertEquals(currentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
