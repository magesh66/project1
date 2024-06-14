
public class ReverseNumber 
{
public static void main(String[] args) 
{
	
int number=1234;

int reminder;

int reverse=0;

System.out.println("original number :"+number);
while(number!=0)
{
reminder=number%10;

reverse=reverse*10+reminder;

number=number/10;
}

System.out.println("Reverse number :"+reverse);

}
}
