package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class prac
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		/*
		 * Simple if and else statement
		 */
		System.out.println("\n\n---------------------- If and else -------------------------");
		
		System.out.println("What was your grade percentage?");
		double grade = scan.nextDouble();
		
		// Decision
		if (grade >= 60)
		{
			System.out.println("You have passed!");
		} else
		{
			System.out.println("You have failed!");
		}
		
		System.out.println("\n\n---------------------- grade letters (sequential) -------------------------");
		
		if (grade >= 90)
		{
			System.out.println("A");
		}
		
		if (grade >= 80)
		{
			System.out.println("B");
		}
		if (grade >= 70)
		{
			System.out.println("C");
		}
		if (grade >= 60)
		{
			System.out.println("D");
		} else
		{
			System.out.println("F");
		}
		
		System.out.println("\n\n---------------------- grade letters (else) -------------------------");
		
		if (grade >= 90)
		{
			System.out.println("A");
		}
		else if (grade >= 80)
		{
			System.out.println("B");
		} 
		else if (grade >= 70)
		{
			System.out.println("C");
		} 
		else if (grade >= 60)
		{
			System.out.println("D");
		} 
		else
		{
			System.out.println("F");
		}
		
		System.out.println("\n\n---------------------- gpa-------------------------");
		double gpa = 0;
		if (grade >= 90)
		{
			gpa += 4;
			System.out.println("You got a " + gpa + " gpa.");
		}
		if (grade >= 80)
		{
			gpa += 3;
			System.out.println("You got a " + gpa + " gpa.");
		}
		
		System.out.println("\n\n---------------------- Your practice -------------------------");
		
		/*
		 * Now you will develop a program which randomly selects 3 numbers between 1 and
		 * 30; Then, gets their average, and add 70 to it. Show your 3 random numbers
		 * Finally, apply the grade average starting with a C for 70% and above; B for
		 * 80%, and A for 90% and above
		 */
		
		// 3 random numbers between 1 and 10
		int num1 = (int) (Math.random() * 30) + 1;
		int num2 = (int) (Math.random() * 30) + 1;
		int num3 = (int) (Math.random() * 30) + 1;
		
		// get the average
		double average = (num1 + num2 + num3) / 3;
		
		// add 70 pts
		double finalGrade = average + 70;
		
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
		System.out.println("Number 3: " + num3 + "\n");
		
		// Decision
		if (finalGrade >= 90)
		{
			System.out.println("A");
		}
		
		else if (finalGrade >= 80)
		{
			System.out.println("B");
		} else if (finalGrade >= 70)
		{
			System.out.println("C");
		}
		
		// close resource
		scan.close();
	}
	
}
