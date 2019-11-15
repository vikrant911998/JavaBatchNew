package nov_15_2019;

public class Demo2 {

	public static void main(String[] args) {
		String s1 = "Brain";
		
		
		String s3 = new String("Brain");
		String s2 = "Brain";
		String s4 = new String("Brain");
		
//		if(s4.equals(s3)) {
		if(s2 == s3) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}

	}

}
