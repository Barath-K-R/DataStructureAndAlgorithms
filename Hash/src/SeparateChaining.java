import java.util.ArrayList;
import java.util.LinkedList;

public class SeparateChaining {

	public static void hashcode(ArrayList<LinkedList<Integer>>a,int key,int size) {
		int index=key%size;
	    a.get(index).addLast(key);
	}
	
	public static boolean searchelement(ArrayList<LinkedList<Integer>>a,int key,int m) {
		int index=key%m;
		for(int i=0;i<a.get(index).size();++i)
		{
			System.out.print(i+1+" ");
			if(key==a.get(index).get(i))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(searchelement(a,10,17));
		
	}

}
