import java.util.Arrays;

import com.sun.javafx.collections.SortableList;

public class ArraysMethods {

	public static void main(String[] args) {
		//prefered way
		int[] a1 = new int[4];
		System.out.println(a1.length);
		//not prefered way
		int []a2 = new int[5];
		System.out.println(a2.length);
		//not prefered way
		int a3[] = new int[6];
		System.out.println(a3.length);
		
		Arrays.fill(a1, 1);
		for(int a:a1) {
			System.out.println(a);
		}
		
		int[] a4 = {11,2,44,1,6,77};
		
		for(int a:a4)
			System.out.print(a+" ");
		System.out.println("");
		//binary search before sort
		System.out.println("binary search : " +Arrays.binarySearch(a4, 1));
		Arrays.sort(a4);
		System.out.println("a4[0] : "+a4[0]);
		
		for(int a:a4)
			System.out.print(a+" ");
		System.out.println("");
		
		System.out.println("binary search : " +Arrays.binarySearch(a4, 1));
	}

}
