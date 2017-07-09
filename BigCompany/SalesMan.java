/**
This is the subclass SalesMan
It contains information exclusive fo SalesMan
*/
public class SalesMan extends Employee
{
   private double Target;    //Sales Target of the employee
   private String Territory;  //Territory of the Employee
   //Default contructor
   public SalesMan()
   {
   super( "Jerome", 1000);   //link to superclass Employee
   Target = 10000;        
   Territory = "Ontario";
   }
   /*
   Constructor with 4 parameters
   */
   public SalesMan(int num, String name, double target, String ter)
   {
   super(name, num);    //link to superclass Employee
   Target = target;
   Territory = ter;
   }
   /*
   A setter for variable Target
   @param target - it set the variable target to variable Target
   */
   public void setTarget(double target)
   {
   Target = target;
   }
   /*
   A setter for variable Territory
   @param ter - it set the variable Territory to variable Target
   */
   public void setTerritory(String ter)
   {
   Territory = ter;
   }
   /*
   A getter for variable Target
   @return Targer - it returns the value of variable Target
   */
   public double getTarget()
   {
   return Target;
   }
   /*
   A getter for variable Territory
   @return Territoru - it returns the value of variable Territory
   */
   public String getTerritory()
   {
   return Territory;
   }
   /**
   a toString Method for SalesMan class
   @return it return the printout of SalesMan class with its value
   */
   public String toString()
  {
  return "\n"+"S"+","+super.toString() + ","+Target + ","+ Territory;
  }

}