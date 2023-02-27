import java.util.*;
class Program501c
{
static double area_of_a_right_angle_triangle(float base,float height)
{
return 0.5*base*height ;
}
public static void main(String args[])
{
float base,height;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the area of triangle:");
base=sc.nextFloat();
height=sc.nextFloat();
System.out.println("area of triangle:"+area_of_a_right_angle_triangle(base,height));
}
}