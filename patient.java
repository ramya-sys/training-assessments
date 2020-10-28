class Patient
{
String name;
int mrno;
int age;
String gender;
float fees;
int mobile_no;
String address;
String illness;
static String hospital;

}
class p1
{
public static void main(String args[])
{
Patient veeraiah=new Patient();
veeraiah.mrno=2345;
veeraiah.age=80;
veeraiah.gender="male";
veeraiah.fees=800;
veeraiah.mobile_no=123456789;
veeraiah.address="hyd";
veeraiah.illness="fever";
Patient.hospital="CARE";

System.out.println("-----------------Patient Details------------");
System.out.println("mrno="+veeraiah.mrno);
System.out.println("age="+veeraiah.age);
System.out.println("gender="+veeraiah.gender);
System.out.println("fees="+veeraiah.fees);
System.out.println("mobile_no="+veeraiah.mobile_no);
System.out.println("address="+veeraiah.address);
System.out.println("illness="+veeraiah.illness);
System.out.println("hospital_name="+Patient.hospital);
}
}