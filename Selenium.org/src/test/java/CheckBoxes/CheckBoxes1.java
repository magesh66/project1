package CheckBoxes;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//SELECTING ALL THE CHECKBOXES
public class CheckBoxes1 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://testautomationpractice.blogspot.com/");

List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));//selecting all checkboxes

int length = Checkboxes.size();

//for SELECTING FIRST 2 CHECKBOXES
for (int i = 0; i < 2; i++) 
{
	Checkboxes.get(i).click();
}


//for each loop SELECTING ALL CHECKBOXES
/*for (WebElement Check : Checkboxes) 
{
	Check.click();
}*/


// FOR SELECTING LAST 3 CHECKBOXES
for (int i = 4; i < length; i++) 
{
	Checkboxes.get(i).click();
}

	
}
}

