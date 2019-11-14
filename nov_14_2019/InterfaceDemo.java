package nov_14_2019;

interface Standard{
	final int DEMO_ID = 101;
	final String STR="INTERFACE";
	void play(int id);//abstract method.
}

interface Standard1{
	//method declaration.
	void play(int id);
}

abstract class Demo1 {
	int ID = 101;
}
class Demo extends Demo1 implements Standard, Standard1 {

	@Override
	public void play(int id) {
		ID = 102;
		if(id == DEMO_ID) {
			System.out.println("ID is equal to DEMO_ID");
		}
		
	}
	
}



public class InterfaceDemo {

	public static void main(String[] args) {
		


	}

}
