import java.util.*;
class circle
{
double r,a,c;
public circle(double x)
{
r=x;
a=c=0.0;
}
void calculate()
{
a=3.14*r*r;
c=2*3.14*r;
System.out.println("area: "+a);
System.out.println("circumference: "+c);
}
public static void main(String ar[])
{
Scanner x = new Scanner(System.in);
System.out.println("Enter radius of circle");
double r = x.nextDouble();
circle obj = new circle(r);
obj.calculate();
}
}