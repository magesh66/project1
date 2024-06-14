package Grouping;

import org.testng.annotations.Test;

public class Payment 
{

	@Test(priority=1,groups = {"Sanity","Regression","Functional"})
	void paymentRupees()
	{
	System.out.println("Payment Rupees ");	
	}

	@Test(priority=2,groups = {"Sanity","Regression","Functional"})
	void paymentDollars()
	{
	System.out.println("Payment Dollars ");	
	}
}
