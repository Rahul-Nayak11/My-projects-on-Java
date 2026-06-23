import java.util.*;
class add
{
public int sum(int a[])
{
int sum=0;
for(int i=0;i<a.length;i++)
  sum=sum+a[i];
return sum;
}
public static void main(String ar[])
{
Scanner x = new Scanner(System.in);
int arr[] = new int[10];
System.out.println("Enter Array Elements :");
for(int i=0;i<10;i++)
{
arr[i]=x.nextInt();
}
add ob = new add();
int s = ob.sum(arr);
System.out.println("Sum = "+s);
x.close();
}
}