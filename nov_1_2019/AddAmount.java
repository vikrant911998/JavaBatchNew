package nov_1_2019;

public class AddAmount {
	private int amount=50;
	
	public AddAmount() {
		System.out.println("Amount is "+this.amount);
		
	}
	public AddAmount(int amount) {
		this.amount = this.amount + amount;
		System.out.println("Amount is "+this.amount);
	}
	
}
