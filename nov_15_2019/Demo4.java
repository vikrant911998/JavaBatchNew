package nov_15_2019;

public class Demo4 {

	public static void main(String[] args) {
		
		String s = new String("Hello");
		int n = 100000;
		long t = System.currentTimeMillis();
		
		for(int i=1;i<=n;i++) {
			s.concat("hi");
		}
		
		System.out.println(System.currentTimeMillis() -t);
		
		
		
		StringBuffer sb1 = new StringBuffer("Hello");
//		int n = 100000;
		long t1 = System.currentTimeMillis();
		
		for(int i=1;i<=n;i++) {
			sb1.append("hi");
		}
		
		System.out.println(System.currentTimeMillis() -t1);
		
		
		StringBuilder sb2 = new StringBuilder("Hello");
//		int n = 100000;
		long t2 = System.currentTimeMillis();
		
		for(int i=1;i<=n;i++) {
			sb2.append("hi");
		}
		
		System.out.println(System.currentTimeMillis() -t2);
	}

}
