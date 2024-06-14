package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown 
{
public static void main(String[] args) 
{
WebDriver driver =new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

driver.findElement(By.linkText("PIM")).click();

driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']")).click();
}
}
