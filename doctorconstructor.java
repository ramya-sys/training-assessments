
class Doctor{
int drid;
String drname;
String specialization;
String qualification;
int age;
long mobile_no;
int salary;
String address;

Doctor(int drid, String drname,String specialization, String qualification,int age, long mobile_no,int salary,String address){
this.drid=drid;
this.drname=drname;
this.specialization=specialization;
this.qualification=qualification;
this.age=age;
this.mobile_no=mobile_no;
this.salary=salary;
this.address=address;
}

void display(){
System.out.println("Doctor id="+drid);
System.out.println("Doctor name="+drname);
System.out.println("Doctor specialization="+specialization);
System.out.println("Doctor qualification="+qualification);
System.out.println("Doctor age="+age);
System.out.println("Doctor mobile_no="+mobile_no);
System.out.println("Doctor salary="+salary);
System.out.println("Doctor address="+address);
}
}
class  DoctorConstructor{
public static void main(String args[]){
Doctor anil=new Doctor(121,"anil","physician","MBBS",33,123456789,40000,"hyderabad");
anil.display();
Doctor vineela=new Doctor(222,"vineela","cordiologist","MS",43,324567819,45000,"chennai");
}
}
