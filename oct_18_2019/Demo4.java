package oct_18_2019;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		Scanner sc  = new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the element");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		System.out.println("Enter the number");
		int number  = sc.nextInt();
		
		for(int i=5;i>index;i--) {
			
			a[i] = a[i-1];
		}
		a[index] = number;
		
		
		for(int s:a) {
			System.out.println(s);
		}
		

	}

}
