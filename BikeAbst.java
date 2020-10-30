abstract class Bike{
abstract void cost();
abstract void milage();
}
class Pulser extends Bike{
void cost(){
System.out.println("Pulser cost is 2lakhs");
}
void milage(){
System.out.println("Pulser milage is 25km ");
}
}

class Devidson extends Bike{
void cost(){
System.out.println("Devidson cost is 5lakhs");
}
void milage(){
System.out.println("Devidson milage is 20km");
}
}
class BikeAbst
{
public static void main(String args[]){
Bike x;
x=new Pulser();
x.cost();
x.milage();
x=new Devidson();
x.cost();
x.milage();
}
}
