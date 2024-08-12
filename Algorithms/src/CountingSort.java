import java.util.Scanner;

public class CountingSort {
	public static int[] countsort(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;++i)
		{
			if(max<a[i])
				max=a[i];
		}
		max=max+1;
		int []count=new int[max];
		
		for(int j=0;j<a.length;++j)
		{
			
		   ++count[a[j]];
		}
		
		for(int k=1;k<count.length;++k)
		{
			count[k]=count[k]+count[k-1];
		}
		
		int []output=new int[a.length];
		for(int l=a.length-1;l>=0;--l)
		{
			
			int index=count[a[l]]-1;
			output[index]=a[l];
			count[a[l]]--;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a= {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		int[]output=countsort(a);
		for(int res:output)
		System.out.print(res+" ");
		

	}

}
