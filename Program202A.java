import java.util.*;
public class Program202A{
static boolean isEven(int n)
{
if (n%2==0)
{return true;}
else
{return false;}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enterthenumber");
n=sc.nextInt();
if(isEven(n))
System.out.println("Even\n");
else
System.out.println("odd\n");
}
}