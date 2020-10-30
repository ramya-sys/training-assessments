class Parlour{
void services(){
System.out.println("Pedicure,Manicure,Facial,Waxing");
}
void purchasedService(String purchase){
System.out.println("Service purchase is "+purchase);
}
void purchasedService(String purchase1,String purchase2)
{
System.out.println("Service purchased is "+purchase1+" and "+purchase2);
}
void purchasedService(String purchase1,String purchase2,String purchase3)
{
System.out.println("Service Purchased is "+purchase1+" and "+purchase2+"  "+purchase3);
}
}

class Client
{
public static void main(String args[])
{
Parlour services=new Parlour();
services.purchasedService("Pedicure");
services.purchasedService("Pedicure","Manicure");
services.purchasedService("Waxing","Manicure","Facial");
}
} 




















