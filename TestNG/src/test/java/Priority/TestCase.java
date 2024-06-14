package Priority;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase 
{

	WebDriver driver;
	
@Test(priority=1)	
	
void open()
{
	driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
}

@Test(priority=2)
void testlogo() throws InterruptedException
{
Thread.sleep(3000);	
boolean status = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();	
System.out.println("Logo Displayed ="+status);
}

@Test(priority=3)
void login()
{
driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}


}