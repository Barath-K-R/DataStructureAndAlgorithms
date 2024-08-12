
public class HeapSort {

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
		int[]a= {30,20,7,9,15};
		int n=a.length;
		
		for(int i=n-1;i>0;i--)
		{
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			n=n-1;
			heapify(a,n,0);
		}
		for(int num:a)
			System.out.println(num);

	}

}
