package BST;

public class BST {
	Node root=null;
	class Node{
		int data;
		Node right,left;
		
		public Node(int d) {
			data=d;
			left=right=null;
		}
		
	}
	
	public BST(int data) {
		root=new Node(data);
	}
	
	
	public void insert(int value) {
		Node newnode=new Node(value),t1 = root,t2=root;
		
		while(t1!=null)
		{
			t2=t1;
			if(value<t1.data)
				t1=t1.left;
			else
				t1=t1.right;
		}
		if(value<t2.data)
			t2.left=newnode;
		else
			t2.right=newnode;
		
	}
	
	//inorder traversal
	public void inorder(Node n) {
		if(n==null)
			return;
		
		inorder(n.left);
		System.out.print(n.data+" ");
		inorder(n.right);
	}
	
	public void preorder(Node n) {
		if(n==null)
			return;
		System.out.print(n.data+" ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public Node search(int value) {
		Node t1=root,t2=root;
		while(true)
		{
			if(t1==null || value==t1.data)
				return t1;
			
			if(value<t1.data)
			t1=t1.left;
			else
		    t1=t1.right;
		}
	}
	
	public Node delete(Node n,int value) {
		
		if(value==n.data)
		{
			if(n.left==null)
				return n.right;
			else if(n.right==null)
				return n.left;
			else
			{
				int  min=min(n.right);
				
				n.data=min;
				
				n.right=delete(n.right,min);
			}
				
		}
		else if(value<n.data)
			n.left=delete(n.left,value);
		else 
			n.right=delete(n.right,value);
		
		return n;
	}
	
	public int min(Node n)
	{
		int min=0;
		while(n!=null)
		{
			min=n.data;
			n=n.left;
		}
		return min;
	}
	
	
	
	

}
