package nov_13_2019;

abstract class Bank{
	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	//abstract method declaration.
	abstract void roi();
	
	abstract void withdrawLimit();
	
	
	
}

//class HDFC extends Bank{
//	
//	
//
////	@Override
//	void roi(int a) {
//		
//		
//	}
//
//	@Override
//	void roi() {
//		
//		int a;
//		
//	}
//	
//}


public class AbstractDemo {

	public static void main(String[] args) {
		
//		Bank obj = new Bank();

	}

}
