import java.util.*;
class Program306e
{
static void displayDay(int day_no)
{
String s= new String();
switch (day_no)
{
case 0:s="Sunday";break;
case 1:s="Monday";break;
case 2:s="Tuesday";break;
case 3:s="Wednesday";break;
case 4:s="Thursday";break;
case 5:s="Friday";break;
case 6:s="Saturday";break;
default:s="Invalid";
}
//switch
System.out.println("Day is"+s);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Day number(0-6):");
int day_no=sc.nextInt();
displayDay(day_no);
}
}