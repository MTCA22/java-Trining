import java.util.*;
class Program306c
{
static void displayMonth(int Month_no)
{
String s= new String();
if(Month_no==0)s="Jan";
else if(Month_no==1)s="Feb";
else if(Month_no==2)s="Mar";
else if(Month_no==3)s="Apr";
else if(Month_no==4)s="May";
else if(Month_no==5)s="June";
else if(Month_no==6)s="July";
else if(Month_no==7)s="Aug";
else if(Month_no==8)s="Sep";
else if(Month_no==9)s="Oct";
else if(Month_no==10)s="Nov";
else if(Month_no==11)s="Dec";
else s="Invalid";
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