package WebDriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver =new ChromeDriver();

//To launch the brwser---------get()
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);


//Title of page-----------getTitle()
String title = driver.getTitle();
System.out.println(title);

//current url---getcurrenturl()
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

//Page source
//System.out.println(driver.getPageSource());

//Returns ID of single browser Window ----getWindowhandle();
String windowHandle = driver.getWindowHandle();
System.out.println("Window Id "+windowHandle);

//Returns Id of Multiple browser window-----getWindowHandles();
driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> windowHandles = driver.getWindowHandles();
System.out.println("WindowHandles "+windowHandles);
}
}
