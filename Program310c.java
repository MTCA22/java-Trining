import java.util.*;
class Program310c
{
static double area_of_rectangle(double s)
{
return s*s;
}
public static void main(String args[])
{
double s;
Scanner sc=new Scanner(System.in);
System.out.print("Enter s:");
s=sc.nextInt();
System.out.print("area of the rectangle"+area_of_rectangle(s));
}
}