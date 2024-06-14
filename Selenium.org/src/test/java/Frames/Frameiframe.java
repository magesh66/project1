package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameiframe 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://ui.vision/demo/webtest/frames/");

	//Identifying frame3 using webelement
	WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));

	//Switching to Frame
	driver.switchTo().frame(frame3);

	//passing value in frame3 textbox
	driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Welcome");
//------------------>	
	//Frame3 inside Frame  ---------->iframe
	WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));

	driver.switchTo().frame(iframe);
	
	driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	
	
}}
