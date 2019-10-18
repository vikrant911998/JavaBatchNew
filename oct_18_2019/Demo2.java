package oct_18_2019;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		int[]  a = {12,41,51,14,26,37};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number\n");
		int k = sc.nextInt();
		
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			
			if(a[i] == k) {
				flag = true;
				a[i] = 100;
			}	
		}
		
		if(flag == false) {
			System.out.println("Number not Found");
		}
		else {
			for(int num:a) {
				System.out.print(num +" ");
			}

		}
		
		
	}

}
