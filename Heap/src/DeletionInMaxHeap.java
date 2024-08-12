
public class DeletionInMaxHeap {

	public static void heapify(int []a,int n,int i) {
		System.out.println("n="+n);
		int largest=i,leftchild=2*i+1,rightchild=2*i+2;
		System.out.println("leftchild="+leftchild);
		if(leftchild>=n)
			return;
		if(leftchild<n && a[leftchild]>a[largest])
			largest=leftchild;
		
		if(rightchild<n && a[rightchild]>a[largest])
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
		int[] a= {30,20,25,18,19,23,22};
		int n=a.length;
		int pos=2;
		
		int temp=a[pos];
		a[pos]=a[n-1];
		a[n-1]=temp;
		
		for(int num:a)
			System.out.print(num+" ");
		System.out.println();
		n=n-1;
		heapify(a,n,pos);
		
		for(int num:a)
			System.out.print(num+" ");
		System.out.println();
		
		

	}

}
