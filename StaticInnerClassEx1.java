package collections;
class Vehicle1 
{
	static class Cars
	{
		void tyre()
		{
			System.out.println("A car has 4 tyres");
		}
		static void fuel()
		{
			System.out.println("few cars runs with"
					+ " diesel");
		}
	}
}
public class StaticInnerClassEx1 {

	public static void main(String[] args) {
		Vehicle1.Cars car=new Vehicle1.Cars();
		car.tyre();
		Vehicle1.Cars.fuel();
	}

}