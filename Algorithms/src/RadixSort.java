import java.util.Scanner;

public class RadixSort {

	public static void radixsort(int[]a,int n) {
		int max=a[0];
		for(int i=0;i<n;++i)
		{
			if(a[i]>max)
				max=a[i];
		}
		for(int pos=1;max/pos>0;pos=pos*10)
		{
			countsort(a,n,pos);
		}
	}
	
	public static  void countsort(int []a,int n,int pos) {
		int []count=new int[10];
		//setting counts in count array
		for(int i=0;i<n;++i)
		{
			count[(a[i]/pos)%10]++;
		}
		//setting positions in count array
		for(int j=1;j<10;++j)
		{
			count[j]=count[j]+count[j-1];
		}
		//forming ouytput array
		int []output=new int[n];
		for(int k=n-1;k>=0;--k)
		{
			int index=count[(a[k]/pos)%10]-1;
			output[index]=a[k];
			count[(a[k]/pos)%10]--;
		}
		for(int j=0;j<n;++j)
		{
			a[j]=output[j];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a= {432,8,530,90,88,231,11,45,677,199};
		radixsort(a,a.length);
		for(int res:a)
			System.out.println(res);

	}

}
