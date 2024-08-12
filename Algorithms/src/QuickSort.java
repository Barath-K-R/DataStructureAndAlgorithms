
public class QuickSort {

	public static void QuickSort(int[]a,int lb,int ub) {
		if(lb<ub)
		{
			int loc=partition(a,lb,ub);
			QuickSort(a,lb,loc-1);
			QuickSort(a,loc+1,ub);
		}
	}
	public static int partition(int[]a,int lb,int ub) {
		int pivot=a[lb],start=lb,end=ub;
		System.out.println("begiining "+start+" "+end);
		while(start<end) {
            
			while(start<=ub && a[start]<=pivot)
			start++;
		while(end>=lb && a[end]>pivot)
			end--;
		System.out.println(start+" "+end);
		if(start<end)
		{
			System.out.println("swapping "+start+" "+end);
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
		}
		
		
		}
		int temp=a[end];
		a[end]=pivot;
		a[lb]=temp;
		System.out.println("pivot swapping "+end+" "+lb);
		return end;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {7,2,4,8,9,5,3,1};
		QuickSort(a,0,a.length-1);
		for(int res:a) {
			System.out.println(res);
		}
	}

}
