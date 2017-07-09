import java.util.*;

public class UseCompany
{
   
   public static void main(String[] args)
{
      Employee[] myCompany = new Employee[6];
      LinkedList ll = new LinkedList();
      myCompany[0] = new SalesMan();
      myCompany[1]= new Technician();
   
      myCompany[2] = new SalesMan(1002, "Bob", 5000, "Alberta");
      myCompany[3] = new SalesMan(1009, "Inmojo", 4000, "British Columbia");
      myCompany[4] = new Technician(1008, "Semjerome", 5, "Quebec");
      myCompany[5] = new Technician(1004, "Jake", 3, "Manitoba");
      
      
      for(int a=0;a < myCompany.length;a++)
      {
         ll.add(myCompany[a]);
      }
      
      Company.sortList(ll);
      Company.displayInfo(ll);
      Company.addEmployee(ll);
      Company.displayInfo(ll);
       
      Company.sortList(ll);   



}
}