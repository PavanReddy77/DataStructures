package TimeComplexityOfCode;

public class BinarySearchBigOLogN 
{
	//Binary Search is a Search Algorithm.
	//Binary Search Logic is Applicable only and only for Sorted Array.
	//If Array is not Sorted then we first need to Sort an Array and Write Logic.
	//Binary Search is one of the Best Search Algorithm.
	//O(LogN) ==>> One of the Best Algorithm Time Complexity.
	
	//Time Complexity:
	//Best Case ==>> If Mid Element is 6 ==>> O(1).
	//Average Or Worst Case ==>> O(LogN).
	public static void main(String args[])
	{
		int array[] = {3, 4, 5, 6, 7, 8, 9};
		int lengthOfArray = array.length;
		int x = 7;
		
		int result = binarySearch(array, x, 0, lengthOfArray-1);
		if(result == -1)
		{
			System.out.println("The Element is not Found");
		}
		else
		{
			System.out.println("The Element is Found at Index ::: " +result);
		}
	}
	
	public static int binarySearch(int array[], int x, int low, int high)
	{
		while(low<=high)
		{
			int mid = low + (high - low) / 2;
			
			if(array[mid] == x)
				return mid;
			
			if(array[mid] < x)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
