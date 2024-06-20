package Main;

import java.util.ArrayList;

public class Employee {
	static public ArrayList <Employee> employeeList = new ArrayList<>();
    private String employeeName;
    private int age;
    private int salary;
    private String employeeRole;
    
   public void setEmployeeName(String name) {
    	this.employeeName = name;
    }

   public String getEmployeeName() {
	   return this.employeeName;
    }

   public void setAge(int age) {
   	this.age = age;
   }

  public int getAge() {
	   return this.age;
   }
  
   public void setSalary(int salary) {
  	this.salary = salary;
  }

   public int getSalary() {
	   return this.salary;
  }
   
   public void setEmployeeRole(String role) {
	   this.employeeRole = role;
  }

   public String getEmployeeRole() {
       return this.employeeRole;
 } 

   public void addEmployee(Employee employeeInformation) {
	   employeeList.add(employeeInformation);
   } 
   
   public void displayAllEmployee() {
	   if(employeeList.isEmpty()) {
		   System.out.print("Empty");
		   StartOperation operation = new StartOperation();
		   operation.promptMenu();
	   }
	   for(Employee e : employeeList) {
		  String info = "Employee info is: "+ e.getEmployeeName() + " " + e.getAge() + " " + e.getSalary() +" " + e.getEmployeeRole();
		  this.clearScreen();
		  System.out.println(info);
	   }
   }
   
   public void clearScreen() {
	   for (int i = 0; i < 20; i++) {
	        System.out.println();
	    }
	}
   
} 