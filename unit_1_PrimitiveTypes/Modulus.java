package unit_1_PrimitiveTypes;
import java.util.Scanner;
public class Modulus
{
	public static void main(String[] args)
	{
		
		System.out.println("\n\n---------------------- Modulus-------------------------");
		
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a whole number: ");
	    int x = scan.nextInt();
	    System.out.print("Enter another whole number: ");
	    int y = scan.nextInt();

	    //Try 5 and 2, and 5 and 7
	    System.out.println ("Division " + x + "/" + y + ": " + ( x / y));
	    System.out.println("Remainder " + x + "%" + y + ": " + (x % y));
	    
	    
	              
	    //Use Mod 2 to find if a number is even or odd                    
	    System.out.println("Checking if x is even or odd.");
	    System.out.println("0 means even, 1 means odd : " + (x % 2));
	              
	    //Use Mod 10 to find the ones' digit
	    System.out.println("What is the digit in the ones' place of x:" + (x % 10));
		
		
	    
	    System.out.println("\n\n---------------------- Extracting numbers-------------------------");
		
		
		int amount = 902_723;
		System.out.println("amount: " + amount);
		int num1 = amount % 10;
		System.out.println("num1: " + num1);
		amount /= 10;
		
		//Second number
		System.out.println("\nnew amount: " + amount);
		int num2 = amount % 10;
		System.out.println("num2: " + num2);
		amount /= 10;
		
		//and so on
		System.out.println("\nnew amount: " + amount);
		
		
		System.out.println("\n\n---------------------- Error divide by zero-------------------------");
		System.out.println("Enter a number to divide by: (Enter zero)");
		int inputNumber = scan.nextInt();//input zero
		System.out.println(9 % inputNumber);
		
		scan.close();
		
	}
}
