package oct_18_2019;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int[]  a = {12,41,51,14,26,37};//Integer
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number\n");
		int k = sc.nextInt();
		boolean flag = false;
		
		
//		System.out.println(a.length);
//		for(int i=0;i<a.length;i = i+2) {
//			System.out.println(a[i]);
//		}
		
		for(int num:a) {
			if(k == num) {
				flag = true;
				System.out.println("Number Found");
			}
			
		}
		
		if(flag == false) {
			System.out.println("Number not Found");
		}

	}

}
