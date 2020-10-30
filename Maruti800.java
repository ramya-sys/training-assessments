class Car{
public Car()
{
System.out.println("Class Car");

}
public void vehicleType(){
System.out.println("Vehicle Type; Car");
}
}
class Maruti extends Car{
public Maruti()
{
System.out.println("Class Maruti");
}
public void brand()
{
System.out.println("Brand; Maruthi");
} 
public void speed()
{
System.out.println("Max: 90kmp");
}
}
public class Maruti800 extends Maruti
{
public Maruti800()
{
System.out.println("Maruti Model: 800");
}
public void speed()
{
System.out.println("Max: 80kmp");
}
public static void main(String args[]){
Maruti800 mt=new Maruti800();
mt.vehicleType();
mt.brand();
mt.speed();
}
}