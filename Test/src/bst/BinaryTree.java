package bst;
class Node{//A. single node object
	int data;
	Node left, right;
	
	Node(int i) {
		data = i;
		left = right = null;
	}
}

public class BinaryTree {//B. create Binary tree no insertion order mentain- not BST
	Node root;//this root is inside object BinaryTree object and it will not change
	
	BinaryTree() {
		root = null;
	}
	
	
	void printInorder(Node root) {//passing BinaryTree object value root
		//l n r
		if(root == null)
			return;
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();//tree object - contain multiple node object
		tree.root = new Node(1);//left side 1.sending value + 2.creating new object + 3. saving that obj ref into root
		tree.root.left = new Node(2);//this is only binary tree not BST 
		tree.root.right = new Node(3);//so we can add anything left or right
		tree.root.left.left = new Node(6);
		//tree.printPreOrder(tree.root);
		tree.printInorder(tree.root);//give sorted only if it is BST not BT
	}


}
