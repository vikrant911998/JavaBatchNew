package oct_10_02019;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		String s;
		
		System.out.println("Enter a character");
		Scanner sc  = new Scanner(System.in);
		s = sc.next();
		char c = s.toCharArray()[1];
		
		switch(c) {
		
			case 'A':System.out.println("Vowel");
				break;
			case 'E':System.out.println("Vowel");
			break;
			case 'I':System.out.println("Vowel");
			break;
			case 'O':System.out.println("Vowel");
			break;
			case 'U':System.out.println("Vowel");
			break;
			default:System.out.println("Consonant");
			break;
		
		}
		

	}

}
