package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver =new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register");
driver.manage().window().maximize();

//Isdisplaced()
WebElement Logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

System.out.println(Logo.isDisplayed());


//or
boolean displayed = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
System.out.println("Display Status :"+displayed);

/////////////////////////////////////////////////////////

//isEnabled()
boolean enabled = driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).isEnabled();
System.out.println("Enable Status :"+enabled);

////////////////////////////////////////////////////////

//isSelected()
WebElement Male = driver.findElement(By.xpath("//input[@value=\"M\"]"));
System.out.println("Male Status Before :"+Male.isSelected());
Male.click();
System.out.println("Male Status After :"+Male.isSelected());
}
}
