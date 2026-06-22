import java.util.*;
class occur
{
public static void main(String ar[])
{
String a,b;
Scanner x =new Scanner(System.in);
System.out.println("Enter a String");
a=x.nextLine();
b=a.replace("P","Q");
System.out.println("Old String was :"+a);
System.out.println("New String is :"+b);
}
}