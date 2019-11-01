package oct_31_2019;


class Bank1{
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

	public Bank1(String name, int acc_no) {
		this.name = name;
		this.acc_no = acc_no;
	}
	
	public String toString() {
		System.out.println("toString Called");
		return "Name :"+this.name+"  Account : "+this.acc_no;
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
	
		Bank1 obj = new Bank1("SBI", 1000);
		
		System.out.println(obj);

	}

	

}


