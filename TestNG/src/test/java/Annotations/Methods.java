package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods 
{

	//@BeforeMethod and @AfterMethod Annotations
	
	/*1. Login
	2. Search
	3. Logout
	4. Login
	5. Advance search
	6. Logout*/
	
	@BeforeMethod
	void login()
	{
		System.out.println("Successfully Login");
	}
	
	@AfterMethod
	void Logout()
	{
		System.out.println("Sucessgully Logout");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=2)
	void AdvanceSearch()
	{
		System.out.println("Advance Search");
	}
}
