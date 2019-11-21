package com.student.los.customer;

public class Customer {
	
	private PersonalInformation personal;
	private LoanInformation loanInformation;
	private Address address;
	private int applicationId;
	private int stage;
	private double income;
	private double liability;
	private String remarks;
	
	
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getLiability() {
		return liability;
	}
	public void setLiability(double liability) {
		this.liability = liability;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	public PersonalInformation getPersonal() {
		return personal;
	}
	public void setPersonal(PersonalInformation personal) {
		this.personal = personal;
	}
	public LoanInformation getLoanInformation() {
		return loanInformation;
	}
	public void setLoanInformation(LoanInformation loanInformation) {
		this.loanInformation = loanInformation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	
	
}
