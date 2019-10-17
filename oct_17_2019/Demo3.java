package oct_17_2019;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the element");
			a[i] = sc.nextInt();	
		}
		
		for(int s:a) {
			System.out.println(s);
		}

	}

}
