package unit_5_Classes;

public class Book 
{
	//Data encapsulation
//	Fields and methods
	private String author;
	private String title;
	private int year;
	
	
	//Constructor
	public Book(String a, String b, int y)
	{
		title = a;
		author = b;
//		year = y;
		if(y >= 1450)
		{
			year = y;
		}
		else
		{
			year = 1900;
		}
	}
	

	//Mutator or setter
	public void setTitle(String t)
	{
		title = t;
	}
	
	//Accessor or getter
	public String getTitle()
	{
		return title;
	}
	
	//Mutator for author
	public void setAuthor(String s)
	{
		author = s;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	//Mutator for year
	public void setYear(int y)
	{
		if (year >= 1450)
		{
			year = y;
		}
		else
		{
			year = 1900;
		}
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	public String toString()
	{
		String info = "Author: " + author + 
		"\nTitle: " + title + "\nYear: " + year;
		return info;
	}
	
	public boolean equals(Book other)
	{
		if(title.equals(other.getTitle()) &&
				author.equals(other.getAuthor())
				&& year == other.getYear())
		{
			return true;
		}
		return false;
	}

	
	/*
	 * Add a field called genre to the book class
	 * Update constructor
	 * Add accessor and mutator for this field
	 */
	
	
	
}//End of Book class





