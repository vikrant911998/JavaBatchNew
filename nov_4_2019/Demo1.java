package nov_4_2019;

import java.util.Scanner;

class Area{
	private int length;
	private int breadth;
	
	public void setDim(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
		return	length*breadth;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Area obj = new Area();
		
		System.out.println("Enter the length and breadth");
//		int length = sc.nextInt();
//		int breadth = sc.nextInt();
		
		
//		obj.setDim(length, breadth);
		obj.setDim(sc.nextInt(), sc.nextInt());
		System.out.println("Area : "+obj.getArea());
	}

}





