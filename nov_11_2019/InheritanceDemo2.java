package nov_11_2019;


//Multi-Level Inheritance

class A{
	
	public void play() {
		System.out.println("Play of Class A");
	}
	
}

class B extends C{
	
	public void play1() {
		System.out.println("Play of Class B");
	}
	
}

class C extends A{
	
	public void play2() {
		System.out.println("Play of Class C");
	}
	
}


public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.play();
		
		B obj1 = new B();
		obj1.play();
		obj1.play1();
		
		C obj2 = new C();
		obj2.play2();
		
		
		
		
		
//		Student obj = new Student();
//		
//		Student obj1 = new Student();
//		
//		Student obj2 = new Student();
//		
//		Student obj3 = new Student();
//		
//		Student obj4 = new Student();
//		
//		new Student();
//		new Student();

	}

}
