package oct_15_2019;

import java.util.Scanner;

public class Demo2 {
	
	
	
	public static void main(String[] args) {
		//function calling
		add();
		
	}
	
	//function definition
		static void add() {
			Scanner s = new Scanner(System.in);
			System.out.println("enter two numbers");
			int a = s.nextInt();

			int b = s.nextInt();
			System.out.println("A+B : "+(a+b));
			return ;
		}
		 

}
