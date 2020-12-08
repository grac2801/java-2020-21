package unit_5_Classes;
import edhesive.shapes.*;
public class PrimitiveVsObjects
{
	public static void addOne(int parameter)
	{
		System.out.println("Parameter inside method(before): " + parameter);
		parameter += 1;
		System.out.println("Parameter inside method(after): " + parameter);
	}//End of method
	
	public static void setNewRadius(Circle a)
	{
		a.setRadius(a.getRadius() + 10);
	}
	
	public static void updatePoly(RegularPolygon r, int sides, double sideLength )
	{
		r.setNumSides(sides);
		r.setSideLength(sideLength);
	}//End of method
	public static void main(String[] args)
	{
		int value = 5;
		addOne(value);
		Circle c = new Circle();
		System.out.println(c);
		setNewRadius(c);
		System.out.println(c);
		Rectangle r = new Rectangle(3.5, 9.3);
		System.out.println(r);
		
		/*
		 * Write a method called updatePoly that has 3 parameters:
		 * 1. regular polygon
		 * 2. sides (int)
		 * 3. sideLength (double)
		 * In the method, change the number of sides and length of sides
		 * to match the parameters. Test that the changes take effect in the 
		 * main method.
		 */
		//Instantiate a RegularPolygon object, and then call updatePoly method
		RegularPolygon rp1 = new RegularPolygon();
		System.out.println(rp1);
		updatePoly(rp1, 5, 2);
		System.out.println(rp1);
		
	}
	
}












