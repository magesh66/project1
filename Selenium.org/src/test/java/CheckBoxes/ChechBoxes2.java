package CheckBoxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//SELECTING AND DESELECTING CHECKBOXES BASED ON CONDITION
public class ChechBoxes2 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://testautomationpractice.blogspot.com/");

List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));//selecting all checkboxes

int length = Checkboxes.size();

//Selecting only 3 Checkboxes
for (int i = 0; i < 3; i++) 
{
Checkboxes.get(i).click();	 
}

//Deselecting Checkboxes based on condition

Thread.sleep(5000);
for (int i = 0; i <length; i++) 
{
if(Checkboxes.get(i).isSelected())
{
Checkboxes.get(i).click();	
}
}


}
}
