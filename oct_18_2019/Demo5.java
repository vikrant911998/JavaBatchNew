package oct_18_2019;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc  = new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		
		
		for(int i=index;i<a.length-1;i++) {
			
			a[i] = a[i+1];
		}
		
		a[a.length-1] = 0;
		
		
		for(int s:a) {
			System.out.println(s);
		}

	}

}
