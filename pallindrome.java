import java.util.*;
class pallindrome
{
public static void main(String ar[])
{
int x,s=0,z,i;
Scanner y = new Scanner(System.in);
System.out.println("Enter a number : ");
x = y.nextInt();
i=x;
while(i>0)
{
z=i%10;
s=(s*10)+z;
i=i/10;
}
if(x==s)
System.out.println(x + " is a pallindrome number");
else
System.out.println(x + " is not a pallindrome number");
}
}


