import java.util.Scanner;
class else_example1
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter the two number:");
i=sc.nextInt();
j=sc.nextInt();
if(j==0)
{
System.out.println("Division By Error");
}
else
{
System.out.println(i+"Divided by"+j+"is"+(i/j));
}
}
}