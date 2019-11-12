package nov_12_2019;

class A{
	int a;
	
	public A(){
		a = 24;
		System.out.println("Default constructor of Class A");
	}
	
	public A(int a,int b){
		System.out.println("Parameter Constructor of Class A");
	}
}

class B extends A{
	
	int b;
	public B(){
//		System.out.println();
		super();//It should be the first line of child constructor.
		b = 34;
		System.out.println("Default constructor of Class B");
		System.out.println("Value of A is "+super.a);//A.a
		System.out.println("Value of B is "+this.b);
	}
	
	public B(int a) {
		super();//A();
		System.out.println("Parameter Constructor of Class B");
	}
	
}

class C extends B{
	public C(){
		System.out.println("A's value is "+super.b);
	}
}



public class CostructorChainingDemo {

	public static void main(String[] args) {
		C obj = new C();
		System.out.println("OBJ :"+obj.a);

	}

}
