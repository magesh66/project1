package Priority;

import org.testng.annotations.Test;

public class Priority 
{
@Test(priority=1)

void test1()
{
System.out.println("Test 1");	
}
@Test(priority=2)
void test2()
{
	System.out.println("Test 2");
}
@Test(priority=3)
void test3()
{
	System.out.println("Test 3");
}
}
