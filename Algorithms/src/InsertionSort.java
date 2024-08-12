
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,4,10,1,6,2};
		int j=0;
		System.out.println("barath");
		for(int i=1;i<a.length;++i)
		{
			j=i-1;
			int temp=a[i];
			while(j>=0 && (temp<a[j]))
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int res:a)
			System.out.println(res);

	}

}
