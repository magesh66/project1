package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

driver.findElement(By.xpath("//input[@value=\"Show confirm box\"]")).click();

Thread.sleep(5000);

Alert alert = driver.switchTo().alert();

System.out.println(alert.getText());

Thread.sleep(5000);

alert.accept();// or dismiss();


}
}
