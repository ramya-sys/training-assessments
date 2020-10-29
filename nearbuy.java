import java.util.Scanner;
class Nearbuy{
void services(){
System.out.println("salon,spa,restaurent,activities,health,buffet,giftcards");
}
String purchasedServices(){
return " are services you have choosed";
}
void clientAddress(String address){
System.out.println("Your address is "+address);
}
int bill(){
return 500;
}
String payBill(){
System.out.println("Amount recieved is "+amount);
return "paid";
}
}
class Client{
public static void main(String[] args){
Nearbuy customer=new Nearbuy();
customer.services();
Scanner sc=new Scanner(System.in);
System.out.println("enter service you want to choose");
String order=sc.next();
System.out.println(order+customer.purchasedServices());
System.out.println("Your billed amount is "+customer.bill());
System.out.println("Enter your address");
String address=sc.next();
customer.clientAddress(address);
System.out.println("Enter the pay amount");
int amount=sc.nextInt();
System.out.println("Bill is "+ customer.payBill(500));
}
}
}