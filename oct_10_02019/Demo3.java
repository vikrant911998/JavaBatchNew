package oct_10_02019;

public class Demo3 {

	public static void main(String[] args) {
		
		int a = 120;
		
		final int b = 10;
	
		switch(a*2) {
		
		case 15:System.out.println("value 15");
		break;
		case b+1:System.out.println("value 10");
		break;
		default:System.out.println("default");
		}

	}

}
