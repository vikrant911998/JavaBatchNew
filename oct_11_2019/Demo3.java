package oct_11_2019;

public class Demo3 {

	public static void main(String[] args) {
		
		int n = 3142;
		int sum = 0;
		int reverse = 0;
		
		while(n != 0) {
			int temp = n%10;
			reverse = reverse*10 + temp;//24*10 +1=241
			n = n/10;
			
		}
		System.out.println("Reverese : "+reverse);
		
		
//		while(n != 0) {
//			int temp = n%10;//3
//			sum = sum+temp;//2+4+1+3
//			n = n/10;//0
//			
//		}
		System.out.println("Sum : "+sum);
		
//		System.out.println(n%10);
//		System.out.println(n/10);

	}

}
