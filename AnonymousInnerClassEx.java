package collections;
abstract class Animal
{
	abstract void eat();
	abstract void walk();

}
public class AnonymousInnerClassEx {

	public static void main(String[] args) {
		Animal dog=new Animal() {
			void eat()
			{
				System.out.println("Dog Eats Food");
					}
			void walk()
			{
				System.out.println("Dog can walk");
			}
		};
		dog.eat();
		dog.walk();
	}

}