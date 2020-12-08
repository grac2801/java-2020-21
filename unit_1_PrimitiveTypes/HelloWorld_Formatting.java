package unit_1_PrimitiveTypes;

public class HelloWorld_Formatting
{
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
		System.out.print("Today ");
		System.out.println("is Thursday!");
		
		//Formatting for an integer
		System.out.printf("%d", 10);
		
		//Float
		System.out.printf("%f", 10.1);
		System.out.println();
		
		//Character
		System.out.printf("%c%n", 65);
		
		//String
		System.out.printf("%s%n", "hello");
		System.out.printf("%S%n", "hello");
		
		//Boolean
		System.out.printf("%b%n", 5 < 4);
		System.out.printf("%B%n", 5 >= 4);
		

		//Scientific notation
		System.out.printf("%e%n", 0.783748374);


		//Hexadecimal
		System.out.printf("%X%n", 15);

		//hashcode
		System.out.printf("%h%n", 139839438);
		
		
		
		
		//Multiple statements
		int num1 = 10;
		int num3 = 30;
		System.out.printf("%d %d %d%n", num1, 20, num3);
		System.out.printf("%d  %f  %d%n", num1, 20.5, num3);
		
		
		double num4 = 10.767348734;
		System.out.printf("%f%n", num4);
		System.out.printf("%.3f%n", num4);


		//print
		//println
		//printf and modifiers


		
		
		
		

		
	}
	
}
