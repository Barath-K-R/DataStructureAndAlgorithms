
public class CircularQueueUsingArrays {

static int front=-1,rear=-1;
	
	public static void enqueue(int value,int []a,int n) {
		if(front==(rear+1)%n)
		{
			System.out.println("queue is empty");
			return;
		}
		else
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%n;
			a[rear]=value;
		}
			
		
	}
	
	public static void dequeue(int []a,int n) {
		
		if(front==-1 && rear==-1)
		{
			System.out.println("queue is empty");
			return;
		}
		else if(front==rear) {
			front=-1;
			rear=-1;
		}
		else
			front=(front+1)%n;
	}
	
	public static void print(int []a,int n) {
		if(front==-1 && rear==-1)
			return;
		int t=front;
		
		while(t!=rear)
		{
			System.out.println(a[t]);
			t=(t+1)%n;
			
		}
		System.out.println(a[t]);
	}
	public static void main(String[] args) {
		int []a=new int[5];
		int n=a.length;
		enqueue(3,a,n);
		enqueue(4,a,n);
		enqueue(2,a,n);
		enqueue(8,a,n);
		enqueue(9,a,n);
		dequeue(a,n);
		dequeue(a,n);
		enqueue(2,a,n);
		enqueue(1,a,n);
		dequeue(a,n);
		
		print(a,n);

	}

}
