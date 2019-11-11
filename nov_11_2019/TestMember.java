package nov_11_2019;

import java.util.Scanner;

class Member{
	private String name;
	private int age;
	private double salary;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		this.name = sc.nextLine();
		
		System.out.println("Enter the age");
		this.age = sc.nextInt();
		
		System.out.println("Enter the salary");
		this.salary = sc.nextDouble();
	}
	
	public void output() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Salary : "+this.salary);
	}
}


class Employee extends Member{
	private String specialization;
	private String department;
	
	public Employee(String specialization, String department) {
			this.department = department;
			this.specialization = specialization;
	}
	
	public void display() {
		System.out.println("Department : "+this.department);
		System.out.println("Specialization : "+this.specialization);
	}
}




public class TestMember {

	public static void main(String[] args) {
			
		Employee obj = new Employee("FrontEnd", "IT");
		obj.input();
		System.out.println();
		obj.output();
		obj.display();

	}

}
