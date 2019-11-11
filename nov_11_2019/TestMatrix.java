package nov_11_2019;

import java.util.Scanner;

public class TestMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows and columns");
		
		Matrix obj = new Matrix(sc.nextInt(), sc.nextInt());
		
		obj.setElements();
		obj.printMatrix();

	}

}
