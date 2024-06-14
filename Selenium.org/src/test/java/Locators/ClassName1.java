package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName1 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();	
	//Group of webElements using class name
	List<WebElement> elements = driver.findElements(By.className("list-inline-item"));
	System.out.println(elements.size());
	
	// Group of Links using TagName
	List<WebElement> elements2 = driver.findElements(By.tagName("a"));
	System.out.println(elements2.size());
}
}
