package oct7_02019;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the three sides of the triangle");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println("Equilateral");
		}
		else if(a==b || b==c || c==a) {
			System.out.println("Isoceles");
		} 
		else {
			System.out.println("Scalene");
		}
 
	}

}
