package queue;

public class Queue {
	int arr[];
	int capacity;
	int front,rear;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		arr= new int[capacity];
		front=rear=0;
	}
	
	public void enqueue(int val)
	{
		if(rear==capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		
		arr[rear++]=val;   //arr[rear]=val      rear++;
	}
	
	public void dequeue()
	{
		if(front==rear)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i=0;i<rear-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		rear--;
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+" <- ");
		}
		System.out.println();
	}

}
