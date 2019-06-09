package tree;

public class Checking_BST {

	public boolean checking_BSTree_or_Not(Node root, int root_value) {
		// Base case, if the root is null. Returning true 
		if(root == null) {
			return Boolean.TRUE;
		}
		// If root is not null, calling the function to check the root is binary search tree. 
		return isBinary_Search_Tree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}

	// Function to return boolean value is the root is binary search tree or not. 
	// Excepts root and integer max and minimum value. 
	// 
	private boolean isBinary_Search_Tree(Node root, Integer minValue, Integer maxValue) {

		// Base case, if root is null. Returning null. 
		if(root == null) {
			return Boolean.TRUE;
		}
		
		// checking the node data with the minimum and max value.
		// Should be less than max value and greater than minimum value. 
		// Also checking the left side of the node is binary search tree and checking max value as the node value for the left node. 
		// Also checking the right side of the node is binary search tree and checking minimum value as the node value for the right node. 
		
		if(
				root.getData() >= minValue 
				&& root.getData() < maxValue
				&& isBinary_Search_Tree(root.getLeft(), minValue, root.getData())
				&& isBinary_Search_Tree(root.getRight(), root.getData(), maxValue)
				) 
		{
			// if all the validations are met returning true else false. 
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
