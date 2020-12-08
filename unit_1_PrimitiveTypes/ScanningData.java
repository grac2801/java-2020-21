package unit_1_PrimitiveTypes;

import java.util.Scanner;

public class ScanningData
{
	
	public static void main(String[] args)
	{
		Scanner michael = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = michael.nextLine();
		System.out.println("Hello " + name + ". Nice to meet you!");
		michael.close();
	}
	
}
