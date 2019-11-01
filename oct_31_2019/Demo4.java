package oct_31_2019;

class Employee{
	String name;
	
	public Employee() {
		this.name = "Unknown";
	}
	
	public Employee(String name) {
		this.name = name;
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Employee obj = new Employee();
		
		Employee obj1 = new Employee("vikrant");
		
		System.out.println(obj.name);
		System.out.println(obj1.name);
	}

}
