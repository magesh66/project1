package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//driver.get("https://demo.nopcommerce.com/");
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.navigate().to("https://demo.nopcommerce.com/");

driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.manage().window().maximize();

driver.navigate().back();
System.out.println("Backward  url :"+driver.getCurrentUrl());
driver.navigate().refresh();

driver.navigate().forward();
System.out.println("Forward url :"+driver.getCurrentUrl());
driver.navigate().refresh();

driver.close();


}
}
