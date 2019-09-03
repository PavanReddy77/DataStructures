package SortPrograms;

public class BubbleSort 
{
	//Bubble Sort and Quick Sort are types of Exchange Sort.
	//Logic: 
	//Compare Each Value from Unsorted Array
	//Keep Replacing Or Changing Smallest Value in Ascending Order into Sorted Array.
	public static void bubbleSort(int array[])
	{
		int arrayLength= array.length;
		
		for(int i=0; i<arrayLength; i++)
		{
			for(int j=1; j<arrayLength-i; j++)
			{
				if(array[j-1] > array[j])
				{
					//We are now Swapping Elements.
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int array[] = {56, 67, 23, 12, 78, 45};
		
		System.out.println("Before Sorting Array");
		for(int arrayValues : array)
		{
			System.out.print(arrayValues + " ");
		}
		System.out.println();
		
		//Sorting Array using Bubble Sort. 
		bubbleSort(array); 
		
		System.out.println("After Sorting Array");
		for(int arrayValues : array)
		{
			System.out.print(arrayValues + " ");
		}
	}
}
