import java.util.*;
class scope_example4
{
public static void main(String args[])
{
System.out.println("this is example to understood/scope of variable");
int i;
i=100;
{
System.out.println("we are in new block");
int j;
j=i*i;
System.out.println("i and j in new block are "+i+"+j");
}
int k;
k=i+2;
int j;
j=k+500;
System.out.println("i and j out of the new block are"+j+""+j);
}
}