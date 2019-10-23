package bst;

public class BinarySearchTree {
	class Node{
		int data;
		Node left, right;
		
		Node(int i){
			data = i;
			left = right = null;
		}
	}
	
	Node searchBST(Node root, int i) {
		if(root == null || root.data == i)
			return root;
		if(root.data < i) 
			return searchBST(root.left, i);
		
		return searchBST(root.right, i);
	}
	

	//root null
	//root not null
		//go left
		//go right
	Node insertBST(Node root, int i) {
		//1. root null
		//create new node and return root address/obj
		if(root == null)
			 return new Node(i);

		if(i < root.data)//2. go to correct loc and create new node and return object/address
			return insertBST(root.left, i);
		else if(i > root.data)
			return insertBST(root.right, i);
		//data present in tree
		return root;
	}
	
	Node root;
	public BinarySearchTree() {
		root = null;
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tree.insertBST(tree.root, 2);
		System.out.println(tree.root);
	}
	
}
