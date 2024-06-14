package HandleBrowserWindwo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow1 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	driver.findElement(By.linkText("OrangeHRM, Inc")).click();

	Set<String> windowid = driver.getWindowHandles();

	for (String string : windowid) 
	{
		String title=driver.switchTo().window(string).getTitle();
		System.out.println(driver.getTitle());
		
		if(title.equals("OrangeHRM"))
		{
			driver.close();
		}
	}
}}
