package oct_16_2019;

import java.util.Scanner;

public class Demo3 {
	
	//with return type but no arguments
	static double takeSalary() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the basic Salary");
		double bs = sc.nextDouble();//bs = 10500.0
		
		return bs;//return 10500.0;
	}
	
	//with return type and with arguments
	static double hra(double bs) {
		double d = bs*0.30;
		return d;
	}
	
	static double netSalary(double bs,double hra,double ta,double da,int pf) {
		
		double ns = bs+hra+da+ta-pf;
		
		return ns;
	}
	
	public static void main(String[] args) {
		int PF = 1400;
		
		double basicSalary = takeSalary();
		System.out.println("Basic Salary : "+basicSalary);
		
		double h = hra(basicSalary);
		
		double ns = netSalary(basicSalary,h,d,t,PF); 
		
		System.out.println("Net salary : "+ns);
		
	}

}
