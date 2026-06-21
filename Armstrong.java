import java.util.*;
class Armstrong
{
public static void main(String arg[])
{
int x, s=0,z,i;
Scanner y = new Scanner(System.in);
System.out.println("Enter a number : ");
x=y.nextInt();
i=x;
while(i>0)
{
z=i%10;
s=s+(z*z*z);
i=(i/10);
}
if(x==s)
System.out.println(x + "is a Armstrong nummber");
else
System.out.println(x + "is not a Armstrong number");
}
}