package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown 
{
public static void main(String[] args) 
{
WebDriver driver =new ChromeDriver();	

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://testautomationpractice.blogspot.com/");

//Select
WebElement country = driver.findElement(By.xpath("//select[@id=\"country\"]"));

Select countries=new Select(country);

//operation on dropdown--->selectbyvisibletext
//countries.selectByVisibleText("France");
//select by value
//countries.selectByValue("canada");
//select by index
countries.selectByIndex(4);

//capture the option in dropdown
List<WebElement> options = countries.getOptions();
System.out.println("No of Dropdowns :"+options.size());
//printing the captured options
/*for (int i = 0; i < options.size(); i++) 
{
System.out.println( options.get(i).getText());	
}*/
for (WebElement webElement : options) 
{
System.out.println(webElement.getText());	
}
}


}

