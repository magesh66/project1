package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver =new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

	driver.findElement(By.xpath("//input[@value=\"Show prompt box\"]")).click();

	Thread.sleep(5000);
    
	//Going to Alert
	Alert alert = driver.switchTo().alert();
	
	//Sending Text to Alert Box
    alert.sendKeys("Welcome");
    
    //Getting Text
    System.out.println(alert.getText());
    
    //accept or dismiss
    alert.accept();
    
	}}
