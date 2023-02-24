import java.util.*;
public class Difference
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,difference,product;
		System.out.println("enter a value:");
		a=sc.nextInt();
		System.out.println("enter b value:");
		b=sc.nextInt();
		difference=a-b;
		product=a*b;
		System.out.println("the difference between two numbers is:"+difference);
			System.out.println("the product of two numbers is:"+product);
if(a==b)
{
System.out.println("boat are equals");
}
else
System.out.println("boat are not equals");
			if(a>b)
		{
				System.out.println(a+" is larger than"+ b);
		}
		else
		{
			System.out.println(b+" is larger than"+ a);
		}
		if(a<b)
		{
			System.out.println(a+" is smaller than"+ b);
		}
		else
		{
			System.out.println(b+" is smaller than"+ a);
		}
}
}