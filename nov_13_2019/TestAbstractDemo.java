package nov_13_2019;

public class TestAbstractDemo {

	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		
		obj.input();
		System.out.println("ID : "+obj.getId());
		System.out.println("Name : "+obj.getName());
		obj.roi();
		obj.withdrawLimit();

	}

}
