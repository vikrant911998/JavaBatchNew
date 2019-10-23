package oct_23_2019;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Demo1 {

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
		
		Locale locale = new Locale("he","IL");
		NumberFormat  nf = NumberFormat.getCurrencyInstance(locale);
		
		String formattedSalary = nf.format(salary);
		
		Date date = new Date();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		
		String formattedDate = df.format(date);
		
		System.out.println("ID : "+empid);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+formattedSalary);
		System.out.println("Date : "+formattedDate);
		
		
		
		sc.close();
	}
}
