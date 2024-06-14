package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//FRAME USING WEBELEMENT
public class Frame 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://ui.vision/demo/webtest/frames/");

//Identifying frame1 using webelement
WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));

//Switching to Frame
driver.switchTo().frame(frame1);

//passing value in frame1 textbox
driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Welcome");

//go back to page or driver
driver.switchTo().defaultContent();

///////////////////////////////////////////////////////////

//Frame 2

WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));

//switch to frame
driver.switchTo().frame(frame2);

//passing value in frame2 textbox
driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("India");

//go back to page
driver.switchTo().defaultContent();



}
}
