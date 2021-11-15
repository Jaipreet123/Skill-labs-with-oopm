package Interface;
import java.util.Scanner;

class Student
{
String name;
int id;
Scanner in = new Scanner(System.in);
void getData()
{
System.out.print("Enter student name => ");
name = in.next();
System.out.print("Enter ID => ");
id = in.nextInt();
}
}
interface Sports
{
int marks = 5;
}
class interfaceDemo extends Student implements Sports
{
int sub1, sub2;
void getMarks()
{
System.out.print("Enter Subject 1 marks => ");
sub1 = in.nextInt();
System.out.print("Enter Subject 2 marks => ");
sub2 = in.nextInt();
}
public static void main(String args[])
{
	interfaceDemo ob = new interfaceDemo();
int flag;
ob.getData();
ob.getMarks();
System.out.print("Enter 1 if taken part in Sports => ");
flag = ob.in.nextInt();
if(flag==1)
{
ob.sub1 += Sports.marks;
ob.sub2 += Sports.marks;
}
System.out.println("Student Details:");
System.out.println("Name: " + ob.name);
System.out.println("ID: " + ob.id);
System.out.println("Subject 1: " + ob.sub1);
System.out.println("Subject 2: " + ob.sub2);
}
}
