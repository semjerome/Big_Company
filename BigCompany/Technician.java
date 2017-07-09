/**
This is the subclass Technician
It contains information exclusive for Technician
*/
public class Technician extends Employee
{
   private int level;
   private String Territory;
  
  //Default Constructor
  public Technician()
  {
  super( "Soran", 1001); // superclass that links to Employee
   level = 3;
   Territory = "Nunavut";
  }
 //Technician Constructor with 4 parameters
  public Technician(int num, String name, int lvl, String ter)
  {
   super(name, num);
   level =lvl;
   Territory = ter;
  }
  /**
  a setter method for variable Level
 @param lvl - it set the variable ter to variable level
  */
  public void setLevel(int lvl)
  {
  level = lvl;
  }
  /**
  a setter method for variable Territory
 @param ter - it set the variable ter to variable Territory
  */
  public void setTerritory(String ter)
  {
  Territory = ter;
  }
  /**
   a getter method for variable Level
   @return  it return the value of variable level
   */
  public int getLevel()
  {
  return level;
  }
  /**
   a getter method for variable Territory
   @return  it return the value of variable Territory
   */
  public String getTerritory()
  {
  return Territory;
  }
  /**
   a toString Method for Technician class
   @return it return the printout of Technician class with its value
   */
  public String toString()
  {
  return "\n"+"T"+"," +super.toString() + level +","+ Territory;
  }
  
  
  
}