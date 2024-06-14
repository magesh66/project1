package POMPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	

	WebDriver driver;

	//Constructors
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
    WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;

	//Actions
	public void setUsername(String user)
	{
	txt_username.sendKeys(user);
	}

	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);

	}

	public void clickLogin()
	{
		btn_login.click();
	}


}
