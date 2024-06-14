package Alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//driver.get("https://the-internet.herokuapp.com/basic_auth");
//We use USERNAME and PASSWORD BEFORE LINK

driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

}
}
