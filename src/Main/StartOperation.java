package Main;

import java.util.Scanner;

public class StartOperation {
	      int currentOperation = 0;
		  public void startProgram() {
		
			     Scanner scanner = new Scanner(System.in);
			     System.out.println("Press ('1') key to add more employee");
			     System.out.println("Press ('2') to show all employees");
				 currentOperation = scanner.nextInt();	
				 scanner.nextLine();
			     
				 switch(currentOperation) {
				 case 1: 
					 this.addEmployee();
				     break;
				 case 2:
					 Employee employees = new Employee();
					 employees.displayAllEmployee();
					 break;
				 }
			 }
		  
		     public void addEmployee() {
		    	 Scanner scanner = new Scanner(System.in);
		    	 Employee employee = new Employee();
				 
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
				 
	             employee.addEmployee(employee);
	             System.out.println("Entry Succesfully Added");
	            
	             System.out.println("Do you want to add more Employee Press 'Y' for Yes, 'N' for No");
	             char prompt = scanner.next().charAt(0);
	             if(prompt == 'Y') {
	            	 this.addEmployee();
	             }
	             else {
	            	this.startProgram();
	             }
		     }
		  
		  
	  }
		