package unit_5_Classes;

import java.util.Scanner;

public class StudentProfileClient
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		StudentProfile s1 = new StudentProfile("Leo", "Yniguez", 12, 123456);
		System.out.println(s1);
		StudentProfile std = new StudentProfile();
		System.out.println(std);
		StudentProfile s2 = new StudentProfile(true);
		System.out.println(s2);
		StudentProfile s3 = new StudentProfile(input);
		System.out.println(s3);
		

		
		input.close();
		
		
		
	}

}
