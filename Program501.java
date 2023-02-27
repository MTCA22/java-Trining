import java.util.*;
class Program501
{
static double area_of_a_triangle(int base,int height)
{
return 0.5*base*height ;
}
public static void main(String args[])
{
int base,height;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the area of triangle:");
base=sc.nextInt();
height=sc.nextInt();
System.out.println("area of triangle:"+area_of_a_triangle(base,height));
}
}