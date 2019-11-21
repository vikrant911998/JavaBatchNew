package com.student.los.operation;

import java.util.ArrayList;

import com.student.los.customer.Customer;
import com.student.los.customer.LoanInformation;
import com.student.los.customer.PersonalInformation;
import com.student.los.utils.CommonConstants;
import com.student.los.utils.LoanConstants;
import com.student.los.utils.StageConstants;
import com.student.los.utils.Utility;

public class LOSProcess implements StageConstants,
CommonConstants, LoanConstants {
	
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
		
//		System.out.println(list);
		
		System.out.println("Sourcing Done");
		
		
	}
	
	public void qde(Customer customer) {
		
		customer.setStage(QDE);
		
		System.out.println("Name : "+
		customer.getPersonal().getFirstName()
		+" "+customer.getPersonal().getLastName());
		
		System.out.println("Application ID :"+
				customer.getApplicationId());
		
		System.out.println("Enter the PanCard Number");
		customer.getPersonal().setPancard(Utility.scanner.next());
		
		System.out.println("Enter the Aadhar Number");
		customer.getPersonal().setAadhar(Utility.scanner.nextLong());
		
		System.out.println("Enter the Income");
		customer.setIncome(Utility.scanner.nextDouble());
		
		System.out.println("Enter the Liability");
		customer.setLiability(Utility.scanner.nextDouble());
		
		
		System.out.println("QDE Done.......");
		
	}
	
	void dedupe(Customer customer) {
		
		customer.setStage(DEDUPE);
		
		boolean isNegativeFound = false;
	
		
		ArrayList<Customer> negativeList = Database.getNegativeCustomers();
		
		for(Customer negative : negativeList) {
			int negativeScore = isNegative(customer,negative);
			
			if(negativeScore >0) {
				System.out.println("You are found in "
						+ "Dedupe Check with negative "
						+ "score "+negativeScore);
				isNegativeFound = true;
				break;
			}
			
		}
		
		if(isNegativeFound) {
			
				customer.setRemarks("Reject due to negative score "
						+ "found in dedupe check");
				System.out.println(customer.getRemarks());
				customer.setStage(REJECT);
				
				return ;

		}
		else {
			System.out.println("No dedupe check FOUND");
			return ;
		}
	}
	
	public int isNegative(Customer customer,Customer negative) {
		int score=0;
		
		if(customer.getPersonal().getFirstName()
				.equals(negative.getPersonal().getFirstName())) {
			score = score +20;
		}
		
		if(customer.getApplicationId() == negative.getApplicationId()) {
			score +=20;
		}
		
		if(customer.getPersonal().getAadhar() 
				== negative.getPersonal().getAadhar()) {
			score +=20;
		}
		
		if(customer.getPersonal().getLastName()
				.equals(negative.getPersonal().getLastName())) {
			score +=20;
		}
		
		if(customer.getPersonal().getEmail()
				.equals(negative.getPersonal().getEmail())) {
			score +=20;
		}
		
		
		return score;
	}
	
	public void scoring(Customer customer) {
		customer.setStage(SCORING);
		
		int score =0;
		
		double netIncome = customer.getIncome()-customer.getLiability();
		
		if(customer.getPersonal().getAge() >=21 &&
				customer.getPersonal().getAge()<=40) {
			score +=50;
			System.out.println("You got 50 points due to Age Score");
		}
		if(netIncome >=70000) {
			score +=50;
			System.out.println("You got 50 more points due to Income Score");
		}
		
		System.out.println("Customer your score is "+score);
		customer.getLoanInformation().setScore(score);
		
	}
	
	public void approval(Customer customer) {
		customer.setStage(APPROVAL);
		
		int score = customer.getLoanInformation().getScore();
		double amount = customer.getLoanInformation().getLoanAmount();
		
		double approvedAmount = (amount*score)/100;
		
		System.out.println("Your approved amount is "+
		approvedAmount);
		
		System.out.println("Do You want to take this loan?");
		char choice = Utility.scanner.next().toUpperCase().charAt(0);
		//yes-> YES ->Y
		
		if(choice == NO) {
			customer.setStage(REJECT);
			customer.setRemarks("Customer denied the Loan "
					+ "Amount "+approvedAmount);
			System.out.println(customer.getRemarks());
			return;
		}
		else {
			showEMI(customer);
		}
		
		
	}
	
	public void showEMI(Customer customer) {
		
		if(customer.getLoanInformation().getType()
				.equals(HOME_LOAN)) {
			customer.getLoanInformation().setRoi(HOME_LOAN_ROI);
		}
		
		if(customer.getLoanInformation().getType()
				.equals(AUTO_LOAN)) {
			customer.getLoanInformation().setRoi(AUTO_LOAN_ROI);
		}
		if(customer.getLoanInformation().getType()
				.equals(EDUCATION_LOAN)) {
			customer.getLoanInformation().setRoi(EDUCATION_LOAN_ROI);
		}
		if(customer.getLoanInformation().getType()
				.equals(PERSONAL_LOAN)) {
			customer.getLoanInformation().setRoi(PERSONAL_LOAN_ROI);
		}
		
		double perMonthPrinciple = customer.
				getLoanInformation().getLoanAmount()/customer
				.getLoanInformation().getDuration();
		
		double perMonthInterest = (perMonthPrinciple*customer
				.getLoanInformation().getRoi()*
				customer.getLoanInformation().getDuration())/100;
		
		double emi = perMonthPrinciple+
				perMonthInterest;
		
		System.out.println("YOUR EMI IS "+emi);
		
	}
	
	
	
	
	public void moveToNextStage(Customer customer) {
		
		
		while(true) {
			if(customer.getStage() == SOURCING) {
				char choice;
				
				System.out.println("Do you want to move to "
						+ "the next Stage");
				choice = Utility.scanner.next().toUpperCase().charAt(0);
				//yes-> YES ->Y
				
				if(choice == YES) {
					qde(customer);
				}
				else {
					return;
				}
			}
			
			if(customer.getStage() == QDE) {
				char choice;
				
				System.out.println("Do you want to move to "
						+ "the next Stage");
				choice = Utility.scanner.next().toUpperCase().charAt(0);
				//yes-> YES ->Y
				
				if(choice == YES) {
					dedupe(customer);
				}
				else {
					return;
				}
			}
			
			
			if(customer.getStage() == DEDUPE) {
				char choice;
				
				System.out.println("Do you want to move to "
						+ "the next Stage");
				choice = Utility.scanner.next().toUpperCase().charAt(0);
				//yes-> YES ->Y
				
				if(choice == YES) {
					scoring(customer);
				}
				else {
					return;
				}
			}
			
			
			if(customer.getStage() == SCORING) {
				char choice;
				
				System.out.println("Do you want to move to "
						+ "the next Stage");
				choice = Utility.scanner.next().toUpperCase().charAt(0);
				//yes-> YES ->Y
				
				if(choice == YES) {
					approval(customer);
				}
				else {
					return;
				}
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
