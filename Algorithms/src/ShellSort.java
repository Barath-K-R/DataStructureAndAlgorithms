import java.util.Scanner;

public class ShellSort {
    public static void shellsort(int[]a,int n) {
    	for(int gap=n/2;gap>=1;gap=gap/2)
    	{
    		
    		for(int j=gap;j<n;++j)
    		{
    			
    			for(int i=j-gap;i>=0;i=i-gap)
    			{
    				
    				if(a[i+gap]>a[i])
    				{
    					break;
    				}
    				else
    				{
    					int temp=a[i];
    					a[i]=a[i+gap];
    					a[i+gap]=temp;
    				}
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a= {23,29,15,19,31,7,9,5,2};
		shellsort(a,a.length);
		for(int res:a)
			System.out.println(res);

	}

}
