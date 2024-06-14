package DependsMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
@Test(priority=1)
void openApp()
{
Assert.assertTrue(true);	
}
@Test(priority=2,dependsOnMethods = { "openApp"})
void login()
{
Assert.assertTrue(true);	
}
@Test(priority=3,dependsOnMethods = {"openApp","login"})
void search()
{
Assert.assertTrue(true);	
}
@Test(priority=4,dependsOnMethods = {"openApp","login"})
void logout()
{
Assert.assertTrue(true);	
}

}
