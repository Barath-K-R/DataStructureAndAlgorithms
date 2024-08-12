package avl;



public class AVL {
	
	Node root=null;
	class Node{
		int data;
		Node right,left;
		int height;
		
		public Node(int d) {
			data=d;
			left=right=null;
			height=0;
		}
		
	}
	
	public AVL(int data) {
		root=new Node(data);
	}
	
	
	
	public void insert(int value) {
		root=insert(root,value);
	}
	public Node insert(Node n,int value) {
		
		if(n==null)
		{
			return new Node(value);
		}
		if(value<n.data)
			n.left=insert(n.left,value);
		else if(value>n.data)
			n.right=insert(n.right,value);
		else
			return n;
		
		n.height=1+max(getheight(n.left),getheight(n.right));
		
		int balancefactor=getbalancefactor(n);
		
		if(balancefactor>1 && value<n.left.data)
		{
		       return rightrotate(n);	
		}
		else if(balancefactor>1 && value>n.left.data)
		{
		      n.left=leftrotate(n.left);
		      return rightrotate(n);
		}
		else if(balancefactor<-1 && value>n.right.data)
		{
			return leftrotate(n);
		}
		else if(balancefactor<-1 && value<n.right.data)
		{
			n.right=rightrotate(n.right);
			return leftrotate(n);
		}
		
		return n;
		
		
	}
	
	private Node rightrotate(Node z) {
		Node y=z.left;
		Node t3=y.right;
		
		y.right=z;
		z.left=t3;
		
		z.height=1+max(getheight(z.left),getheight(z.right));
		y.height=1+max(getheight(y.left),getheight(y.right));
		
		return y;
		
	}
	
	private Node leftrotate(Node z) {
		Node y=z.right;
		Node t3=y.left;
		
		y.left=z;
		z.right=t3;
		
		z.height=1+max(getheight(z.left),getheight(z.right));
		y.height=1+max(getheight(y.left),getheight(y.right));
		
		return y;
		
	}
	
	private int getbalancefactor(Node n) {
		return getheight(n.left)-getheight(n.right);
	}
	public int getheight(Node n)
	{
		if(n==null)
			return -1; 
        return n.height;
	}
	public int max(int a,int b) {
		return a>b?a:b;
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
	
	//inorder traversal
		public void inorder(Node n) {
			if(n==null)
				return;
			
			inorder(n.left);
			System.out.println(n.data+" "+"height is "+n.height);
			inorder(n.right);
		}
	
	//
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
