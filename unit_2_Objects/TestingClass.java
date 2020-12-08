package unit_2_Objects;
import student.StudentGreet;
public class TestingClass
{
	
	public static void main(String[] args)
	{
//		String s1 = new String("Hello");
//		String s2 = "Brian";
		
		//Create an object of StudentGreet class
		StudentGreet stu1 = new StudentGreet();
		stu1.sayGrade();
		stu1.studentName();
		
	}
	
}
