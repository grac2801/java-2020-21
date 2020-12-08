package unit_2_Objects;

import java.util.Scanner;

public class String_Function_2_3
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n---------------------- Strings-------------------------");
		
		String example = new String("variable");
		String example2 = new String("VariABle");
		
		System.out.println("\n\n---------------------- Lenght of a string-------------------------");
		
		int lentghOfString = example.length();
		System.out.println("The length of var. example: " + lentghOfString);
		
		System.out.println("\n\n---------------------- Equality between strings -------------------------");
		
		boolean sameString = example.equals(example2);
		System.out.println("Are example and example2 equal? " + sameString);
		boolean sameStringCapitals = example.equalsIgnoreCase(example2);
		System.out.println("Are example and example2 equal? " + sameStringCapitals);
		
		System.out.println("\n\n---------------------- Substring-------------------------");
		System.out.println("ria from example variable: " + example.substring(2, 5));
		System.out.println("ria from example variable: " + example.substring(2, 4 + 1));
		
		System.out.println("\n\n---------------------- Variation of substring-------------------------");
		
		System.out.println("Everything after index 4: " + example.substring(4));
		
		System.out.println("\n\n---------------------- Capitalize and lowercase-------------------------");
		System.out.println("example: " + example);
		System.out.println("Capitalized: " + example.toUpperCase());
//		example = example.toUpperCase();
		System.out.println("example: " + example);
		
		System.out.println("\n\n---------------------- compareTo()-------------------------");
		String s = "aardvark";
		System.out.println("compare s to zebra: " + s.compareTo("aardvark"));
		
		System.out.println("\n\n---------------------- indexOf()-------------------------");
		System.out.println("r is found in example variable at index: " + example.indexOf('r'));
		System.out.println("r is found in example variable at index: " + example.indexOf("r"));
		System.out.println("ri is found in example variable at index: " + example.indexOf("able"));
		System.out.println("ap is found in example variable at index: " + example.indexOf("ap"));
		
		
		scan.close();
	}
	
}
