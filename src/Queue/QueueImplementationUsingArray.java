package Queue;

public class QueueImplementationUsingArray 
{
	int capacity;
	int queueArray[];
	int front;
	int rear;
	int currentSize;
	
	//FIFO - First In First Out.
	public QueueImplementationUsingArray(int sizeOfQueue)
	{
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArray = new int[this.capacity];
	}
	
	//This Method is used to add the Element in the Queue.
	public void enQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full, Data Cannot be Inserted");
		}
		else
		{
			rear++;
			if(rear == currentSize-1)
			{
				rear = 0;
			}
			queueArray[rear] = data;
			currentSize++;
			System.out.println(data + " is Added to the Queue");
		}
	}
	
	//This Method is used to Remove the Element from the Queue.
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty, Data cannot be Deleted");
		}
		else
		{
			front++;
			if(front == capacity-1)
			{
				System.out.println(queueArray[front-1] + " is Removed from the Queue");
				front = 0;
			}
			else
			{
				System.out.println(queueArray[front-1] + " is Removed from the Queue");
			}
			currentSize--;
		}
	}
	
	public boolean isFull()
	{
		if(currentSize == capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if(currentSize == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		QueueImplementationUsingArray queue = new QueueImplementationUsingArray(10);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		
		queue.deQueue();
		
		queue.enQueue(40);
		
		queue.deQueue();
		
		queue.enQueue(50);
		queue.enQueue(60);
		
		queue.deQueue();
		
		queue.enQueue(70);
		queue.enQueue(80);
		
		queue.deQueue();
	}
}
