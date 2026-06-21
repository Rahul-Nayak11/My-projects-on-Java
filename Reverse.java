import java.util.*;

class Reverse
{
public static void main(String arg[])
{
int x,y,r;
Scanner z =new Scanner(System.in);
System.out.println("Enter more than 1 digit number : ");

x = z.nextInt();
y=x;
x=0;
while(y!=0)
{
r = y%10;
x = x*10+r;
y = y/10;
}
System.out.println("Reverse = "+x);
}
}

