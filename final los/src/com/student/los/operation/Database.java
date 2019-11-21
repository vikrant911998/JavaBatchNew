package com.student.los.operation;

import java.util.ArrayList;

import com.student.los.customer.Customer;
import com.student.los.customer.PersonalInformation;

public interface Database {
	ArrayList<Customer> negative = new ArrayList<Customer>();
	
	public static ArrayList<Customer> getNegativeCustomers(){
		Customer customer = new Customer();
		customer.setApplicationId(101);
		
		PersonalInformation personal = new PersonalInformation();
		personal.setFirstName("vikas");
		personal.setLastName("singh");
		personal.setAadhar(451234564);
		personal.setEmail("vikas@gmail.com");
		
		customer.setPersonal(personal);
		
		negative.add(customer);
		
		
		customer = new Customer();
		
		customer.setApplicationId(102);
		
		personal = new PersonalInformation();
		personal.setFirstName("vicky");
		personal.setLastName("singh");
		personal.setAadhar(453454564);
		personal.setEmail("vicky@gmail.com");
		
		customer.setPersonal(personal);
		
		negative.add(customer);
		
		return negative;
		
	}
}
