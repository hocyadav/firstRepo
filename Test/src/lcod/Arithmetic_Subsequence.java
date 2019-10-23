package lcod;

import java.util.ArrayList;

public class Arithmetic_Subsequence {

	public int longestSubsequence(int[] arr, int difference) {
	       //int len=arr.length;
	       // int[] diffArray = new int[len];
	        ArrayList<Integer> diffarr = new ArrayList<Integer>();
	        for(int i=0;i<arr.length;i++) {
	        	diffarr.add(arr[i]);
	        }
	        int count =0;
	        int maxlen=0;
	        for(int i=0;i<diffarr.size();i++) {
	        	if(diffarr.get(i)==difference) {
	        		count++;
	        		maxlen=Math.max(maxlen, count);
	        	}
	        	else
	        		count=0;
	        }
	        return count; 
	    }
}

class Test 
{  
    public static void main(String args[])  
    { 
    

        int arr[] = {3, 1, 2, 5, 4}; 
        Arithmetic_Subsequence arithmetic_Subsequence =new Arithmetic_Subsequence();
        arithmetic_Subsequence.longestSubsequence(arr, 1);
    }
}