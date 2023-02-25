import java.util.*;
public class Program301b
{
static void checkPositiveNegative(int a)
{
if(a>0)
System.out.println("POSITIVE");
else
System.out.println("NEGATIVE");
}
public static void main(String args[]);
Scanner sc=new Scanner(System.in);
int num;
num=sc.nextInt();
checkPositiveNegative(num);
}