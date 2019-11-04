package nov_4_2019;

import java.util.ArrayList;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
//		Employee e1 = new Employee();
//		e1.input();
//		list.add(e1);
//		Employee e2 = new Employee();
//		e2.input();
//		list.add(e2);
//		Employee e3 = new Employee();
//		e3.input();
//		list.add(e3);
//		Employee e4 = new Employee();
//		e4.input();
//		list.add(e4);
		
		Employee obj;
		
		for(int i=0;i<3;i++) {
			obj = new Employee();
			obj.input();
			list.add(obj);
		}
		
		
		for(Employee e:list) {
			System.out.println(e);
		}
		

	}

}
