package unit_5_Classes;
import java.util.Scanner;
public class StudentProfile
{
	String fn;
	String ln;
	int level;
	int id;
	boolean outOfState;
	
	Scanner scan = new Scanner(System.in);
	/*
	 * The next are 3 different constructors plain 4 parameters constructor chaining
	 */
	public StudentProfile()
	{
		setFn("Needs input");
		setLn("Needs input");
		setLevel(9);
		setId(-999999);
	}
	
	public StudentProfile(String fn, String ln, int level, int id)
	{
		setFn(fn);
		setLn(ln);
		setLevel(level);
		setId(id);
	}
	
	// Third constructor using the "this" keyword
	public StudentProfile(boolean outOfState)
	{
		// This must be the first line --> constructor chaining
		this("Needs input", "Needs input", 9, 999999);
		setOutOfState(outOfState);
		
		
	}
	
	public StudentProfile(Scanner scan)
	{
		System.out.println("\n");
		System.out.println("Enter first name: ");
		String name = scan.next();
		System.out.println("Enter last name: ");
		String lastName = scan.next();
		System.out.println("Enter grade level: ");
		int grade = scan.nextInt();
		System.out.println("Enter id#: ");
		int idNumber = scan.nextInt();
		//bug in Scanner
		scan.nextLine();
		
		System.out.println("Out of state? Y/N: ");
		String outOfCalif = scan.next();
		outOfCalif = outOfCalif.toUpperCase();
		if(outOfCalif == "Y")
		{
			this.outOfState = true;
		}
		else
		{
			this.outOfState = false;
		}
		setFn(name);
		setLn(lastName);
		setLevel(grade);
		setId(idNumber);
		
		
		
	}
	
	// Getters and setters
	public String getFn()
	{
		return fn;
	}
	
	public void setFn(String fn)
	{
		this.fn = fn;
	}
	
	public String getLn()
	{
		return ln;
	}
	
	public void setLn(String ln)
	{
		this.ln = ln;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public boolean getOutOfState()
	{
		return outOfState;
	}
	
	public void setOutOfState(boolean outOfState)
	{
		this.outOfState = outOfState;
	}
	
	@Override
	public String toString()
	{
		return "\nFirst name: " + getFn() 
				+ "\nLast name: " + getLn() 
				+ "\nGrade Level: " + getLevel() 
				+ "\nid # " + getId() 
				+ "\nout of state? " + getOutOfState();
	}
	
	
	
}
