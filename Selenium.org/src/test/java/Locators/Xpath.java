package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
	//Xpath with multiple Attribute
	//driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("phone");
	
	//Xpath using Multiple  attribure
	//driver.findElement(By.xpath("//input[@name=\"search\"][@type=\"text\"]")).sendKeys("Mobile");
	
	//xpath using AND operator
	//driver.findElement(By.xpath("//input[@name=\"search\" and @type=\"text\"]")).sendKeys("Tablet");
	
	//xpath using OR operator
	//driver.findElement(By.xpath("//input[@name=\"search\" or @type=\"text\"]")).sendKeys("Tv");
	
	//Xpath with Inner Text
	//driver.findElement(By.xpath("//a[text()='Desktops']")).click();
	
	//boolean displayed = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	//System.out.println(displayed);
	
	//To capture the Text
	//String text = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
	//System.out.println(text);
	
	//Xpath with Contains()
	//driver.findElement(By.xpath("//input[contains(@placeholder,'earch')]")).sendKeys("Google");
	
	//Xpath with starts-with()
	//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Searc')]")).sendKeys("car");
	
	//Chained X-path
	boolean displayed1 = driver.findElement(By.xpath("//div[@id=\"logo\"]/a/img")).isDisplayed();
	System.out.println(displayed1);


}
}
