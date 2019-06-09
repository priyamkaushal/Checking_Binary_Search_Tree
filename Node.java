package tree;

public class Node {

	 	private Node left = null;
	    private Node right = null;
	    private Integer data;
	 
	    public Node(Integer data) {
	        this.data = data;
	    }
	 
	    public Node getLeft() {
	        return left;
	    }
	    public void setLeft(Node left) {
	        this.left = left;
	    }
	    public Node getRight() {
	        return right;
	    }
	    public void setRight(Node right) {
	        this.right = right;
	    }
	 
	    public Integer getData() {
	        return data;
	    }
	    public void setData(Integer data) {
	        this.data = data;
	    }
}
