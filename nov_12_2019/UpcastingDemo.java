package nov_12_2019;

class Parent{
	private int counter;
	
	public void increaseCounter() {
		counter++;
	}
	
	void display() {
		System.out.println("Counter :  "+counter);
	}
}


class Child extends Parent{
	private int counter1;
	
	void increase() {
		counter1++;
	}
	
	void show() {
		System.out.println("Counter1 : "+counter1++);
	}
}



public class UpcastingDemo {

	public static void main(String[] args) {
		
//		Child obj = new Child();
		Parent obj = new Child();// Upcasting
		
		obj.increaseCounter();
		obj.increaseCounter();
		obj.increaseCounter();
		
		obj.increaseCounter();
		obj.increaseCounter();
		obj.increaseCounter();
		
		obj.display();
		
//		obj.increase();
//		obj.increase();
//		
//		obj.increase();
//		obj.increase();
//		obj.increase();
//		obj.increase();
//		
//		obj.show();

	}

}
