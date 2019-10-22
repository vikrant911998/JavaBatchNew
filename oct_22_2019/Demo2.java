package oct_22_2019;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;



public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee id ");
		int empid = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the address");
		String address = sc.nextLine();
		
		System.out.println("Enter the salary ");
		double salary = sc.nextDouble();
		
		Locale locale = new Locale("hi");
		NumberFormat  nf = NumberFormat.getInstance(locale);
		
		String formattedSalary = nf.format(salary);
		
		System.out.println("ID : "+empid);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+formattedSalary);
		
		
		
		sc.close();
	}

}








//13,345,560.00
//13 345 560,00

////variable -->input buffer -->keyboard
//id = 101
//\n(input buffer)






