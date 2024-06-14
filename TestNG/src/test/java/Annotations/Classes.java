package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Classes 
{

	//@Beforeclass and @AfterClass
	/*
	1. login --------> Execute only once
	2. Search
	3. Advance Search
	4. logout--------> Execute only once
	*/
	@BeforeClass
	void login()
	{
		System.out.println("Login");
	}
	@AfterClass
	void logout ()
	{
		System.out.println("Logout");
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
