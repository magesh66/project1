package HandleBrowserWindwo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.findElement(By.linkText("OrangeHRM, Inc")).click();

Set<String> windowid = driver.getWindowHandles();

ArrayList<String> a=new ArrayList(windowid);
String parent = a.get(0);
String child=a.get(1);

driver.switchTo().window(parent);
System.out.println(driver.getCurrentUrl());
driver.close();
}
}
