package collections;
class University 
{
	 void announcement()
		{
			System.out.println("Exams will start on january 2021");
		}
	class Department
	{
		void examPapers()
		{			
			System.out.println("Exam papers are being preared for the students");
		}	
	}
}

public class MemberInnerClassEx {

	public static void main(String[] args) {

		University CMR = new University();
		CMR.announcement();
		University.Department pg=new University().new Department();
		pg.examPapers();

	}

}