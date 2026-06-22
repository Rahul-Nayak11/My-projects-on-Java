import java.util.*;
class copy_array
{
public static void main(String ar[])
{
char[] copyFrom =
{'d','e','c','a','f','f','e','i','n','a'};

char[] copyTo = new char[7];
System.arraycopy(copyFrom, 2, copyTo, 0,7);
System.out.println(String.valueOf(copyTo));
}
}