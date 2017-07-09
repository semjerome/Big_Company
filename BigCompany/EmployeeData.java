import java.util.*;
/*
HardCoded Data
*/
final class EmployeeData {
private static Employee[] myCompany = new Employee[6];
private static LinkedList ll = new LinkedList();
private static final EmployeeData uniqueInstance = new EmployeeData(); 
 EmployeeData(){

      myCompany[0] = new SalesMan();
      myCompany[1]= new Technician();   
      myCompany[2] = new SalesMan(1002, "Bob", 5000, "Alberta");
      myCompany[3] = new SalesMan(1003, "Inmojo", 4000, "British Columbia");
      myCompany[4] = new Technician(1009, "Semjerome", 5, "Quebec");
      myCompany[5] = new Technician(1006, "Jake", 3, "Manitoba");
        for(int a=0;a < myCompany.length;a++)
      {
         ll.add(myCompany[a]);
      }
  }  
static EmployeeData getInstance(){ return uniqueInstance;}
static LinkedList getData(){ return ll;}
}

