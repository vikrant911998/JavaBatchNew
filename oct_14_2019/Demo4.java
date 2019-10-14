package oct_14_2019;

public class Demo4 {

	public static void main(String[] args) {
		
		int sum = 0;
		int j=1;
		
		do {
			sum = sum+j;
			j++;
		}while(j<=10);
		
		
		for(int i=1;i<=10;i++) {
			
			sum = sum+i; //6
		}
		
		System.out.println("Sum : "+sum);

	}

}
