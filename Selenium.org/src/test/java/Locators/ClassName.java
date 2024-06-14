package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassName 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.className("nav-link"));
Thread.sleep(2000);
element.click();

}
}
