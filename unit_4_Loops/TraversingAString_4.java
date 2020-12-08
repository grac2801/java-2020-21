package unit_4_Loops;

public class TraversingAString_4
{
	
	public static void main(String[] args)
	{
		System.out.println("\n\n---------------------- Modulus operator-------------------------");
		//Print from middle point letter included trough end of string
		String str = "Michael"; //print "hael"
		for(int i = 0; i < str.length()/2 + 1; i++)
		{
			int index = (i + str.length()/2) % str.length(); // 4%7 = 4
			System.out.print(str.substring(index, index + 1) );
		}
		
		System.out.println();
		
		/*
		 * Print the upper half letter not including the middle point letter
		 */
		
		str = "Michael";
		for(int i = 0; i < str.length() / 2; i++)
		{
			int index = (i + str.length() /2 + 1) % str.length();
			System.out.print(str.substring(index, index + 1));
		}
		
		
		
		System.out.println();
		
		String str1 = "Mississippi";
		String newStr1 = "";
		
		/*
		 * Remove all letters i
		 */
		for(int i = 0; i < str1.length(); i++) //# iterations
		{
			if(!str1.substring(i, i + 1).equals("i"))
			{
				newStr1 += str1.substring(i, i + 1);
			}
		}
		System.out.println(newStr1);
		
		
	}//End of main
	
}
