package oct_31_2019;


class Bank{
	private String name;
	private int acc_no;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(Integer.parseInt(name)>=0) {
			System.out.println("Invalid Change");
		}
		else {
			this.name = name;
		}
		
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public Bank(String name, int acc_no) {
		this.name = name;
		this.acc_no = acc_no;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
	
		Bank obj = new Bank("SBI", 1000);
		
		System.out.println("Name : "+obj.getName());
		System.out.println("Account : "+obj.getAcc_no());
		
//		obj.name = "-1000";
		
		obj.setName("124364");
		
		System.out.println("After change********");
		
		System.out.println("Name : "+obj.getName());
		System.out.println("Account : "+obj.getAcc_no());

	}

}
