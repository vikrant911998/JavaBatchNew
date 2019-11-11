package nov_11_2019;

public class Average {
	
	//instance variable
	private int a,b,c;
	
	public Average(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
	}
	
	public void calculate() {
		int avg = (a+b+c)/3;
		System.out.println("Average : "+avg);
	}
	
}
