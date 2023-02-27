import java.util.*;
class Program501b
{
static double area_of_a_right_angle_triangle(double base,double height)
{
return 0.5*base*height ;
}
public static void main(String args[])
{
double base,height;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the area of triangle:");
base=sc.nextInt();
height=sc.nextInt();
System.out.println("area of triangle:"+area_of_a_right_angle_triangle(base,height));
}
}