package collections;
class College
{
	void exams()
	{
		System.out.println("College will conduct exams ");
		class Department
		{
			void pg()
			{
				System.out.println("pg exams will start january 2020");
			}
			void ug()
			{
				System.out.println("Exams for ug students will start in december ");
			}
		}
		Department d=new Department();
		d.pg();
		d.ug();
	}

}
public class LocalInnerClassEx1 {

	public static void main(String[] args) {
		College priyadarshini=new College();
		priyadarshini.exams();
	}
}