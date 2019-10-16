package oct_16_2019;

import java.util.Scanner;

public class Demo2 {

	//no return type but with arguments
	static void add(int x, int y) {
		System.out.println("Sum :"+(x+y));
	}
	
	public static void main(String[] args) {
		int a=0,b=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a= sc.nextInt();
		b= sc.nextInt();
		
		//function calling
		add(a,b);

	}

}
