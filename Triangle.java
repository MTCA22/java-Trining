import java.util.*;
class Triangle
{
static double calculateArea(double b,double h)
{
double temp;
temp=1.0/2.0*b*h;
return temp;
}
public static void main(String args[])
{
double base,height,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base:");
base=sc.nextDouble();
System.out.println("Enter the height:");
height=sc.nextDouble();
area=calculateArea(base,height);
System.out.println("area of a triangle with base"+base+"height"+height+"is"+area+"+squnits");
}
}