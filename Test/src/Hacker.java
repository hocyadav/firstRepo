import java.util.Arrays;

public class Hacker {

    // Complete the sockMerchant function below.
    //9, 
    //10 20 20 10 10 30 50 10 20
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int initialClrCount = 1;
        int pair = 0;
        //List<Integer> pairAr = new ArrayList<>();
        boolean equalFlag = false;
        for(int i=0; i<ar.length-1; i++){
            if(ar[i] == ar[i+1]){//next element is same
                initialClrCount += 1;
                equalFlag = true;
            }else {
                //pairAr.add(initialClrCount);
                if(equalFlag == true){
                    pair += initialClrCount/2;
                    equalFlag = false;
                }
                initialClrCount = 1;
            }
        }
        
        if(equalFlag == true) {
        	pair += initialClrCount/2;
        }
        return pair;

    }

    static String[] arryRGB(String[] ar) {
    	int i=0, j=0, k=ar.length-1;
    	
    	while(j<k) {
    		
    	}
    	
    	
    	
    }
    public static void main(String[] args) {
        //System.out.println(sockMerchant(9, new int[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3, 0}));
    	
    	String[] arr = new String[] {"R","G","G","R","R","B","R","B"};
    	System.out.println(arryRGB(arr));
    	
    }
}
