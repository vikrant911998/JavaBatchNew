package oct_24_2019;

import java.util.Scanner;

//OOAD->object oriented analysis and design
//OOPS
//SOLID
//SRP - single responsibility principle
//DRY - Don't repeat yourself

//Access Specifiers
//1.private
//2.public
//3.protected
//4.default


class Employee{
	private int empid;//data security,data hiding,encapsulation
	private String empname;
	private byte empage;
	
//	void input(int empid, String empname,byte age) {
//		this.empid  = empid;
//		this.empname = empname;
//		this.age = age;
//	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee id");
		this.empid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee name");
		this.empname = sc.nextLine();
		
		System.out.println("Enter the employee age");
		this.empage = sc.nextByte();
	}
	
	void display() {
		System.out.println("Id : "+this.empid);
		System.out.println("Name : "+this.empname);
		System.out.println("Age : "+this.empage);
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Employee obj = new Employee();//obj->(empid,empname,age)-77
		Employee obj1 = new Employee(); 
		
//		obj.empid = 101;
//		obj.empname = "Vikrant singh";
//		obj.age = 23;
//		
//		obj1.empid = 102;
//		obj1.empname = "Vikas singh";
//		obj1.age = 25;
		
//		obj.input(101, "Vikrant ", (byte)23);
//		obj1.input(102, "Vikas ", (byte)25);
		
		//obj.empid = -50;//->data security breach
//		obj.salary = -456;
		
		obj.input();
		obj1.input();
		
		obj.display();
		System.out.println();
		obj1.display();
		
		
//		System.out.println("Id : "+obj.empid);
//		System.out.println("Name : "+obj.empname);
//		System.out.println("Age : "+obj.age);
//		
//		System.out.println();
//		
//		System.out.println("Id : "+obj1.empid);
//		System.out.println("Name : "+obj1.empname);
//		System.out.println("Age : "+obj1.age);

	}

}
