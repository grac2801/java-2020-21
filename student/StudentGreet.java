package student;

import java.util.Scanner;

public class StudentGreet
{//Start of class
	
	public void sayGrade()
	{
		System.out.println("My grade is  an A");
		System.out.println();
	}
	
	public void studentName()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("My name is Sophia, nice to meet you " + name);
		System.out.println();
		scan.close();
	}
	
}//End of class
