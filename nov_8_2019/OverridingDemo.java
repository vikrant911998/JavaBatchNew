package nov_8_2019;



public class OverridingDemo {
	
	public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		obj.show();
		
		
		(new SavingAccount()).show();
	}
	
}
