package BST;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b=new BST(50);
		b.insert(20);
		b.insert(60);
		b.insert(10);
		b.insert(30);
		b.insert(40);
		
		b.inorder(b.root);
		System.out.println();
		b.preorder(b.root);
		
		if(b.search(10)==null)
			System.out.println("value not found");
		else
			System.out.println("found");
		
	}

}
