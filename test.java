class rectangle
{
int length;
int width;
void insert(int l, int w)
{
length = l;
width = w;
}
void CalculateArea()
{
System.out.println(length*width);
}
}
class test
{
public static void main(String ar[])
{
rectangle r1 = new rectangle();
rectangle r2 = new rectangle();
r1.insert(11,5);
r2.insert(13,2);
r1.CalculateArea();
r2.CalculateArea();
}
}


