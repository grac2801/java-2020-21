package unit_5_Classes;
import java.util.Scanner;
public class ReturnedValues
{
	public static String reverse(String str)
	{
		String copy = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			copy += str.charAt(i);
		}
		return copy;
	}// End of method
	
	public static String between_L1_and_L2(String s, char L1, char L2)
	{
		String newOne = "";
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) >= L1 && s.charAt(i) <= L2)
			{
				newOne += s.charAt(i);
			}
		}
		
		return newOne;
	}//End of method
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter a string to print backwards: ");
		String inputString = scan.nextLine();
		System.out.println("The reverse is: " + ReturnedValues.reverse(inputString));;
		
		
		
		System.out.println("Enter a string: ");
		String myString = scan.nextLine();
		String returnedString = ReturnedValues.between_L1_and_L2(myString, 'c', 'o');
		System.out.println(returnedString);
		scan.close();

	}
}
