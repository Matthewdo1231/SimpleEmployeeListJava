package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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

   public void addEmployeeToList(Employee employeeInformation) {
	   employeeList.add(employeeInformation);
   } 
   
   public void addEmployee() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
  	 Scanner scanner = new Scanner(System.in);
  	 Employee employee = new Employee();
  	 StartOperation operation = new StartOperation();
		 
		 System.out.print("Enter Employee Name: ");
		 employee.setEmployeeName(scanner.nextLine());
		 
		 System.out.print("Enter Employee Age: ");
		 employee.setAge(scanner.nextInt());
		 scanner.nextLine();
		 
		 System.out.print("Enter Employee Salary: ");
		 employee.setSalary(scanner.nextInt());
		 scanner.nextLine();
		 
		 System.out.println("Enter Employee EmployeeRole: ");
		 employee.setEmployeeRole(scanner.nextLine());
		 
       employee.addEmployeeToList(employee);
       System.out.println("Entry Succesfully Added");
      
       operation.promptMenu();
       
       scanner.close();
       
   }
   
   public void displayAllEmployee() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	   StartOperation operation = new StartOperation();
	   if(employeeList.isEmpty()) {
		   System.out.print("Empty");
	   }
	   for(Employee e : employeeList) {
		  String info = "Employee info is: "+ e.getEmployeeName() + " " + e.getAge() + " " + e.getSalary() +" " + e.getEmployeeRole();
		  this.clearScreen();
		  System.out.println(info);
	   }
	   operation.promptMenu();
   }
   
   public void clearScreen() {
	   for (int i = 0; i < 20; i++) {
	        System.out.println();
	    }
	}
   
} 