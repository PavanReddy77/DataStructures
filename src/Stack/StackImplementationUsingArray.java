package Stack;

public class StackImplementationUsingArray 
{
	int size;
	int array[];
	int top;
	
	//LIFO - Last In First Out.
	public StackImplementationUsingArray(int size)
	{
		this.size = size;
		this.array = new int[size];
		this.top = -1;
	}
	
	//Time Complexity : O(1)
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			array[top] = element;
			System.out.println("Pushed Element is ::: " +element);
		}
		else
		{
			System.out.println("Stack is Full Now");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int returnedTop = top;
			top--;
			System.out.println("Poped Element is ::: " +array[returnedTop]);
			return array[returnedTop];
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public boolean isFull()
	{
		return(size-1 == top);
	}
	
	public boolean isEmpty()
	{
		return(top == -1); 
	}
	
	public int peek()
	{
		if(!this.isEmpty())
		{
			return array[top];
		}
		else
		{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public static void main(String args[])
	{
		StackImplementationUsingArray stack = new StackImplementationUsingArray(10);
		stack.pop();
		
		System.out.println("#####################################");
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println("#####################################");
		
		int topElementValue = stack.peek();
		System.out.println("Top Element Value of Stack is ::: " +topElementValue);
		
		System.out.println("#####################################");
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("#####################################");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}
}
