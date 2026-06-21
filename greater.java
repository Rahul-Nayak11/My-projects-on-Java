import java.util.*;
class greater
{
public static void main(String ar[])
{
int a,b,c,d;
Scanner x = new Scanner(System.in);
System.out.println("enter 3 numbers");
a = x.nextInt();
b = x.nextInt();
c = x.nextInt();
d = a;
if(b>d)
d=b;
if(c>d)
d=c;
System.out.println("Greater number is = "+d);
}
}