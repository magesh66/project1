package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Today's Deals")).click();
	//TagName for no of links
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	System.out.println(elements.size());
	
	//tagname total no of images
	List<WebElement> elements2 = driver.findElements(By.tagName("img"));
	System.out.println(elements2.size());
	

}
}
