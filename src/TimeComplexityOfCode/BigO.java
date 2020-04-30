package TimeComplexityOfCode;

import java.util.HashMap;
import java.util.Map;

public class BigO 
{
	public static void main(String args[])
	{	
		//Code that is going to be Executed only for Once ==> O(1).
		//Time Complexity ==>> O(1).
		int number1 = 10; 
		System.out.println("The Number1 Value is ::: " +number1);
		
		//Odd and Even Number ==>> O(1).
		//Time Complexity ==>> O(1).
		int number2 = 20;
		if(number2%2 == 0)
		{
			System.out.println("The Given Number is Even");
		}
		else
		{
			System.out.println("The Given Number is Odd");
		}
		
		//Fetch Values from the HashMap.
		//Time Complexity ==>> O(1).
		Map<String, Integer> studentMarks = new HashMap<String, Integer>();
		studentMarks.put("Tom", 100);
		studentMarks.put("Peter", 200);
		studentMarks.put("Steve", 300);
		
		System.out.println(studentMarks.get("Tom"));
		
		System.out.println("############################################");
		System.out.println("############################################");
		
		//Same Code that is going to be Executed for "N" Number of Times -- O(n).
		//Time Complexity ==>> O(n) ==>> Linear Equation.
		//1 to 100 or 1000 or 10000.
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		//Formula:
		//We Ignore Constant Values from Formula.
		//1 + n + n + n ==>> 1 + 3n ==>> 3n ==>> n ==>> O(n).
		
		//Time Complexity ==>> O(n) ==>> Linear Equation.
		//Write a Program to Find Largest Number from an Unsorted Array.
		int array[] = {2, 45, 34, 777, 12, 22, 33};
		int maximum = 0;
		for(int i=0; i<array.length; i++)
		{
			if(maximum < array[i])
			{
				maximum = array[i];
			}
		}
		System.out.println("The Maximum Number from the Array is ::: " +maximum);
		
		//1 + n + 1 ==>> 2 + n ==>> n ==>> O(n).
		//Linear Equation ==>> n + 1 Or 2n + 1 Or 3n + 1 Or n.
		
		System.out.println("############################################");
		System.out.println("############################################");
		
		//O(n^2) ==>> Quadratic Equation.
		//n^2 + n + 1.
		//2n^2 + 2n + 3.
		//00 01 02 03.
		//10 11 12 13.
		//20 21 22 23.
		//30 31 32 33.
		
		for(int m=0; m<=7; m++) //1 + m + m ==>> 1 + 2m.
		{
			for(int n=0; n<=7; n++) //1 + n + n ==>> 1 + 2n.
			{
				System.out.print(m+ "" +n + " ");
			}
			System.out.println();
		}
		
		//Quadratic Equation:
		//(1+2m) (1+2n) ==>> 1 + 2n + 2n + 4n^2 ==>> 1 + 4n + 4n^2 ==>> 4n^2 + 4n ==>> 4n^2 + n ==>> n^2.
		//O(n^2) ==>> Quadratic Equation.
		
		//Program to Find Duplicate Integer Values from Array.
		int duplicate[] = {1, 4, 3, 5, 7, 3, 4, 8, 9, 7};
		for(int i=0; i<duplicate.length; i++)
		{
			for(int j=0; j<duplicate.length; j++)
			{
				if(i == j)
					continue;
				if(duplicate[i] == duplicate[j])
				{
					System.out.println(duplicate[i] + " is Duplicate");
				}
			}
		}
		
		System.out.println("############################################");
		System.out.println("############################################");
		
		//Time Complexity ==>> O(n^3).
		//n x n x n ==>> n^3 ==>> O(n^3).
		for(int i=0; i<duplicate.length; i++)
		{
			for(int j=0; j<duplicate.length; j++)
			{
				for(int k=0; k<duplicate.length; k++)
				{
					
				}
			}
		}
		
		System.out.println("############################################");
		System.out.println("############################################");
	}
}
