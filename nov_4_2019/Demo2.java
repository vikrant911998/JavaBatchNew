package nov_4_2019;

import java.util.Scanner;

class Employee{
	private String name;
	private int year;
	private String address;
	
	
	public void input() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the employee name");
		this.name =  sc.nextLine();
		
//		System.out.println("Enter the year of joining");
//		this.year = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("Enter the address");
//		this.address = sc.nextLine();
	}
	
	public void output() {
		System.out.println("Name : "+this.name);
//		System.out.println("Year : "+this.year);
//		System.out.println("Address : "+this.address);
	}
	
	public String toString() {
		return "Name : "+name+" year : "+year+" Address : "+address;
	}
}



public class Demo2 {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.input();
		obj.output();

	}

}
