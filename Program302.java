import java.util.*;
public class Program302{
static int isEven(int n)
{
return(n&1);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number:");
n=sc.nextInt();
if(isEven(n)==0)
System.out.print("even\n");
else
System.out.print("odd\n");
}
}