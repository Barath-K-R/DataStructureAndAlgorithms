
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,10,4,6};
		for(int i=0;i<a.length-1;++i)
		{
			int min=i;
			for(int j=i+1;j<a.length;++j)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			if(min!=i)
			{
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			}
		}
		for(int res:a)
			System.out.println(res);
	}

}
