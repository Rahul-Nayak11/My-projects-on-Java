import java.util.*;
class factorial
{
public static void main(String arg[])
{
int a,i,f=1;
long factorial = 1;
Scanner z = new Scanner(System.in);
System.out.println("enter a number to get factorial: ");

a = z.nextInt();
for(i=a;i>0;i--)
f = f*i;
System.out.println("factorial = "+f);
}
}