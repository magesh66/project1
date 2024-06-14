package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class0 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//driver.get("https://www.scientecheasy.com/2019/08/xpath-axes.html/");

driver.get("https://money.rediff.com/gainers/bse/monthly/groupall");

//SELF
String text = driver.findElement(By.xpath("//a[normalize-space()='Ambo Agritec']/self::a")).getText();

System.out.println(text);

//PARENT
String text2 = driver.findElement(By.xpath("//a[normalize-space()='Ambo Agritec']/parent::td")).getText();
System.out.println(text2);

//ANCESTOR
String text3 = driver.findElement(By.xpath("//a[normalize-space()='Ambo Agritec']/ancestor::tr")).getText();
System.out.println(text3);

}}
