import java.util.*;
public class Program308a
{
public static void main(String[]args){
int a,b,c;
System.out.print("enter the numbers:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a<b&&a<c)
System.out.println("the smallest among the three numbers is "+a);
else if(b<a&&b<c)
System.out.println("the smallest among the three numbers is "+b);
else
System.out.println("the smallest among the three numbers is "+c);
}
}