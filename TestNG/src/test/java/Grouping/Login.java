package Grouping;

import org.testng.annotations.Test;

public class Login 
{
@Test(priority=1,groups = {"Sanity"})
void loginByEmail()
{
System.out.println("Email Logged In");	
}

@Test(priority=2,groups = {"Sanity"})
void loginFaceBook()
{
System.out.println("FaceBook Logged In");	
}

@Test(priority=3,groups = {"Sanity"})
void loginTiwtter()
{
System.out.println("Twitter Logged In");	
}

}
