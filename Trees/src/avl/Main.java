package avl;

import BST.BST;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL b = new AVL(50);
		b.insert(20);
		b.insert(60);
		b.insert(10);
		b.insert(30);
		b.insert(40);

		b.inorder(b.root);

	}

}
