package nov_15_2019;

class A{
	
	A(){
		
		Nested obj ;
		
	}
	class Nested{
		int a;
		public Nested(int a) {
			this.a = a;
		}
	}
	
	class Nested1{
		
		class Nested2{
			
		}
	}
	
}




public class Demo5 {

	public static void main(String[] args) {
		
		Demo5 obj = new Demo5();
//		Nested obj1 = new Nested(2);
		A obj1 = new A();
		
	}

}
