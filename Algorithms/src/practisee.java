
public class practisee {

	public static void quicksort(int[]a,int lb,int ub) {
		
	if(lb<ub)
	{
		int loc=partition(a,lb,ub);
		quicksort(a,lb,loc-1);
		quicksort(a,loc+1,ub);
	}
		
	}
	
	public static int partition(int[]a,int lb,int ub) {
		int pivot=a[lb];
		int start=lb,end=ub;
		
		while(start<end) {
			
			while(start<=ub && a[start]<=pivot )
			{
				
				
				start++;
			}
			
			while(end>=lb && a[end]>pivot )
			{
				end--;
				
			}
			
			if(start<end)
			{
				int temp=a[end];
				a[end]=a[start];
				a[start]=temp;
			}
		}
		int temp=a[end];
		a[end]=a[lb];
		a[lb]=temp;
		return end;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {7,2,4,8,9,5,3,1};
		quicksort(a,0,a.length-1);
		for(int res:a) {
			System.out.println(res);
		}
	}
}

