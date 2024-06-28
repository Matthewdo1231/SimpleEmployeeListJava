package Main;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class StartOperation {
	      int currentOperation = 0;
		  public void startProgram() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		
			     Scanner scanner = new Scanner(System.in);
			     System.out.println("Press ('1') key to add more employee");
			     System.out.println("Press ('2') to show all employees");
			     System.out.println("Press ('3') to play Nirvana");
				 currentOperation = scanner.nextInt();	
				 scanner.nextLine();
			     
				 switch(currentOperation) {
				 case 1: 
					 Employee employee = new Employee();
					 employee.addEmployee();
				     break;
				 case 2:
					 Employee employees = new Employee();
					 employees.displayAllEmployee();
					 break;
				 case 3:
					 PlayNirvana nirvana = new PlayNirvana();
					 nirvana.playNirvana();
					 break;	 
				 }
				 scanner.close();
			 }
		  
		  
		   public void promptMenu() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
			    Employee employee = new Employee();
			    Scanner scanner = new Scanner(System.in);
			    System.out.println("Do you want to add more Employee Press 'Y' for Yes, 'N' for No");
	            char prompt = scanner.next().charAt(0);
			    if(prompt == 'Y') {
	            	 employee.clearScreen();
	            	 employee.addEmployee();
	             }
	             else {
	            	employee.clearScreen();
	            	this.startProgram();
	             }
			    scanner.close();
		   }
		   
		
	  }
		