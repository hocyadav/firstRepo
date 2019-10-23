package lcod;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		String J = "z";
		String S = "ZZzzzz";
		int result = countJinS(J, S);
		System.out.println(result);
	}

	
	//step 1: take J and fill all values in 26 array - like hashmap
	//step 2: check each char in S with hashmap and if value is 1 then inc count
	private static int countJinS(String j, String s) {
		int[] small		= new int[26];
		Arrays.fill(small, 0);
		
		int[] capital	= new int[26];
		Arrays.fill(capital, 0);
		
		for(int i=0; i<j.length(); i++) {
			//1. ascii value
			//2. go to that index and update value = 1			//A : 65 to 90, a : 97 to 122
			int ascii = (int) j.charAt(i);
			if(ascii >= 65 && ascii <= 90) {
				capital[ascii - 65] = 1;
			}else {
				small[ascii - 97] = 1;
			}
		}
		//step 2
		int count	= 0;
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			int ascii = (int) c;
			if(ascii >= 65 && ascii <= 90) {
				if(capital[ascii - 65] == 1) count++;
			}else if(small[ascii - 97] == 1){
				count++;
			}
				
		}
		
		return count;
	}
	
}
