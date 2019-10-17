package oct_17_2019;

public class Demo1 {

	public static void main(String[] args) {
		
		
		//ONE DIMENSIONAL ARRAY DECLARATION
		//one dimensional array-->valid syntaxes 
		int[] a;// (Recommended)
		//int[] -->create an array of int type  and then it will be pointed by a.
		int  b[];
		//int --> decide int type and then assigns b array int type elements. 
		int  []c;
		
		
		//ONE DIMENSIONAL ARRAY CREATION
		int[] d = new int[5]; //
//		double[] e = new double[2147483646]; ->totally dependent on system(RAM).
		char[] ch = new char[5];
		
		int[] test = {12,14,45,67,100};//initialization test array.
		
		//maximum size of int = 2147483647;
		
		
		int[] p = new int[0];
		int[] p1 = new int[-3];
		
		if(p != null)
		System.out.println("P's value : "+p1);

	}

}
