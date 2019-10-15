package oct_15_2019;

public class Demo1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(j>=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
		
		
		
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=5;j++) {
//				
//				if(j<6-i) {
//					System.out.print("  ");
//				}
//				else {
//					System.out.print("* ");
//				}
//				
//			}
//			System.out.println();
//			
//		}

	}

}
