import java.util.Arrays;

public class Arrays_binarySearch {

	public static void main(String[] args) {
		Object arr[] = {12,1,4,67,122};
		//printing unsorted array
		for(Object ar:arr) {
			System.out.println(ar);
		}
		
		Arrays.sort(arr);
		//printing sorted array
		for(Object ar:arr) {
			System.out.println(ar);
		}
		
		System.out.println(Arrays.binarySearch(arr, 0));
		
	}

}
