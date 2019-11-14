package nov_14_2019;

class Common implements CommonConstants{

	@Override
	public void display() {
		System.out.println("Display of Common");
		
	}
	
}


public class TestFunctionalInterface {

	public static void main(String[] args) {
		CommonConstants obj = ()->{
			System.out.println("Lambda expression");
			System.out.println("Multiline Expression");
		};
		obj.display();
		
		Common obj1 = new Common();
		obj1.display();
	}

}
