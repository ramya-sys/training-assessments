class Restuarent{
void menu(){
System.out.println("1.idli 2.dosa 3.poori 4.wada");
}
void takeOrder(String order){
System.out.println("order given is "+order);
}
String serveFood(){
return "dosa";
}
int giveBill(){
return 421;
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}
}
class Customer{
public static void main(String args[]){
Restuarent ohris=new Restuarent();
ohris.menu();
ohris.takeOrder("dosa");
System.out.println("Food served is "+ohris.serveFood());
System.out.println("Bill is "+ohris.giveBill());
System.out.println("Bill "+ohris.payBill(421));
}
}