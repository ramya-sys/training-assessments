class Bike{
void cost(){
System.out.println("No cost");
}
void milage(){
System.out.println("No milage");
}
}

class Pulser extends Bike{
void cost(){
System.out.println("Pulser cost is 2lakhs");
}
void milage(){
System.out.println("Pulser milage is 25km");
}
}
class Devidson extends Bike {
void cost(){
System.out.println("Devidson cost is 5lakhs");
}
void milage(){
System.out.println("Davidson milage is 15km");
}
}
class BikeMethodOverriding{
public static void main(String args[]){
Bike x=new Bike();
x.cost();
x.milage();
x=new Pulser();
x.cost();
x.milage();
x=new Devidson();
x.cost();
x.milage();
}
}
