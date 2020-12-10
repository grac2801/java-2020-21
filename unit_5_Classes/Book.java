package unit_5_Classes;

public class Book
{
	// instance variables or fields
	private String author;
	private String title;
	private int year;
	
	
	// Constructor
	public Book()
	{
		
	}
	


	public Book(String author, String title, int year)
	{
		this.author = author;
		this.title = title;
		if (year >= 1450)
		{
			this.year = year;
		} 
		else
		{
			this.year = 1900;
		}
		
	}// End of constructor

	
	
	



	// [Getters or accessor] and [setters or mutator]
	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
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

	
	@Override
	public String toString()
	{
		String info = "The author is: " + author +
				"\nTitle: " + title + 
				"\nYear: " + year;
		return info;
	}
}
