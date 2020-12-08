package unit_4_Loops;

public class Chars
{
	
	public static void main(String[] args)
	{
		String str = "ksIjlkdjsdjflsAj";
//		System.out.println(letter);
		
		for(int i = 0; i < str.length(); i++) 
		{
			char letter = str.charAt(i);
			if(letter >= 65 && letter <= 90)
			{
				System.out.println("Capital letter: " + str.charAt(i) + " at index " + i);
			}
			
		}
	}//End of main
	
}
