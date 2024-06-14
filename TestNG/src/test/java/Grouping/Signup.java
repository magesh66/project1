package Grouping;

import org.testng.annotations.Test;

public class Signup 
{
	@Test(priority=1,groups = {"Regression"})
	void singUpByEmail()
	{
	System.out.println("Email singUp ");	
	}

	@Test(priority=2,groups = {"Regression"})
	void singUpFaceBook()
	{
	System.out.println("FaceBook singUp ");	
	}

	@Test(priority=3,groups = {"Regression"})
	void singUpTiwtter()
	{
	System.out.println("Twitter singUp ");	
	}
}
