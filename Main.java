class Student 
{
int roll;
String name;
void insertRecord(int r, String n)
{
roll = r;
name = n;
}
void display() 
{
System.out.println(roll + " " + name);
}
}
public class Main 
{
public static void main(String[] args) 
{
Student s1 = new Student();
Student s2 = new Student();
s1.insertRecord(1, "karan");
s2.insertRecord(2, "nikita");
s1.display();
s2.display();
}
}