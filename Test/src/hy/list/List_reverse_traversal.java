package hy.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_reverse_traversal {

	public static void main(String[] args) {
		List<String> st = new ArrayList<>();
		st.add("aa"); st.add("bb"); st.add("cc");
		
		//in forward order i.e. same as  Iterator<String> it = st.iterator();
		//
		ListIterator<String> it1 = st.listIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("----------");
		//in backward order
		ListIterator<String> it2 = st.listIterator(st.size());//this iterator has extra feature we can replace, add new element..
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
			
			//we can update values
			it2.set("..");
		}
		//we can add new elements
		it2.add("123");
		it2.add("000");
		
		
		System.out.println("updated : "+st);
		
	}

}
