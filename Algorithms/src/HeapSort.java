import java.util.Map;
import java.util.Scanner;

public class HeapSort {

	public static void maxheap(int []a,int n,int i) {
		
		int largest=i;
		int leftchild=(2*i)+1,rightchild=(2*i)+2;
		
		
		if(leftchild<n && a[leftchild]>a[largest])
		largest=leftchild;
			
		
		if(rightchild<n && a[rightchild]>a[largest])
			largest=rightchild;
		
		if(largest!=i)
		{
			
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			
			maxheap(a  ,n,largest);
		}
		
		
	}
	public static void heap(int []a,int n) {
		
		//insertion or building maxheap
		for(int i=((n-2)/2);i>=0;i--)
		{
			maxheap(a,n,i);
		}
		
		//deletion or sorting maxheap
		for(int i=n-1;i>=0;--i)
		{
			int temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			maxheap(a,i,0);
		
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=7;
		int[] a= {2,10,1,9,5,3,6};
		heap(a,n);
		for(int res:a)
			System.out.print(res+" ");
		
		

	}

}
