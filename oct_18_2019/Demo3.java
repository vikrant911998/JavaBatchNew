package oct_18_2019;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		int[] a = {29,37,41,51,67,12,14};
		Scanner sc  = new Scanner(System.in);
		
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		if(index>a.length) {
			System.out.println("Index out of Bound");
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(i == index) {
					
					System.out.println("Element : "+a[i]);
				}
			}
		}

	}

}
