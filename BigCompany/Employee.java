import java.io.Serializable;
import java.util.*;
/**
* This is the superclass Employee.
* It contains the general information for SalesMan and Technician
*/

public class Employee implements Comparable, Serializable, Cloneable
{
	private String Name;			// Name of employee
	private int Number;			// Employee number of employee
	
	/**
	* Constructor  to create the superclass
	* @param nom Name of the employee
	* @param number Employee number
	*/
	public Employee(String nom, int number )
	{
		Name = nom;
		this.Number = number;
	}
	
	// getters and setters as necessary
   public void setNumber(int number)
   {
    Number = number;
   }
   public void setName(String name)
   {
    Name = name;
   }
   public int getNumber()
   {
      return Number;
   }
   public String getName()
   {
      return Name;
   }

	/**
	* compareTo method for comparison of objects
	* @param Employee object
	* @return An integer to indicate comparison  
	*/
	public int compareTo(Object o)
	{
	if (getNumber() > ((Employee)o).getNumber())
			return 1;	//greater than
		else if  (getNumber() < ((Employee)o).getNumber())
			return -1;	// less than
		else
			return 0;	//equal
	}
	
	/** toString method for printing */
	public String toString()
	{
		return Name+","+Number+",";
	}
   public Employee clone() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
	}
}