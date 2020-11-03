package collections;
abstract class Student
{
	abstract void StudentId();

}

 class AnonymousInnerClassEx1 
{
	public static void main(String args[])
	{
		Student rams=new Student()
				{
			void StudentId()
			{

					System.out.println("Student id is 345 ");

			}

		};
		rams.StudentId();

	}

}