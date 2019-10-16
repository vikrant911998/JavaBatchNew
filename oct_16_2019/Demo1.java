package oct_16_2019;

import java.util.Scanner;

//class A{
//	public static void main(String[] args) {
//		System.out.println("hello");
//	}
//}

public class Demo1 {
	
	//no return type and no arguments
	static void play() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		System.out.println("Square : "+a*a);
		
	}
	
	public static void main(String[] args) {
		
		play();
		
		

	}

}
