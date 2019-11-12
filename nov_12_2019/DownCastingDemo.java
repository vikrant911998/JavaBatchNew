package nov_12_2019;

public class DownCastingDemo {

	public static void main(String[] args) {
		Parent obj =  new Child(); //Upcasting
		
		obj.increaseCounter();
		obj.display();
		char c = 'A';
		
		int code = (int)c;//Casting
		
		Child obj1 = (Child)obj; //Downcasting
		
		obj1.increaseCounter();
		obj1.increase();
		obj1.display();
		obj1.show();
		

	}

}
