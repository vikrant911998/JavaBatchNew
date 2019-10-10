package oct_9_02019;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a % 5 == 0) {
			System.out.println("Number divisible by 5");
		}
		else {
			System.out.println("Number Not divisible by 5");
		}

	}

}
