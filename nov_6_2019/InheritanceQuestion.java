package nov_6_2019;

class Parent{
	
	public void print() {
		System.out.println("This is Parent Class");
	}
}


class Child extends Parent{
	
	public void display() {
		System.out.println("This is Child Class");
		
	}
}

public class InheritanceQuestion {

	public static void main(String[] args) {
		
		Parent obj = new Parent();
		
		Child obj1 = new Child();
		
		obj.print();
		obj1.display();
		obj1.print();
		
	}

}
