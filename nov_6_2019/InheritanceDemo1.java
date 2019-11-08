package nov_6_2019;


class Account extends Object {
	private int id;
	private String name;
	private double balance;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void roi() {
		System.out.println("Parent roi");
	}
	
	public void withdrawLimit() {
		System.out.println("Parent withdraw");
	}
	
	public void minimumAmount() {
		System.out.println("Parent amount");
	}
	
	//Function Overriding
//	@Override //annotations
//	public String toString() {
//		return "Name :"+this.name
//				+"\n"
//				+ "Id : "+this.id+"\nBalance: "+this.balance;
//	}
	
	
	
}

class SavingAccount extends Account{
	
	@Override
	public void roi() {
		System.out.println("Saving Account ROI is 3%");
	}
	
}





public class InheritanceDemo1 {

	public static void main(String[] args) {
//		Account obj = new Account();
//		obj.setId(101);
//		obj.setName("Vikrant");
//		obj.setBalance(1000);
//		
//		System.out.println(obj);
		
		SavingAccount obj = new SavingAccount();
		obj.roi();
		obj.withdrawLimit();
		

	}

}
