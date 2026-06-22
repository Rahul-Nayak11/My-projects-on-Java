import java.util.*;
class max
{
static void largest(int arr[])
{
int max = arr[0];
for(int i = 1; i<arr.length; i++)
{
if(max < arr[i])
{
max=arr[i];
}
}
System.out.println("largest element is :"+ max);
}
public static void main(String arg[])
{
int a[] = {2,3,4,5,6,8,1,13,12,18,19,11};
largest(a);
}
}