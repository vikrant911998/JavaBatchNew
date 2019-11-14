package nov_14_2019;

interface LoanConstants{
	
	//java 8
	static void play() {
		//printing or Logic
		System.out.println("Static printing method");
	}
	
	default void play1() {
		//printing or Logic
		System.out.println("default printing method");
	}
}

class Loan implements LoanConstants{
	
}



public class InterfaceDemo1 {

	public static void main(String[] args) {
		Loan obj = new Loan();
		//default method calling
		obj.play1();
		
		
		//static method calling
		LoanConstants.play();

	}

}
