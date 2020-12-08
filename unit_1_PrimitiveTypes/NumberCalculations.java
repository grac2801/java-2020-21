package unit_1_PrimitiveTypes;

import java.util.Scanner;

public class NumberCalculations
{
	public static void main(String[] args)
	{
		//Instantiate my scanner
		Scanner scan = new Scanner(System.in);
				
		int num1 = 18;
		int num2 = 3;
		
		System.out.println("num1 + num2: " + (num1 + num2));
		System.out.println();
		
		
		
		//Subtraction, multiplication, and division
		int mul1 = 8;
		int mul2 = 50;
		System.out.println("mul1 * mul2: " + (mul1 * mul2));
		
		System.out.println("\n\n---------------------- PEMDAS-------------------------");
		
		int x = 9;
		int y = 2;
		int z = x + y * y;
		System.out.println("z: " + z);
		
		
		//Divide 2 numbers
		System.out.println("num2 / 2: " + num2 / 2);
		System.out.println();
		
		System.out.println("\n\n---------------------- Using more doubles-------------------------");
		
		int ab = 11;
		double b = ab/2.0;
		System.out.println(b);
		System.out.println();
		
		System.out.println("\n\n---------------------- Student exercise [average]-------------------------");
		
		
		
		/*
		 * Create a program that asks a user for 3 integer numbers, 
		 * collect the numbers
		 * Average them using a real number as your answer, rounding it to 
		 * 2 numbers past the decimal point.
		 */
		
//		System.out.println("Enter the first number: ");
//		int number1 = scan.nextInt();
//		System.out.println("Enter the second number: ");
//		int number2 = scan.nextInt();
//		System.out.println("Enter the third number: ");
//		int number3 = scan.nextInt();
//		double average = (number1 + number2 + number3)/3.;
//		System.out.printf("The average is: %,.2f", average);
		
		System.out.println("\n\n---------------------- Unary operators-------------------------");
		
		int c = 10;
		System.out.println("c: " + c);
		c = 10 + 1;
		System.out.println("c: " + c);
		c++;
		System.out.println("c: " + c);
		c += 1;
		System.out.println("c: " + c);
		c *= 3;
		System.out.println("c: " + c);
		c--;
		System.out.println("c: " + c);
		
		
		int numberOfDays = 5;
		numberOfDays -= 1;
		System.out.println("numberOfDays: " + numberOfDays);
		
		int divide = 193_431;
		double newNum;
		newNum = divide/3.0;
		System.out.printf("$%,.2f", newNum);
		
		
//		int anotherNum1 = 3;
//		int anotherNum2 = 0;
		//double answer = anotherNum1 / anotherNum2;
		//System.out.println("3/0: " + answer);
		
		
		scan.close();
		
	}
}
