package nov_21_2019;

class A{
	protected int child;
	private int parent;
	
	public A(){
		parent= 20;
		child= 30;
		System.out.println("A default constructor Called");
	}
}

class B extends A{
	public B() {
		System.out.println("B default constructor called");
	}
	
	public void show() {
		System.out.println("CHild value is "+this.child);
	}
}

class C extends B{
	
}

public class ProtectedDemo {
	
	public static void main(String[] args) {
		
		B obj = new B();
		
		System.out.println(obj.child);
		
		C obj1 = new C();
		System.out.println(obj1.child);
	}
}
