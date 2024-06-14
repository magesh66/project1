package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Id 
{
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
boolean got=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
System.out.println(got);
}
}
