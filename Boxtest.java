import java.util.*;
class Box
{
private double width;
private double height;
private double depth;
public Box()
{
width=height=depth=0.0;
}
public Box(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}
public void volume(){
System.out.println("volume="+(width*height*depth));
}
}
public class Boxtest
{
public static void main(String args[])
{
Box Mybox1=new Box();
Box Mybox2=new Box(25,50,100);
Mybox1.volume();
Mybox2.volume();
}
}