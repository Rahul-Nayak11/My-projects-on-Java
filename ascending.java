import java.util.*;
class ascending
{
public static void main(String[] args)
{
Scanner x = new Scanner(System.in);
int arr[] = new int[6];
int temp;
System.out.println("Enter 6 elements:");
for (int i = 0; i < arr.length; i++)
{
arr[i] = x.nextInt();
}
for (int i = 0; i < arr.length; i++)
{
for (int j = i + 1; j < arr.length; j++)
{
if (arr[i] > arr[j])
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
}
System.out.println("After sorting in Ascending order:");
for (int i = 0; i < arr.length; i++)
{
System.out.print(arr[i] + " ");
}
x.close();
}
}