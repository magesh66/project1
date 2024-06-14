package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver()	;

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

//1.Select single option
driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();

//2.capture all the options and find out size
List<WebElement> option1 = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect\")]//label"));
int size = option1.size();
System.out.println(size);
for (WebElement webElement : option1) 
{
System.out.println(webElement.getText());	
}

//3.select multiple options
for (WebElement webElement1 : option1) 
{
webElement1.click();	
}

}
}
