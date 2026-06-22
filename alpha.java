import java.util.*;
class alpha 
{
public static void main(String ar[]) 
{
String a, b;
Scanner x = new Scanner(System.in);     
System.out.println("Enter a String: ");
a = x.nextLine();
char[] chars = a.toCharArray();
Arrays.sort(chars);
b = new String(chars);      
System.out.println("Old String was: " + a);
System.out.println("Alphabetical order is: " + b);
}
}
