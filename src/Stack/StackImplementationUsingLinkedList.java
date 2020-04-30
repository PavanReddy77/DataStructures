package Stack;

public class StackImplementationUsingLinkedList 
{
	Node head;
	
	class Node
	{
		int value;
		Node next;
	}
	
	//LIFO - Last In First Out.
	public StackImplementationUsingLinkedList()
	{
		head = null;
	}
	
	public void push(int value)
	{
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}
	
	public int pop()
	{
		if(head == null)
		{
			System.out.println("Stack is Empty");
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	public static void printStackValues(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[])
	{
		StackImplementationUsingLinkedList stack = new StackImplementationUsingLinkedList();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("The Element Removed from Stack is ::: " +stack.pop());
		System.out.println("The Element Removed from Stack is ::: " +stack.pop());
		
		stack.push(35);
		
		System.out.println("The Element Removed from Stack is ::: " +stack.pop());
		
		printStackValues(stack.head);
	}
}
