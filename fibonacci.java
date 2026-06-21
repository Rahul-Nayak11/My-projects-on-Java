import java.util.*;

class fibonacci 
{
public static void main(String arg[]) 
{
int a = 0, b = 1, fib, i;
Scanner sc = new Scanner(System.in);
System.out.print("Enter how many terms: ");
int n = sc.nextInt();
System.out.print(a + " " + b + " ");
for (i = 1; i <= n - 2; i++) 
{
fib = a + b;
System.out.print(fib + " ");
a = b;
b = fib;
}
sc.close();
}
}