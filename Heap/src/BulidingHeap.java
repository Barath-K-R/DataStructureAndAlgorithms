
public class BulidingHeap {

	public static void heapify(int[] a,int n,int i) {
		int largest=i,leftchild=2*i+1,rightchild=2*i+2;
		
		if(leftchild>=n)
			return;
		
		if(a[leftchild]>a[largest])
			largest=leftchild;
		if(a[rightchild]>a[largest])
			largest=rightchild;
		
		if(largest!=i)
		{
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a,n,largest);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {15,20,7,9,30};
		for(int i=a.length/2;i>=0;--i)
		{
			heapify(a,a.length,i);
		}
		
		for(int num:a)
			System.out.println(num);

	}

}
