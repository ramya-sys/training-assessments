package collections;
class Vehicles
{
	void use()
	{
		int bikeMileage=60;
		int carMileage=15;
		System.out.println("Vehicles details");

	class Car
	{
		void speed(String name,int fast)
		{
			System.out.println("top speed of  a "+name+" car is "+fast);
		}
		void mileage()
		{
			System.out.println("Mileage of  the car is "+carMileage);
		}
	}
	class Bike
	{
		void speed(String name,int fast)
		{
			System.out.println("top speed of  a "+name+" car is "+fast);
		}
		void mileage()
		{
			System.out.println("Mileage of the car is : "+bikeMileage);
		}
	}
	Car audi=new Car();
	audi.speed("Audi",260);
	audi.mileage();

	Bike apache=new Bike();
	apache.speed("pulsur",140);
	apache.mileage();		
	}
}
public class LocalInnerClassEx {

	public static void main(String[] args) {
		Vehicles v=new Vehicles();
		v.use();

	}

}