package TreeTraversal;

public class Main {
      public static void main(String[]args)
      {
    	  BinaryTree b=new BinaryTree(10);
          b.leftinsert(b.root, 4);
          b.rightinsert(b.root, 6);
          b.leftinsert(b.root.left, 7);
          b.rightinsert(b.root.left, 12);
          b.leftinsert(b.root.right, 15);
          b.rightinsert(b.root.right, 17);
          BinaryTree.postorder(b.root);
      }
}
