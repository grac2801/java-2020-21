package unit_2_Objects;

import java.util.Scanner;

public class WrapperClasses
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Integer x = null;
		System.out.println(x);
		Integer n1 = new Integer(45);
		Integer n2 = new Integer(56);
		Integer n3 = new Integer(45);
		
		//compareTo() -1, 0, 1
		System.out.println(n1.compareTo(n2));
		System.out.println(n1.compareTo(n3));
		System.out.println(n2.compareTo(n3));
		
		//Max and min for Integer class (unboxing)
		int lowest = Integer.MIN_VALUE;
		System.out.printf("Lowest value: %,d", lowest);
		int highest = Integer.MAX_VALUE;
		System.out.printf("%nHighest value: %,d", highest);
		highest++;
		System.out.printf("%nHighest value: %,d", highest);
		
		//Some more methods of the wrapper classes
		//valueOf() --> Makes a wrapper class object from String
		System.out.println("\n\n---------------------- valueOf()-------------------------");
		
		Integer n4 = Integer.valueOf("78");
		System.out.println(n4);
		System.out.println(n4.getClass());
		
		System.out.println();
		System.out.println("Max value of Byte: " + Byte.MAX_VALUE);
		Byte b1 = Byte.valueOf("126");
		System.out.println("b1 has value " + b1 + ", class: " + b1.getClass());
		
		System.out.println("\n\n---------------------- Wrapper into primitive intValue() -------------------------");
		Integer n5 = new Integer(5);
		System.out.println(n5);
		int prim = n5.intValue();
		System.out.println(prim);
		
		System.out.println("\n\n---------------------- parseInt()-------------------------");
		//Makes a String into a wrapper class object
		Integer fromParse = Integer.parseInt("11");
		System.out.println(fromParse);
		System.out.println();
		Integer bin11 = Integer.parseInt("11", 2);
		System.out.println(bin11);
		System.out.println("Hexadecimal");
		Integer hex1A = Integer.parseInt("1A", 16); // 6 + 20
		System.out.println(hex1A);
		
		//Scanner use and age in binary or hexadecimal
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age? ");
		String age = scan.next();
		System.out.println("Your age is: " + Integer.valueOf(age, 16) + " in hexadecimal.");
		scan.close();
		

	}
	
}
