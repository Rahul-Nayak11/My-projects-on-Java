import java.util.*;
class widget
{
public static int s(int arr[],int num)
int f=0,p;
{
for(int i=0, i<arr.length;i++)
{
if (arr[i] == num)
{
p=i;
f=1;
break;
}
if (f==0)
return-1;
else
return p;
}
public static void main(string ar[])
{
Scanner x = new Scanner(System.in);
int[] number =new int[10];
for(i=0;i<10;i++)
{
number[i] = x.nextInt();
}
widget ob = new widget();
System.out.println("enter number to search :");
int n = x.nextInt();
int p = ob.search(number,n);
if(p==-1)
System.out.println("Element not found");
else
System.out.println("Element found at" + i "no.index);
}
}