import java.util.*;
class uppercase
{
public static void main(String ar[])
{
String s1,s2;
Scanner x = new Scanner(System.in);
System.out.println("enter first String :");
s1 = x.nextLine();
System.out.println("enter second String :");
s2 = x.nextLine();

int len1 = s1.length();
int len2 = s2.length();

if(len1 > len2)
System.out.println("largest string ="+s1);
else
System.out.println("Largest string ="+s2);
}
}