import java.util.*;
class perfect 
{
public static void main(String[] ar) 
{
int n,i,s = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
n = sc.nextInt();
for(i = 1; i < n; i++) 
{
if (n % i == 0)
{
s = s + i;
}
}
if (s == n) 
{
System.out.println("Perfect number");
} 
else 
{
System.out.println("Not a perfect number");
}
sc.close();
}
}