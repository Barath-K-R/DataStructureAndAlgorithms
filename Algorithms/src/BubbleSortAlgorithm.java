
public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,4,10,1,6,2};
		
		int flag=0,j=0;
		for(int i=0;i<a.length-1;++i)
		{
			flag=0;
			for(j=0;j<a.length-1-i;++j) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			
			if(flag==0)
				break;
		}
		for(int res:a)
			System.out.println(res);
	}

}
