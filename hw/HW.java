package hw;
import java.util.Scanner;

class HW
{
	
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		String password = "";
		boolean lowercase = false;
		boolean uppercase = false;
		boolean num = false;
		boolean special = false;
		
		while (true)
		{
			System.out.println("Enter a 12 character password");
			password = scan.nextLine();
			if (password.length() == 12)
			{
				break;
			} else
			{
				System.out.println("Your password must be 12 characters. Try Again.");
			}
		}
		
		char[] check = password.toCharArray();
		for (int i = 0; i < password.length(); i++)
		{
			if ((check[i] >= 65) && check[i] <= 90)
			{
				uppercase = true;
			}
			if ((check[i] >= 97) && check[i] <= 122)
			{
				lowercase = true;
			}
			if ((check[i] >= 33) && check[i] <= 39)
			{
				special = true;
			}
			if ((check[i] >= 48) && check[i] <= 57)
			{
				num = true;
			}
		}
		
		if (uppercase == false)
		{
			System.out.println("You are missing a capital letter.");
		}
		if (lowercase == false)
		{
			System.out.println("You are missing a lowercase letter.");
		}
		if (special == false)
		{
			System.out.println("You are missing a special character.");
		}
		if (num == false)
		{
			System.out.println("You are missing a number.");
		}
		
		scan.close();
		
	}
}
