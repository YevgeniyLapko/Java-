import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* Our first pure Object Oriented Programming Java class, in the sense it is used to model a concept (a type of objects) of the problem we want to solve<br>. 
* The student class produces and give functionality to n >= 0 student objects<br>
*/
public class student {

	public String  firstName; //First name
	public int     age;       //Student age
	public boolean firstYear; //First year or not
	
	public student(String fn, int a, boolean bool)
	{
		firstName = fn;
		age = a;
		firstYear = bool;
	}
	
	public String getName()
	{
		return firstName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public boolean getFirstYear()
	{
		
		return firstYear;
	}

	public void setName(String name)
	{
		this.firstName = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setFirstYear(boolean bool)
	{
		this.firstYear = bool;
	}
	public void birthday()
	{
		this.age = age +1;
		
		if (this.getFirstYear())
		{
		System.out.println("Happy birthday " + this.getName() + ", we hope you are enjoying your first year in college.");
		}
		else
		{
			System.out.println("Happy birthday " + this.getName() + ", we hope you are enjoying your year in college.");	
		}
	}
	public String toString()
	{
		return this.getName() + " " + this.getAge() + " " + this.getFirstYear();
	}
	
}
