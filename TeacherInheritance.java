class Teacher{
String designation="teacher";
String collegeName="nalanda";
void does(){
System.out.println("Teching");
}
}
class MathTeacher extends Teacher{
String mainSubject="maths";
public static void main(String args[]){
MathTeacher siri=new MathTeacher();
System.out.println(siri.designation);
System.out.println(siri.collegeName);
System.out.println(siri.mainSubject);
siri.does();
}
}