package nov_11_2019;

import java.util.Scanner;

public class TestAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		
		Average obj= new Average(sc.nextInt()
				, sc.nextInt(), sc.nextInt());
		
		obj.calculate();

	}

}
