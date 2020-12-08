package unit_4_Loops;

import java.util.Scanner;

public class Testing
{
	
	public static void main(String[] args)
	{
		//Declare a Scanner.
	    Scanner scan = new Scanner(System.in);

	    //Set a flag variable, rep, to control the loop.
	    int  rep = 1;

	    //Set up temporary variables to store the current location.
	    double lo = 0;
	    double la = 0;

	    //Set up a max and min for latitude and longitude.
	    double maxLat = -90;
	    double minLat = 90;
	    double maxLon = -180;
	    double minLon = 180;

	    //While rep == 1, continue the loop.
	    while (rep == 1)
	    {
	      //Input a lat and long value.
	      System.out.println("Please enter the longitude: ");
	      lo = scan.nextDouble();
	      System.out.println("Please enter the latitude: ");
	      la = scan.nextDouble();

	      //If the values are invalid, print an error, and continue the loop.
	      if (!(la >= -90 && la <= 90) || !(lo >= -180 && lo <= 180))
	        System.out.println("Incorrect Latitude or Longitude");

	      //Otherwise, check for a new max or min and ask the
	      //user if they would like to continue.
	      else
	      {
	        if(la > maxLat)
	          maxLat = la;
	        if(la < minLat)
	          minLat = la;
	        if(lo > maxLon)
	          maxLon = lo;
	        if(lo < minLon)
	          minLon = lo;
	      }
	      System.out.println("Would you like to enter another location? (1 for yes, 0 for no)");
	      rep = scan.nextInt();

	    }//while

	    //Print the results.
	    System.out.println("Farthest North: " + maxLat);
	    System.out.println("Farthest South: " + minLat);
	    System.out.println("Farthest East: " + maxLon);
	    System.out.println("Farthest West: " + minLon);
	    
	    scan.close();
	}
	 
  
}
