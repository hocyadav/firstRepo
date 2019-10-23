package hy.list;
// http://www.angelikalanger.com/GenericsFAQ/FAQSections/Fundamentals.html#FAQ003

import java.util.Date;
import java.util.LinkedList;


public class Parameterized_vs_non_par {

	public static void main(String[] args) {
		
		//Example (using a parameterized type): 
		LinkedList<String> col = new LinkedList<>();
		col.add("aa"); col.add("bb");
		
		System.out.println(col);
		
		//Same example (using a non-parameterized type): 
		
		@SuppressWarnings("rawtypes")
		LinkedList col2 = new LinkedList();
		col2.add("aa");//storing string object
		col2.add(new Date());// storing date object
		System.out.println(col2);
		
		//type cast is required since it contains different objects
		//else it will show run time error
		String ss = (String) col2.get(0);
		System.out.println(ss);
		
		
	}

}
