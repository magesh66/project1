package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Alert Handling using Implicit wait
public class ImplictAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();

	//Implicit wait Decleration
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

	driver.findElement(By.xpath("//input[@value=\"Show alert box\"]")).click();

	Thread.sleep(5000);
	
	Alert alert = mywait.until(ExpectedConditions.alertIsPresent());
	
	System.out.println(alert.getText());
	
	alert.accept();
}}
