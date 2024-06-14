package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitMethods 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver =new ChromeDriver();

//ImplicitlyWait();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
//Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

////////////////////////////////////////////////////////

//ExplicitWait()
WebDriver driver1 =new ChromeDriver();

WebDriverWait myWait=new WebDriverWait(driver1, Duration.ofSeconds(10));//Decleration

driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver1.manage().window().maximize();

WebElement txtusername = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
txtusername.sendKeys("Admin");

////////////////////////////////////////////////////////////

//FluentWait()

WebDriver driver2 =new ChromeDriver();

//Decleration
Wait <WebDriver>myWait1=new FluentWait<WebDriver>(driver2)
     .withTimeout(Duration.ofSeconds(30))
     .pollingEvery(Duration.ofSeconds(5))
     .ignoring(NoSuchElementException.class);


driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver2.manage().window().maximize();



WebElement txtusername2=myWait1.until(new Function<WebDriver,WebElement>()
		{
	    public WebElement apply(WebDriver driver2)
	    {
	    return driver2.findElement(By.xpath("//input[@name=\"username\"]"));	
	    }
	
		});
txtusername2.sendKeys("Admin");







}
}
