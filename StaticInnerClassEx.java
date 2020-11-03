package collections;
abstract class Person
{
	abstract void eat();
	abstract void sleep();
	abstract void walk();

}
public class StaticInnerClassEx {

	public static void main(String[] args) {
		Person prashanth=new Person() {
			void eat()
			{
				System.out.println("Prashanth Eats Food");
			}
			void sleep()
			{
				System.out.println("Prashanth Sleeps for 6 hours");
			}
			void walk()
			{
				System.out.println("Prashanth walks for 30 mins");
			}
		};
		prashanth.eat();
		prashanth.sleep();
		prashanth.walk();
	}

}