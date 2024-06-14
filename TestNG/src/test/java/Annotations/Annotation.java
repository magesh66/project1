package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation 
{

	@BeforeSuite
	void a1()
	{
		System.out.println("Before Suite");
	}

	@AfterSuite
	void a2()
	{
		System.out.println("After Suite");
	}

	@BeforeTest
	void c1()
	{
		System.out.println("Before Test");
	}

	@AfterTest
	void c2()
	{
		System.out.println("AfterTest");
	}

	@BeforeClass
	void b1()
	{
		System.out.println("Before Class");
	}

	@AfterClass
	void b2()
	{
		System.out.println("After Class");
	}

	@BeforeMethod
	void d1()
	{
		System.out.println("Before Method");
	}

	@AfterMethod
	void d2()
	{
		System.out.println("After Method");
	}
	
	@Test
	void run1()
	{
		System.out.println("Test 1");
	}
	/*@Test
	void run2()
	{
		System.out.println("Test 2");
	}*/
}
