import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.owasp.esapi.ESAPI;

public class StudentCollectionRun {

	
	public static void main(String[] args) {
		
		  System.out.println("hi"); List<Student> st = new ArrayList<Student>();
		  st.add(new Student(11, "hari")); 
		  st.add(new Student(2, "om")); st.add(new
		  Student(5, "om")); 
		  System.out.println(st);
		  
		  Collections.sort(st);//this will work after implementing comparable //inside
		  //Student and implement its method compareTo System.out.println(st);
		  
		  System.out.println(Integer.valueOf(1)); System.out.println(11);
		 
		  
		
	}

}
