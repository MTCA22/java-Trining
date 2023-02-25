import java.util.*;
class Program306f
{
static void displaymonth(int month_no)
{
String s= new String();
switch (month_no)
{
case 0:s="jan";break;
case 1:s="feb";break;
case 2:s="mar";break;
case 3:s="apr";break;
case 4:s="may";break;
case 5:s="june";break;
case 6:s="jul";break;
case 7:s="agu";break;
case 8:s="sep";break;
case 9:s="oct";break;
case 10:s="nov";break;
case 11:s="dec";break;
default:s="Invalid";
}
//switch
System.out.println("month is"+s);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month number(0-11):");
int month_no=sc.nextInt();
displaymonth(month_no);
}
}