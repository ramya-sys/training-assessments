class Person{

void nationality(){
System.out.println("Indian");
}
void place(){
System.out.println("Hyderabad");
}
}
class Employee extends Person
{

void organization()
{
System.out.println("Motivity");
}
void place()
{
System.out.println("Australia");
}
}
class Manager extends Employee
{

void subordinates()
{
System.out.println(10);
}
void place(){
System.out.println("Canada");
}
}
class MultiLevelInheritance
{
public static void main(String args[])
{
Manager rao=new Manager();
rao.nationality();
rao.organization();
rao.subordinates();
rao.place();
}
}
