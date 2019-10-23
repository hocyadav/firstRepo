package tries;

public class Trie {
	static final int ALPHA_SIZE = 26;
	
	static class TrieNode{
		TrieNode[] children = new TrieNode[ALPHA_SIZE];
		boolean isLeaf;
		
		TrieNode() {
			for(int i=0; i<ALPHA_SIZE; i++)
				children[i] = null;
			
			isLeaf = false;
		}
	}
	static TrieNode root;
	
	//insert
	static public void insert(String key) {
		int index;
		TrieNode tempCrawl = root;//we are not disturbing root reference value..
		for(int i=0; i<key.length(); i++) {//total string length
			index = key.charAt(i) - 'a';//1. assuming all strings are lower case 2. a-a = 0, b-a=1 ...
			
			if(tempCrawl.children[index] == null)//value not present
				tempCrawl.children[index] = new TrieNode();//create new object of trie node and assign its object reference
			
			tempCrawl = tempCrawl.children[index];//change obj reference of pointer to it children

		}
		tempCrawl.isLeaf = true;//last node leaf block value
		System.out.println("done");
	}
	
	static public boolean search(String key) {
		//1. store root reference in temp pointer 
		//2.for loop -- length of string
			//3.if children node is present i.e. not null .. then update temp pointer with its obj reference
			//4.if not return false
			//3. if leaf is true and end of str then return true
		TrieNode tempCrawl = root;
		boolean searchResult = false;
		int index;
		for(int i=0; i<key.length(); i++) {
			index = key.charAt(i) - 'a';//assuming all are small char
			
			if(tempCrawl.children[index] == null)
				searchResult = false;
			tempCrawl = tempCrawl.children[index];
		}
		
		//check last leaf node + last node is not null
		
		return (tempCrawl!=null && tempCrawl.isLeaf);
	}
	
	
	public static void main(String[] args) {
		String[] keys = {"the", "help","hell"};
		
		root = new TrieNode();
		insert(keys[0]);
		insert(keys[1]);
		System.out.println(search("help"));
		
		
	}

}
