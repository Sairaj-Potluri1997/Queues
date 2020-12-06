package queues;
//queue implementation using an array

public class queue {
	int maxSize;
	int front,rear;
	long [] qarray;
	int nitems;
	public queue(int size) 
	{
		this.maxSize=size;
		this.qarray=new long[maxSize];
		front=0;
		rear=-1;
		nitems=0;
		
	}
	//method to insert into queue
	public void insert(long j) 
	{
		//condition to check overflow exception
		if(isFull()) 
		{
			System.out.println("Queue overflow");
		}
		else 
		{
		
		rear++;
		qarray[rear]=j;
		nitems++;
		}
	}
	//method to remove an element from the queue
	public long remove() 
	{
		if(isEmpty()) {
			System.out.println("Queue undeflow");
		}
		
		long temp=qarray[front];
		front++;
		nitems--;
		return temp;
		
		
		
	}
	//peek method
	public long peekFront() 
	{
		
		return qarray[front];
	}
	//to check constraints
	public boolean isEmpty() 
	{
		return nitems==0;
	}
	//to check constraints
	public boolean isFull() 
	{
		return nitems==maxSize;
	}
	//to display the queue
	public void display() 
	{
		System.out.print("[");
		for(int i=0;i<qarray.length;i++) 
		{
			System.out.print(qarray[i]+" ");
		}
		System.out.print("]");
		
	}
}	



