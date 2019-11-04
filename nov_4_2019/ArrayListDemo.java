package nov_4_2019;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		int a[]=  new int[5];
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(45);
//		list.add(34);
//		list.add(9);
//		list.add(31);
		ArrayList<String> list = new ArrayList<String>();
		list.add("vikrant");
		list.add("true");
//		list.add(12);
		
	//		for(int i=0;i<list.size();i++) {
	//			System.out.println(list.get(i));
	//		}
		
		for(String s:list) {
			System.out.println(s);
		}

	}

}
