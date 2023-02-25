import java.util.*;
class Program306d
{
static void displayMonth(int Month_no)
{
String s= new String();
if(Month_no==0)s="Jan";
if(Month_no==1)s="Feb";
if(Month_no==2)s="Mar";
if(Month_no==3)s="Apr";
if(Month_no==4)s="May";
if(Month_no==5)s="June";
if(Month_no==6)s="July";
if(Month_no==7)s="Aug";
if(Month_no==8)s="Sep";
if(Month_no==9)s="Oct";
if(Month_no==10)s="Nov";
if(Month_no==11)s="Dec";
if(Month_no<0||Month_no>11)s="Invalid";
System.out.println("Month is"+s);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Month number(0-11):");
int Month_no=sc.nextInt();
displayMonth(Month_no);
}
}