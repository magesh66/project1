import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch 
{
public static void main(String[] args) 
{
WebDriver driver =new EdgeDriver();	
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());

//driver.close();
}
}

 