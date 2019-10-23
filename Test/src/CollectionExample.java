import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		//java 9 -- List.of()
		//List<String> words = new List.of("aa","bb","cc");
		
		//java 8 means java 1.8
		List<String> words = new ArrayList<>();
		words.add("aa");
		words.add("bb");
		words.add("cc");
		words.add("cc");
		words.add("dd");
		words.add("ee");
		System.out.println(words);
		
		words.set(0, "bb");
		System.out.println(words);
		
		words.remove(0);
		System.out.println(words);

		//ListIterator<String> it = words.listIterator();
		Iterator<String> it = words.iterator();
		
		while(it.hasNext()) {
			  if(it.next().endsWith("cc"))
				  it.remove();
			  
		}
		System.out.println(words);
		words.add("aa");
		System.out.println(words);
		//words.sort();
		Collections.sort(words);
		System.out.println(words);
	}

}
