package lcod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


  //Definition for singly-linked list.

 

class Solution{
	public String fun1(String str) {
		String[] ss = str.split("@");
		String local = ss[0];
		String domain = ss[1];
		
		if(local.split("\\.").length > 1)
			local = local.replace(".","");

		String[] local2 = local.split("\\+");
		if(local2.length > 1) {
			local = local2[0];
		}
		
		return local+"@"+domain;
	}

	
	public int fun2(String J, String S) {
        int[] aa = new int[26];
        Arrays.fill(aa,0);
        
        int[] AA = new int[26];
        Arrays.fill(AA,0);
        
        for(int i=0; i<J.length(); i++){
            int value = (int) J.charAt(i);//ascii value
            
            if(value >=65 && value <= 90)
                AA[value - 65] = 1;
            else
                aa[value - 97] = 1;
        }
        
        int count = 0;
        
        for(int j=0 ; j<S.length(); j++){
            int val = (int) S.charAt(j);//ascii value
            if(val >=65 && val <= 90){
                if(AA[val - 65] == 1)
                    count++;
            }
            if(val >=97 && val <= 122)
                if(aa[val - 97] == 1)
                    count++;
        }
        return count;
	}

	public int repeatedNTimes(int[] A) {
        Arrays.sort(A);//sorted
        int count = 1;
        int val = 0;
        for(int i=0; i< A.length-1; i++){//1,2,3,3
            val = A[i];
            if(A[i] == A[i+1])
                count +=1;
            if(A[i] != A[i+1])//dont do anything
                continue;
            if(count == A.length/2)
                break;
        }
        return val;
    }

	
	public int repeatedNTimes2(int[] A) {//un sorted
		Set<Integer> hSet = new HashSet<Integer>();
		int dup = 0;
		for(int i : A) {
			if(!hSet.add(i)) {
				dup = i;
				break;
			}
		}
		return dup;
    }

	
	public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length -1;
        while(start < end) {
        	if(A[start]%2 == 1 && A[end]%2 ==  0) {
        		int temp = A[end];
        		A[end] = A[start];
        		A[start] = temp;
        		start++;
        		end--;
        	}else if(A[start]%2 == 0 && A[end]%2 ==  1) {
        		start++;
        		end--;
        	}else if(A[start]%2 == 0 && A[end]%2 ==  0) {
        		start++;
        	}else
        		end--;
        }
        return A;
    }
	
	public int[][] flipAndInvertImage(int[][] A) {
        //for loop
        //  take 1st row
        //  swap + invert same time
		//[[1, 1, 0], [1, 0, 1], [0, 0, 0]]
		//[[1,0,0],[0,1,0],[1,1,1]]
        for(int row=0; row<A.length; row++){
            //for(int col=0; col<A[row].length; col++){
                //swap + invert
                int start = 0;
                int end = A[row].length - 1; 
                
                while(start<=end){
                    int temp = A[row][start];
                    A[row][start] = A[row][end] == 1 ? 0:1 ;
                    A[row][end] = temp == 1 ? 0:1 ;
                    start++; end--;
                }
            //}
        }
        return A;
    }
	
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        //result.add(1);
        
        for(int oldNum=left; oldNum<=right; oldNum++){
            int num = oldNum;//128
            while(num>0){
                int lDigit = num%10 ;//last 1 digit = 8
                if(lDigit == 0)
                	break;
                else if(oldNum%lDigit == 0){// 128 % 8 = 0 ...10%0
                    num = num/10;//12
                }else
                    break;
            }
            if(num == 0){
                result.add(oldNum);
            }
            
        }
        return result;
    }
	
	
	 public int arrayPairSum(int[] nums) {
	        
	     int sum=0;  
	     Arrays.sort(nums);
	     int n = nums.length;
	     for(int i=0;i<n;i=i+2) {
	    	 sum+=nums[i];
	     }
		 
	        return sum;
	    }
	 
	 public int[] diStringMatch(String S) {
		 
		 int[] res = new int[S.length()+1];
		 int min=0;
		 int max=S.length();
		 for(int i=0;i<S.length();i++) {
			 
			 if(S.charAt(i)=='I') {
				 res[i]=min;
				 min++;
			 }else {
				 res[i]=max;
				 max--;
			 }
			 res[S.length()]=min;			 
		 }
		 
 	     return res;   
	    }

	 //call by reference - reference store a copy and pass
	 public void reference(Integer[] ary) {
		 //ary[0] = 11;
		 ary = new Integer[] {5,6,7,8,9};		 
	 }

	 public List<String> commonChars(String[] A) {
	        int[][] colRow = new int[A.length][26];
	        List<String> result = new ArrayList<>();
	        
	        //a = 97
	        //store count of char in 2d array
	        for(int row=0; row<A.length; row++){
	            for(char c : A[row].toCharArray()){
	                colRow[row][((int)c)-97] += 1 ;
	            }
	        }
	        List<Integer> colVal = new ArrayList<>();
	        for(int col=0; col<26; col++){
	            for(int rw=0; rw<A.length; rw++){
	                colVal.add(colRow[rw][col]);
	            }
	            int min_value = Collections.min(colVal);
	            if( min_value > 0) {
	            	for(int j=0; j< min_value; j++) {
	            		result.add(Character.toString( (char) (col+97) ));
	            		
	            	}
	            }
	            colVal.clear();
	        }
	        return result;
	    }
	 
	 
	 public List<String> fizzBuzz(int n) {
	        //mod 
	        List<String> re = new ArrayList<>();
	        int mod3 =0;
	        int mod5 = 0;
	        for(int i=1; i<=n;i++){
	            
	            mod3 = i%3;
	            mod5=i%5;
	            
	            if(mod3 != 0 || i%5 != 0)
	                re.add(Integer.toString(i));
	            else if(mod3 == 0 && mod5 == 0)
	                re.add("FizzBuzz");
	            else if(mod5 == 0 )
	                re.add("Buzz");
	            else if(mod3 == 0 )
	                re.add("Fizz");
	        }
	        
	        return re;
	    }
	 
	    public List<String> subdomainVisits(String[] cpdomains) {
	        Map<String, Integer> hMap = new HashMap<>();
	        
	        for(String s : cpdomains){
	            //9001 discuss.leetcode.com --> split by space
	            String[] s2 = s.split("\\s+");
	            Integer count = Integer.valueOf(s2[0]);
	            
	            hMap.put(s2[1], count);//discuss.leetcode.com --> 9001
	            
	            s2 = s2[1].split("\\.");//discuss, leetcode, com or leetcode, com
	            System.out.println("s2 : "+s2[0] + " "+ s2[1]);
	            if(s2.length == 2)
	                hMap.put(s2[1], count);
	            if(s2.length == 3){
	                String key = s2[1]+"."+s2[2];
	                if(hMap.containsKey(key)){
	                    hMap.put(key, hMap.get(key) + count);//updating old
	                }else
	                    hMap.put(key, count);//adding new
	                
	                String key2 = s2[2];
	                if(hMap.containsKey(key2)){
	                    hMap.put(key2, hMap.get(key2) + count);
	                }else
	                    hMap.put(key2, count);
	            }
	        }
	        
	        System.out.println(hMap);
	        return null;
	    }

	 

}
public class Main {
	
