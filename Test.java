package tree;

public class Test {

	public void wrong_BST_Example() {
		// Creating a binary tree as 
		  // Creating Root node
		   Node root = new Node(3);
		    
		   // Creating left node of the root node that is left subtree 
		   Node node_1 = new Node(2);
		   // Setting the node as left node of the root
		   root.setLeft(node_1);
		   
		   // Now as left node as root creating left node 
		   Node node_2 = new Node(1); 
		   // Setting the node as left node of the root's left node (Left Subtree)
		   node_1.setLeft(node_2);
		   
		   // Now as left node of root as a root creating right node 
		   Node node_3 = new Node(4); 
		   // Setting the node as right node of the root's left node (Left Subtree)
		   node_1.setRight(node_3);
		   
		   // Creating right node of the root node that is Right subtree
		   Node node_4 = new Node(6); 
		   // Setting the node as right node of the root
		   root.setRight(node_4);
		   
		   // Now as right node as root creating left node 
		   Node node_5 = new Node(5); 
		   // Setting the node as left node of the root's right node (right Subtree)
		   node_4.setLeft(node_5);
		   
		   // Now as right node as root creating right node 
		   Node node_6 = new Node(7); 
		   // Setting the node as right node of the root's right node (Left Subtree)
		   node_4.setRight(node_5);
		   
		   // Printing the binary tree
		   System.out.println("Checking the given Binary Tree is Binary Search Tree or not");
		   System.out.println("The root of the binary tree is : " + root.getData());
		   System.out.println("The Left node of the binary tree is : " + node_1.getData());
		   System.out.println("The Left Subtree of the binary tree's left node is  : " + node_2.getData());
		   System.out.println("The Left Subtree of the binary tree's right node is  : " + node_3.getData());
		   System.out.println("The Right node of the binary tree is : " + node_4.getData());
		   System.out.println("The Right Subtree of the binary tree's left node is  : " + node_5.getData());
		   System.out.println("The Right Subtree of the binary tree's right node is  : " + node_6.getData());
		   
		   
		  
		   // Checking the tree is binary search tree or not. 
		    Checking_BST tree = new Checking_BST();
		    Boolean result  = (Boolean) tree.checking_BSTree_or_Not(root, root.getData());
		    // Printing the result. 
		    System.out.println(result);
		   
	}
	
	public void correct_BST_Example() {
		
		
		// Creating a binary tree as 
		  // Creating Root node
		   Node root = new Node(8);
		    
		   // Creating left node of the root node that is left subtree 
		   Node node_1 = new Node(3);
		   // Setting the node as left node of the root
		   root.setLeft(node_1);
		   
		   // Now as left node as root creating left node 
		   Node node_2 = new Node(1); 
		   // Setting the node as left node of the root's left node (Left Subtree)
		   node_1.setLeft(node_2);
		   
		   // Now as left node of root as a root creating right node 
		   Node node_3 = new Node(6); 
		   // Setting the node as right node of the root's left node (Left Subtree)
		   node_1.setRight(node_3);
		   
		   // Creating right node of the root node that is Right subtree
		   Node node_4 = new Node(10); 
		   // Setting the node as right node of the root
		   root.setRight(node_4);
		   
		   // Now as right node as root creating left node 
		  
		   
		   // Now as right node as root creating right node 
		   Node node_5 = new Node(14); 
		   // Setting the node as right node of the root's right node (Left Subtree)
		   node_4.setRight(node_5);
		   
		   // Printing the binary tree.
		   System.out.println("Checking the given Binary Tree is Binary Search Tree or not");
		   System.out.println("The root of the binary tree is : " + root.getData());
		   System.out.println("The Left node of the binary tree is : " + node_1.getData());
		   System.out.println("The Left Subtree of the binary tree's left node is  : " + node_2.getData());
		   System.out.println("The Left Subtree of the binary tree's right node is  : " + node_3.getData());
		   System.out.println("The Right node of the binary tree is : " + node_4.getData());
		   System.out.println("The Right Subtree of the binary tree's left node is  : " + node_5.getData());
		   
		   
		   
		  
		   	// Checking the tree is binary search tree or not. 
		    Checking_BST tree = new Checking_BST();
		    Boolean result  = (Boolean) tree.checking_BSTree_or_Not(root, root.getData());
		    // Printing the result. 
		    System.out.println(result);
		    
	}
}
