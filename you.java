class student
{
int Id;
String Name;
public student(int id, String name)
{
this.Id = id;
this.Name = name;
}
public void display()
{
System.out.println("student Id:"+Id);
System.out.println("student Name;"+Name);
}
}
public class you
{
public static void main(String ar[])
{
student x1 = new student(1,"John Doe");
student x2 = new student(2,"Jane Smith");
x1.display();
x2.display();
}
}