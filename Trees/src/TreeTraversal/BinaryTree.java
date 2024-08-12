package TreeTraversal;

public class BinaryTree {
	Node root=null;
	class Node{
		int data;
		Node right,left;
		
		public Node(int d) {
			data=d;
			right=left=null;
		}
	}
	
    public BinaryTree(int d) {
		root=new Node(d);
	}
    
    public void leftinsert(Node n,int data) {
    	Node newnode=new Node(data);
    	n.left=newnode;
    	
    }
    public void rightinsert(Node n,int data) {
    	Node newnode=new Node(data);
    	n.right=newnode;
    }
    
    public static void inorder(Node n) {
    	if(n==null)
    		return;
    	inorder(n.left);
    	System.out.println(n.data);
    	inorder(n.right);
    }
    
    public static void preorder(Node n) {
    	if(n==null)
    		return;
    	System.out.println(n.data);
    	preorder(n.left);
    	preorder(n.right);
    	
    }
    
    public static void postorder(Node n) {
    	if(n==null)
    		return;
    	postorder(n.left);
    	postorder(n.right);
    	System.out.println(n.data);
    }

}
