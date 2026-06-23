import java.util.*;
class integer
{
public static void main(String ar[])
{
int i,e;
int arr[] = new int[10];
Scanner x = new Scanner(System.in);
System.out.println("Enter 10 elements :");
for( i=0;i<arr.length;i++)
{
arr[i]=x.nextInt();
}
System.out.println("Entera number :");
e = x.nextInt();
for(i=0;  i<arr.length; i++)
if(arr[i]%2==0)
arr[i]=arr[i]+e;
else
arr[i]=arr[i]*e;
System.out.println("Updated Array :");
for(int o:arr)
{
System.out.println(o+" ");
}
}
}
