package nov_1_2019;

//Function Overloading

class Account{
	private int id;
	private String name;
	private String type;
	
	public void Account(){
		System.out.println("Account Function");
	}
	
	public void fillDetail(int id){
		System.out.println("Single ID fill Detail Function");
	}
	
	public void fillDetail() {
		System.out.println("Blank Argument fill Detail Function");
	}
	
	public void fillDetail(int id, String name ) {
		System.out.println("Id and Name Fill detail Function");
	}
	
	public void fillDetail(int id, String name,String type) {
		System.out.println("3 Variable fillDetail Function");
	}
	
	public void fillDetail(String name,String ...arg) {
//		System.out.println("args method function overloading :"+arg);
		System.out.println(name);
		for(String i:arg) {
			System.out.println(i);
		}
	}
	
}


public class Demo1 {

	public static void main(String ...args) {
		Account obj = new Account();
		
		obj.fillDetail("vikrant","one","two","three");
		obj.Account();

	}

}
