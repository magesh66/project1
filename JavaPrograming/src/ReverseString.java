
public class ReverseString 
{
public static void main(String[] args) 
{
String original ="Welcome";

String rev="";

System.out.println("Original String :"+original);

for (int i = 0; i <original.length(); i++) 
{
char ch = original.charAt(i);
rev=ch+rev;

}
System.out.println("Reverse String :"+rev);

if(original.equals(rev))
{
System.out.println("Palindrome");	
}
else
{
System.out.println("Not Palindrome");	
}
}

}
