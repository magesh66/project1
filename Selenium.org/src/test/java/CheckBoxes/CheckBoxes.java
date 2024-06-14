package CheckBoxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//SELECTING SINGLE CHECK BOXES
public class CheckBoxes 
{
public static void main(String[] args) 
{
WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://testautomationpractice.blogspot.com/");

driver.findElement(By.id("sunday")).click();
}
}
