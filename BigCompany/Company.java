import java.io.*;
import java.util.*;


public class Company
{
/*
it sorts the list based on employee number
*/
public static void sortList(LinkedList e)
{
      
   Collections.sort(e);
   
    for(int count=0;count<e.size();count++)
   {
      System.out.println(e.get(count));
   }     
}
/**   
display the Employee info based on employee number number
*/
public static void displayInfo(LinkedList list)
{
   int vin =1002;
   boolean valid = false;
   Scanner in = new Scanner(System.in);
   while(valid!=true)
   {
      System.out.println("Enter a valid VIN to display information: ");
      vin = in.nextInt();
      for(int a=0;a<list.size();a++)
      {
         if(((Employee)(list.get(a))).getNumber()==vin)
         {
            System.out.println(list.get(a));
            valid = true;
         }
      }
   }   

} 

/*
It adds new Employee data into the linkedList
 */
public static void addEmployee(String t, int v, String n, String ter, int lvl, double tar, LinkedList ll)
{    
      Employee employed[] = new Employee[1];    
      if(t=="T")
      {
      employed[0] = new Technician(v, n, lvl, ter);
      }
      if(t=="S")
      {
        employed[0] = new SalesMan(v, n, tar, ter);
      }
      ll.add(employed[0]);
   }
/*
It deletes Employee information based on Employeed number that is given
*/
 public static void deleteEmployee(int vin, LinkedList list)    
{
      for(int a=0;a<list.size();a++)
      {
         if(((Employee)(list.get(a))).getNumber()==vin)
         {
            list.remove(a);
           
         }

} 
}
/*
it reset the data into the orgiginal data
*/
public static void reset(LinkedList ol, LinkedList cl)
{
   ol.clear();
   for(int a =0; a<cl.size(); a++)
   {
   ol.add(cl.get(a));
   }
} 

}