package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

driver.findElement(By.xpath("//input[@value=\"Show alert box\"]")).click();

Thread.sleep(5000);

//Going to Alert Window
Alert text = driver.switchTo().alert();

//Getting Text in Alert Window
String text2 = text.getText();

System.out.println(text2);

//Click ok on the Alert Windwo
text.accept();
}
}
