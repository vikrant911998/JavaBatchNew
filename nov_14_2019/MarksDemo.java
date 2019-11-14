package nov_14_2019;

abstract class Marks{
	
	abstract int getPercentage();
}

class A extends Marks{
	int s1,s2,s3;
	
	public A(int s1,int s2, int s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	@Override
	int getPercentage() {
		
		return (s1+s2+s3)/3;
	}
	
}




public class MarksDemo {
	
	public static void main(String[] args) {
		
		A obj = new A(75, 60, 72);
		System.out.println("Percentage of A = "+obj.getPercentage());
		
	}
}
