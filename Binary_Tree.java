package tree;

public class Binary_Tree {


	public static void main(String args[]) {
		
		// Calling the function to test the binary tree is binary search tree or  not. 
		Test test_case = new Test();
		// Testing the correct binary search tree. Accepted result is true.
		test_case.correct_BST_Example();

		// Testing the incorrect binary search tree. Accepted result is false.
		test_case.wrong_BST_Example();

		
	}
	
	

}
