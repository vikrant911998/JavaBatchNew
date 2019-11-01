package oct_31_2019;


class Student{
	//instance variable
	int rollno;
	String name;
	
	//Default constructor
	public Student(){
		rollno = 0;
		name = "";
		
	}
	
	//Parameter Constructor
	public Student(int rollno,String name) {//parameter values
		this.rollno = rollno;//assignment to the instance variable.
		this.name = name;
	}
	public Student(String name,int rollno) {//parameter values
		this.rollno = rollno;//assignment to the instance variable.
		this.name = name;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
		Student ram = new Student();//default
		
		Student shyam = new Student(23,"vikrant");//parameter
		
//		Car obj = new Car();
		
		
	}

}
