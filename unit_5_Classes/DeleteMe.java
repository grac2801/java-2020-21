package unit_5_Classes;

import java.util.Scanner;

public class DeleteMe
{
	public static void moreThanOne(Scanner zap, String name, int age)
	{
		System.out.println("Enter your name: ");
		name = zap.nextLine();
		System.out.println("Enter your age: ");
		age = zap.nextInt();
		System.out.println("Your name is: " + name + ", and your age is: " + age);
		
	}// End of method
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		moreThanOne(scan, "Oscar", 49);
		
		scan.close();
	}
	
}
