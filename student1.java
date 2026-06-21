class student1
{
int roll;
String name;
double per;
public student1()
{
roll=1;
name="sameer";
per=89.66;
}
public student1(int x,String y,double z)
{
roll=x;
name=y;
per =z;
}
void display()
{
System.out.println("roll: "+roll);
System.out.println("name: "+name);
System.out.println("percentage: "+per);
}
public static void main(String ar[])
{
student1 ob  = new student1();
student1 obj =new student1(2,"Amit",76);
ob.display();
obj.display();
}
}