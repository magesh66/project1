package HandleBrowserWindwo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Window Handling Approach 1

public class WindowHandle1 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();	

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
System.out.println("Parent Title "+driver.getTitle());

driver.findElement(By.linkText("OrangeHRM, Inc")).click();

Set<String> Windowid = driver.getWindowHandles();//Getting Window ID
ArrayList<String> n=new ArrayList(Windowid);     //converting set to ArrayList
String parent = n.get(0);
String child = n.get(1);

Thread.sleep(5000);

driver.switchTo().window(parent);//Switching to parent
System.out.println("Parent Title "+driver.getTitle());

Thread.sleep(5000);

driver.switchTo().window(child);//Switching to child
System.out.println("Child Title "+driver.getTitle());

driver.quit();

}
}
