package nov_11_2019;

import java.util.Scanner;

public class Matrix {
	private int rows;
	private int columns;
	private int elements[][];
	
	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}
	
	
	public Matrix(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		
		this.elements = new int[rows][columns];
	}
	
	public void setElements() {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<columns;j++) {
				
				System.out.println("Enter the element");
				elements[i][j] = sc.nextInt();
			}
			
		}
	}
	
	public void printMatrix() {
		
		for(int i=0;i<rows;i++) {
			System.out.print("[ ");
			for(int j=0;j<columns;j++) {
				
				System.out.print(elements[i][j]+" ");
			}
			System.out.println("]");
		}
	}
	
	
}
