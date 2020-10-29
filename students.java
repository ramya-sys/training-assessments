class Students{
int stdid;
String stdname;
int class;
String section;
static String blood_group;
float percentage;
String grade;
static long mobile;
String address;

Students(int stdid,String stdname,int class,String section,static String blood_group,float percentage,String grade,static long mobile,String address){
this.stdid=stdid;
this.stdname=stdname;
this.class=class;
this.section=section;
this.blood_group=blood_group;
this.percentage=percentage;
this.grade=grade:
this.mobile=mobile;
this.address=address;
}
void display(){
System.out.println("Student id="+stdid);
System.out.println("Student name="+stdname);
System.out.println("Student class="+class);
System.out.println("Student section="+section);
System.out.println("Student blood_group="+blood_group);
System.out.println("Student percentage="+percentage);
System.out.println("Student grade="+grade);
System.out.println("Student mobile="+mobile);
System.out.println("Student address="+address)
}
}
class StudentsConstructor{
public static void main(String args[]){
Students nikhil=new Students(32,"nikhil",9,"A","B+" ,96.0f,"A","Hyd",9998888000); 
nikhil.display();
Students ramya=new Students(34,"ramya",9,"B","O+".90.0f,"A","chennai",9900889977);
}
} 