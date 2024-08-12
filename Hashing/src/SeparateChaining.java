package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class SeparateChaining {

	public static void hashcode(ArrayList<LinkedList<Integer>>a,int key,int size) {
		int index=key%size;
	    a.get(index).addLast(key);
	}
	public static void main(String[] args) {
		ArrayList<LinkedList<Integer>> a=new ArrayList<LinkedList<Integer>>(17);
		for(int i=0;i<17;++i)
		{
			a.add(new LinkedList<Integer>());
		}
		hashcode(a,2,17);
		hashcode(a,6,17);
		hashcode(a,3,17);
		hashcode(a,9,17);
		hashcode(a,10,17);
	}

}
