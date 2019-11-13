package nov_13_2019;

import java.util.Scanner;

public class HDFC extends Bank {

	@Override
	void roi() {
		
		System.out.println("Rate of Interest of HDFC Bank is 5%");
	}

	@Override
	void withdrawLimit() {
		System.out.println("HDFC Bank withdraw limit is 20000$");
		
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the BankID");
		this.setId(sc.nextInt());
		
		System.out.println("Enter the BankName");
		this.setName(sc.next());
		
	}
	
	

}
