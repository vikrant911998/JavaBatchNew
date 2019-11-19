package com.student.los.operation;

import java.util.ArrayList;

import com.student.los.customer.Customer;
import com.student.los.customer.LoanInformation;
import com.student.los.customer.PersonalInformation;
import com.student.los.utils.CommonConstants;
import com.student.los.utils.StageConstants;
import com.student.los.utils.Utility;

public class LOSProcess implements StageConstants,CommonConstants {
	
	ArrayList<Customer> list = new ArrayList<Customer>();
	
	public void sourcing() {
		
		Customer customer = new Customer();
		customer.setApplicationId(Utility.applicationId);
		
		
		Utility.applicationId++;
		
		customer.setStage(SOURCING);
		
		PersonalInformation personal = new PersonalInformation();
		
		System.out.println("Enter the FirstName");
		personal.setFirstName( Utility.scanner.next() );
		
		System.out.println("Enter the LastName");
		personal.setLastName( Utility.scanner.next() );
		
		System.out.println("Enter the age");
		personal.setAge(Utility.scanner.nextInt());
		
		System.out.println("Enter the Gender");
		personal.setGender(Utility.scanner.next());
		
		System.out.println("Enter the mobile number");
		personal.setMobile(Utility.scanner.nextLong());
		
		System.out.println("Enter the EmailId");
		personal.setEmail(Utility.scanner.next());
		
		customer.setPersonal(personal);
		
		
		LoanInformation loanInformation = new LoanInformation();
		
		System.out.println("Enter the Loan Type : HL,AL,PL,EL");
		loanInformation.setType(Utility.scanner.next());
		
		System.out.println("Enter the Loan Amount");
		loanInformation.setLoanAmount(Utility.scanner.nextDouble());
		
		System.out.println("Enter the Loan Duration");
		loanInformation.setDuration(Utility.scanner.nextInt());
		
		customer.setLoanInformation(loanInformation);
		
		list.add(customer);
		
		System.out.println(list);
		
		System.out.println("Sourcing Done");
		
		
	}
	
	public void qde(Customer customer) {
		
	}
	
	public void moveToNextStage(Customer customer) {
		
		if(customer.getStage() == SOURCING) {
			char choice;
			
			System.out.println("Do you want to move to the next Stage");
			choice = Utility.scanner.next().toUpperCase().charAt(0);
			//yes-> YES ->Y
			
			if(choice == YES) {
				qde(customer);
			}
			else {
				return;
			}
		}
		
		
	}
	
	
	public void checkStage(int applicationNumber) {
		
		boolean isStageFound = false;
		
		for(Customer customer: list) {
			
			if(customer.getApplicationId() == applicationNumber) {
				System.out.println("Customer application Id is"
						+ " "+customer.getApplicationId());
				isStageFound = true;
				
				System.out.println("You are on "
						+ ""+Utility.getStageName(customer.getStage())
						+" Stage.");
				
			}
			
			moveToNextStage(customer);
		}
		
		if(!isStageFound) {
			
			System.out.println("Invalid Application Number");
		}
	}

}
