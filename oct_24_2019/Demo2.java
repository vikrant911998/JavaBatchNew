package oct_24_2019;

import java.util.Scanner;


class Employee1{
	private int empid;
	private String empname;
	private byte empage;
	
	//Default constructor
	public Employee1(){
		System.out.println("Default constructor");
		this.empid = 0;
		this.empname = "Unknown";
		this.empage = 0;
	}
	
	//parameterised constructor
	public Employee1(int empid,String empname,byte empage){
		System.out.println("Parameterised Constructor");
		this.empid = empid;
		this.empname = empname;
		this.empage = empage;
	}
	
	public Employee1(int empid){
		this.empid = empid;
	}
	
	
	
	
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


public class Demo2 {

	public static void main(String[] args) {
		
		Employee1 obj = new Employee1();//Constructor
		Employee1 obj1 = new Employee1(102,"Vikas ",(byte)25); 
		
//		obj.input();
//		obj1.input();
		
		obj.display();
		System.out.println();
		obj1.display();


	}

}