	//driver class
	public static void main(String[] args) {
		
		Solution nn = new Solution();
		//System.out.println(nn.fun1("hari.om+yadav@cac.cc"));
		
		//System.out.println(nn.fun2("aA","aaAAabccaa"));
		//System.out.println(nn.repeatedNTimes2(new int[] {1,2,2,3}));
		//System.out.println(Arrays.toString(nn.sortArrayByParity(new int[] {3,1,2,4})));
		
		/*
		int[][] tAry = nn.flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}});
		for (int row = 0; row < tAry.length; row++) { 
			for (int col = 0; col < tAry[row].length; col++) { 
				System.out.print(tAry[row][col]); 
			} 
			System.out.println();
		}
		*/
		
		//System.out.println(nn.selfDividingNumbers(1, 22));
		
		/*
		Integer[] a = new Integer[] {1,2,3};
		nn.reference(a);
		System.out.println(Arrays.asList(a));
		*/
		
		//System.out.println(nn.commonChars(new String[] {"bella","label","roller"}));
		
		//System.out.println(nn.fizzBuzz(4));
		System.out.println(nn.subdomainVisits(new String[]{"9001 discuss.leetcode.com" ,"1 google.com"}));//["9001 discuss.leetcode.com","1 google.com"]
		
		
	}
}
