package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class Else
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n---------------------- simple if -------------------------");
		
		System.out.println("What was your grade percentage? ");
		double grade = scan.nextDouble();
		
		//Decision
		/*
		 * if(grade >= 60) { System.out.println("You have passed!"); } else {
		 * System.out.println("You have failed!"); }
		 */
		
		
		System.out.println("\n\n---------------------- grade letters (sequential ifs) -------------------------");
		/*
		 * if(grade >= 90) { System.out.println("A"); } if(grade >= 80) {
		 * System.out.println("B"); } if(grade >= 70) { System.out.println("C"); }
		 * if(grade >= 60) { System.out.println("D"); } else { System.out.println("F");
		 * }
		 */
		
		System.out.println("\n\n---------------------- grade letter using else-------------------------");
		
		if(grade >= 90)
		{
			System.out.println("A");
		}
		else if(grade >= 80)
		{
			System.out.println("B");
		}
		else if(grade >= 70)
		{
			System.out.println("C");
		}
		else if(grade >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		
		System.out.println("\n\n---------------------- gpa -------------------------");
		
		double gpa = 0;
		
		if(grade >= 90)
		{
			gpa += 4;
			System.out.println("You got a " + gpa + " gpa.");
		}
		else if(grade >= 80)
		{
			gpa += 3;
			System.out.println("You got a " + gpa + " gpa.");
		}
		
		
		
		
		
		
		
		
		scan.close();
	}
}
